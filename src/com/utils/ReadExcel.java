package com.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ReadExcel {
    
    /**
     * read the Excel file
     * @param path the path of the Excel file
     * @return
     * @throws IOException
     */
    public boolean readExcel(String path) throws IOException {
        if (path == null || Common.EMPTY.equals(path)) {
            return false;
        } else {
            String postfix = Util.getPostfix(path);
            if (!Common.EMPTY.equals(postfix)) {
                if (Common.OFFICE_EXCEL_2003_POSTFIX.equals(postfix)) {
                     readXls(path);
                     return true;
                } else if (Common.OFFICE_EXCEL_2010_POSTFIX.equals(postfix)) {
                     readXlsx(path);
                     return true;
                }
            } else {
                System.out.println(path + Common.NOT_EXCEL_FILE);
            }
        }
        return false;
    }

    /**
     * Read the Excel 2010
     * @param path the path of the excel file
     * @return
     * @throws IOException
     */
    public List<String[]> readXlsx(String path) throws IOException {
        System.out.println(Common.PROCESSING + path);
       InputStream is = new FileInputStream(path);
  
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
        List<String[]> list =new ArrayList<String[]>();
        String[] strs=null;
        // Read the Sheet
        for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
            if (xssfSheet == null) {
                continue;
            }
            // Read the Row
            for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
                XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                strs =new String[112];
                if (xssfRow != null) {
		            for(int cellNum =xssfRow.getFirstCellNum();cellNum <=xssfRow.getLastCellNum();cellNum++){
						
						XSSFCell cell =xssfRow.getCell(cellNum);

						strs[cellNum]=getValue(cell);
					}
		            list.add(strs);
                }
              
            }
            //System.out.println("this is ok"+xssfSheet.getLastRowNum());
        }
         return list;
    }

    /**
     * Read the Excel 2003-2007
     * @param path the path of the Excel
     * @return
     * @throws IOException
     */
    public void readXls(String path) throws IOException {
        System.out.println(Common.PROCESSING + path);
        InputStream is = new FileInputStream(path);
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);

        for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
            if (hssfSheet == null) {
                continue;
            }
            // Read the Row
            for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                HSSFRow hssfRow = hssfSheet.getRow(rowNum);
                if (hssfRow != null) {
                    for(int cellNum =hssfRow.getFirstCellNum();cellNum <=hssfRow.getLastCellNum();cellNum++){
						
						HSSFCell cell =hssfRow.getCell(cellNum);

						String out =getValue(cell);
					}
                	
                }
            }
            System.out.println("this is ok");
        }
    
    }

	@SuppressWarnings("static-access")
	private String getValue(XSSFCell xssfRow) {
		if(xssfRow==null){
			return "";
		}else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
			return String.valueOf(xssfRow.getBooleanCellValue());
		} else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
			return String.valueOf(xssfRow.getNumericCellValue());
		}else if (xssfRow.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
			 return  "";
		}else {
	
			return String.valueOf(xssfRow.getStringCellValue());	
		}
	}

	@SuppressWarnings("static-access")
	private String getValue(HSSFCell hssfCell) {
		if(hssfCell==null){
			return "";
		}else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
			return String.valueOf(hssfCell.getBooleanCellValue());
		} else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
			return String.valueOf(hssfCell.getNumericCellValue());
		}else if (hssfCell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
			 return  "";
		} else {
			return String.valueOf(hssfCell.getStringCellValue());
		}
	}
	
	 public void readResource(String path) {  
	        long fileLength = 0;  
	        final int BUFFER_SIZE = 0x300000;// 3M的缓冲  
	  
	        //for (String fileDirectory : this.readResourceDirectory())// 得到文件存放路径，我这里使用了一个方法从XML文件中读出文件的  
	        // 存放路径，当然也可以用绝对路径来代替这里的fileDriectory  
	        //{  
	            File file = new File(path);  
	            fileLength = file.length();  
	            try {  
	                MappedByteBuffer inputBuffer = new RandomAccessFile(file, "r")  
	                        .getChannel().map(FileChannel.MapMode.READ_ONLY, 0,  
	                                fileLength);// 读取大文件  
	  
	                byte[] dst = new byte[BUFFER_SIZE];// 每次读出3M的内容  
	  
	                for (int offset = 0; offset < fileLength; offset += BUFFER_SIZE) {  
	                    if (fileLength - offset >= BUFFER_SIZE) {  
	                        for (int i = 0; i < BUFFER_SIZE; i++)  
	                            dst[i] = inputBuffer.get(offset + i);  
	                    } else {  
	                        for (int i = 0; i < fileLength - offset; i++)  
	                            dst[i] = inputBuffer.get(offset + i);  
	                    }  
	         
	                }  
	            } catch (Exception e) {  
	                e.printStackTrace();  
	            }  
	        //}  
	    }  
	
	public static void main(String[] args) {
		String filepath="C:\\Users\\Administrator\\Desktop\\test.xlsx";
		ReadExcel excel =new ReadExcel();
		try {
			excel.readExcel(filepath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
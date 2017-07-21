package com.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

//import jxl.Cell;
//import jxl.Sheet;
//import jxl.Workbook;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtil 
{
//	public static  List<String[]> parseExcle(String xlsfile) 
//			
//	{
//		InputStream is;
//        List<String[]> list = new ArrayList<String[]>();
//		try {
//			is = new FileInputStream(xlsfile);
//			Workbook wb = Workbook.getWorkbook(is);
//			Sheet sheet = wb.getSheet(0);
//			int rowNum, columnNum;
//			rowNum = sheet.getRows();
//			columnNum = sheet.getColumns();
//			
//			for (int i = 0; i < rowNum; i++) {
//				// 得到当前行所有的单元格
//				Cell[] cells = sheet.getRow(i);
//				// 定义数组
//				String[] colArr = new String[columnNum];
//				for (int j = 0; j < columnNum; j++) {
//					// 取得当前单元格内容
//					if(j < cells.length)
//						colArr[j] = cells[j].getContents();	
//					else
//						colArr[j] = null;
//				}
//				list.add(colArr);
//			}
//			wb.close();
//			is.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
//		
//		return list;
//	}
	
	/**
	 * 读取excel中前sheetCount个sheet的内容
	 * @param path
	 * @param sheetCount
	 * @return
	 * @throws Exception
	 */
	public static List<List<String[]>> parseExcelAllSheet(String path, int sheetCount) throws Exception
	{
		String fileType = getFileType(path);
		if(fileType != null)
		{
			List<List<String[]>> listArray = new ArrayList<List<String[]>>();
			for(int i = 0; i < sheetCount ; i ++)
			{
				String ft = fileType.toLowerCase();
				if(ft.equals("xls"))
				{
					listArray.add(parseXls(path, i));
				}else if(ft.equals("xlsx"))
				{
					listArray.add(parseXlsx(path, i));
				}
			}
			return listArray;
		}
		return null;
	}
	
	/**
	 * 读取excel中某个sheet的内容
	 * @param path
	 * @param sheetIndex
	 * @return
	 * @throws Exception
	 */
	public static List<String[]> parseExcel(String path, int sheetIndex) throws Exception
	{
		String fileType = getFileType(path);
		if(fileType != null)
		{
			String ft = fileType.toLowerCase();
			if(ft.equals("xls"))
			{
				return parseXls(path, sheetIndex);
			}else if(ft.equals("xlsx"))
			{
				return parseXlsx(path, sheetIndex);
			}
		}
		return null;
	}
	
	/**
	 * 读取excel中第一个sheet的内容
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public static List<String[]> parseExcel(String path) throws Exception
	{
		String fileType = getFileType(path);
		int sheetIndex = 0;
		if(fileType != null)
		{
			String ft = fileType.toLowerCase();
			if(ft.equals("xls"))
			{
				return parseXls(path, sheetIndex);
			}else if(ft.equals("xlsx"))
			{
				return parseXlsx(path, sheetIndex);
			}
		}
		return null;
	}
	
	public static List<String[]> parseXlsx(String path, int sheetIndex) throws Exception 
	{
		List<String[]> list = new ArrayList<String[]>();
		try
		{
			XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(path));  
			XSSFSheet sheet = workbook.getSheetAt(sheetIndex);  
			int rows = sheet.getLastRowNum();
			int cells0 = 0;
			for(int i = 1 ; i <= rows ; i ++)
			{
				XSSFRow row = sheet.getRow(i);  
				if(row != null)
				{
					int cells = row.getLastCellNum();
					if( cells0 < cells)
						cells0 = cells;
					String[] colArr = new String[cells0];
					
					for(int j = 0 ; j < cells ; j ++)
					{
						XSSFCell cell = row.getCell(j);
						if(cell != null)
						{
							if(cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
							{
								colArr[j] = cell.getStringCellValue();
							}else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
							{
								if (HSSFDateUtil.isCellDateFormatted(cell)) {
							        double d = cell.getNumericCellValue();
							        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
							        colArr[j] = sdf.format(HSSFDateUtil.getJavaDate(d)).toString();
							    }else{
									double d = cell.getNumericCellValue();
									String x = d + "";
									try{
										if(d % 1 == 0)
											x = (int)d + "";
									}catch(Exception e){
									}
									colArr[j] = x;
							    }
							}else if(cell.getCellType() == XSSFCell.CELL_TYPE_BLANK)
							{
								colArr[j] = "";
							}else if(cell.getCellType() == XSSFCell.CELL_TYPE_ERROR)
							{
								colArr[j] = "";
							}else if(cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN)
							{
								colArr[j] = cell.getBooleanCellValue() + "";
							}else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
							{
								colArr[j] = cell.getNumericCellValue() + "";
							}
							else if(cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA)
							{
								colArr[j] = cell.getCellFormula();
							}
							

						}else{
							colArr[j] = null;
						}
					}
					list.add(colArr);
				}
			}  
		}catch(Exception e) {  
			throw new Exception(e);
		}  
		return list;
	}

	public static String getFileType(String path) 
	{
		if(path != null)
		{
			int index = path.lastIndexOf(".");
			if(index > 0 && (index+1) < path.length())
			{
				return path.substring(index+1);
			}
		}
		return null;
	}

	public static List<String[]> parseXls(String path, int sheetIndex) throws Exception
	{
		List<String[]> list = new ArrayList<String[]>();
		try
		{
			HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(path));  
			HSSFSheet sheet = workbook.getSheetAt(sheetIndex);  
			int rows = sheet.getLastRowNum();
			int cells0 = 0;
			for(int i = 0 ; i <= rows ; i ++)
			{
				HSSFRow row = sheet.getRow(i);  
				if(row != null)
				{
					int cells = row.getLastCellNum();
					if( cells0 < cells)
					{
						cells0 = cells;
					}
					String[] colArr = new String[cells0];
					for(int j = 0 ; j < cells ; j ++)
					{
						HSSFCell cell = row.getCell(j);
						if(cell != null)
						{
							if(cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
							{
								colArr[j] = cell.getStringCellValue();
							}else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
							{
								if (HSSFDateUtil.isCellDateFormatted(cell)) {
							        double d = cell.getNumericCellValue();
							        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
							        colArr[j] = sdf.format(HSSFDateUtil.getJavaDate(d)).toString();
							    }else{
									double d = cell.getNumericCellValue();
									String x = d + "";
									try{
										if(d % 1 == 0)
											x = (int)d + "";
									}catch(Exception e){
									}
									colArr[j] = x;
							    }
							}else if(cell.getCellType() == XSSFCell.CELL_TYPE_BLANK)
							{
								colArr[j] = null;
//								colArr[j] = "";
							}else if(cell.getCellType() == XSSFCell.CELL_TYPE_ERROR)
							{
								colArr[j] = null;
//								colArr[j] = "";
							}else if(cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN)
							{
								colArr[j] = cell.getBooleanCellValue() + "";
							}else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
							{
								colArr[j] = cell.getNumericCellValue() + "";
							}
							else if(cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA)
							{
								colArr[j] = cell.getCellFormula();
							}
						}else{
							colArr[j] = null;
						}
					}
					list.add(colArr);
				}
			}  
		}catch(Exception e) {  
			throw new Exception(e);
		}  
		return list;
	}
	
	
	public static void writeExcel(String path, List<String[]> list) throws Exception
	{
		String fileType = getFileType(path);
		if(fileType != null)
		{
			String ft = fileType.toLowerCase();
			if(ft.equals("xls"))
			{
				writeXls(path, list);
			}else if(ft.equals("xlsx"))
			{
				writeXlsx(path, list);
			}
		}
	}
	
	
	
	
	public static void writeXlsx(String path, List<String[]> list) throws Exception
	{
		try
		{
			XSSFWorkbook workbook = new XSSFWorkbook();  
			XSSFSheet sheet = workbook.createSheet();
			for(int i = 0; i < list.size(); i ++)
			{
				String[] cols = list.get(i);
				XSSFRow row = sheet.createRow(i);
				for(int j = 0; j < cols.length; j ++)
				{
					XSSFCell cell = row.createCell(j);  
					cell.setCellType(HSSFCell.CELL_TYPE_STRING);  
					cell.setCellValue(cols[j] == null ? "" : cols[j]);  
				}
			}
			File file = new File(path);
			if(!file.exists())
			{
				file.createNewFile();
			}
			FileOutputStream fOut = new FileOutputStream(file);  
			workbook.write(fOut);  
			fOut.flush();  
			fOut.close();  
		}catch(Exception e) {  
			throw new Exception(e);
		} 
	}
	
	/**
	 * 导出的execl有两个sheet
	 * @param path
	 * @param lists
	 * @param sheetNames
	 * @return
	 * @throws Exception
	 */
	public static File writeAllXls(String path, List<List<String[]>> lists,String[] sheetNames) throws Exception
	{
		try
		{
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet1 = workbook.createSheet(sheetNames[0]);
			XSSFSheet sheet2 = workbook.createSheet(sheetNames[1]);
			for(int k=0;k<lists.size();k++){
				List<String[]> list=lists.get(0);
				
				for(int i = 0; i < list.size(); i ++)
				{
					String[] cols = list.get(i);
					XSSFRow row = sheet1.createRow(i);
					for(int j = 0; j < cols.length; j ++)
					{
						XSSFCell cell = row.createCell(j);  
						cell.setCellType(HSSFCell.CELL_TYPE_STRING);  
						cell.setCellValue(cols[j] == null ? "" : cols[j]);  
					}
				}
				
				List<String[]> list2=lists.get(1);
				
				for(int i = 0; i < list2.size(); i ++)
				{
					String[] cols = list2.get(i);
					XSSFRow row = sheet2.createRow(i);
					for(int j = 0; j < cols.length; j ++)
					{
						XSSFCell cell = row.createCell(j);  
						cell.setCellType(HSSFCell.CELL_TYPE_STRING);  
						cell.setCellValue(cols[j] == null ? "" : cols[j]);  
					}
				}
				
			}
			
			File file = new File(path);
			if(!file.exists())
			{
				file.createNewFile();
			}
			FileOutputStream fOut = new FileOutputStream(file);  
			workbook.write(fOut);  
			fOut.flush();  
			fOut.close();  
			return file;
		}catch(Exception e) 
		{  
			throw new Exception(e);
		} 
	}
	
	public static File writeXls(String path, List<String[]> list) throws Exception
	{
		try
		{
			HSSFWorkbook workbook = new HSSFWorkbook();  
			HSSFSheet sheet = workbook.createSheet();
			for(int i = 0; i < list.size(); i ++)
			{
				String[] cols = list.get(i);
				HSSFRow row = sheet.createRow(i);
				for(int j = 0; j < cols.length; j ++)
				{
					HSSFCell cell = row.createCell(j);  
					cell.setCellType(HSSFCell.CELL_TYPE_STRING);  
					cell.setCellValue(cols[j] == null ? "" : cols[j]);  
				}
			}
			File file = new File(path);
			if(!file.exists())
			{
				file.createNewFile();
			}
			FileOutputStream fOut = new FileOutputStream(file);  
			workbook.write(fOut);  
			fOut.flush();  
			fOut.close();  
			return file;
		}catch(Exception e) {  
			throw new Exception(e);
		}  
	}
}

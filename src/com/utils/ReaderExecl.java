package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReaderExecl {

	private XSSFWorkbook workbook=null;
	
	private InputStream is =null;
	private XSSFRow row;
	
	private String cell;
	
	//读取execl文件
	public  void  Reader(String filepath){
		
		try {
			
	    is =new FileInputStream(filepath);
		 
		workbook =new XSSFWorkbook(is);
			
		//int sheetTotal = workbook.getNumberOfSheets();
		//获取sheet
	    XSSFSheet sheet =workbook.getSheetAt(0);
		
		for(int i=sheet.getFirstRowNum();i<20;i++){
			
			row =sheet.getRow(i);
			
			for(int j=row.getFirstCellNum();j<row.getLastCellNum();j++){
				
				cell =row.getCell(j).toString();
				System.out.print("cell"+cell+"\t");
			}
			System.out.println("");
		}	
			
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

		
		
}

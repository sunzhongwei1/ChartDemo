package com.test;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.utils.ExcelUtil;
import com.utils.ReadExcel;
import com.utils.ReaderExecl;

public class ReaderExeclTest {
	
	//@Test
	public void  read() throws IOException{
		String filepath="C:\\Users\\Administrator\\Desktop\\test.xlsx";
		
		String path="F:\\Excel2010\\Excel2010\\lib\\test.xlsx";
		ExcelUtil execl =new ExcelUtil();
		try {
			
			List<String[]>	list=execl.parseExcel(filepath);
		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

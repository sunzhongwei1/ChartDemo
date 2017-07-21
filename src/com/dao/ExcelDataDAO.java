package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.ExcelDataDto;

public interface ExcelDataDAO {

	public void save(ExcelDataDto excelData);
	
	public  List<ExcelDataDto> findAll();
	
	public  List<String> findResultsDetermin();
	
	public  List<String> findProvincial();
	
	public int getCount(String resultsDetermine,String provincial);
	
	public List<Map<String,String>>  getCount(List list,List list2);
}

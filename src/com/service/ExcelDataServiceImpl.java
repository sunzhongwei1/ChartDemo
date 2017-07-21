package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ExcelDataDAO;
import com.entity.ExcelDataDto;

@Service
public class ExcelDataServiceImpl implements ExcelDataService {

	@Autowired
	private ExcelDataDAO dataDAO;
	@Override
	public void save(ExcelDataDto excelData) {
		dataDAO.save(excelData);
       
	}
	@Override
	public List<ExcelDataDto> findAll() {
		
		return dataDAO.findAll();
	}
	@Override
	public List<String> findResultsDetermin() {
		
		return dataDAO.findResultsDetermin();
	}
	@Override
	public List<String> findProvincial() {
		
		return dataDAO.findProvincial();
	}
	@Override
	public int getCount(String resultsDetermine, String provincial) {

		return dataDAO.getCount(resultsDetermine, provincial);
	}
	@Override
	public List<Map<String, String>> getCount(List list, List list2) {
		// TODO Auto-generated method stub
		return dataDAO.getCount(list, list2);
	}

}

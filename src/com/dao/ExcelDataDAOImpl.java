package com.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.entity.ExcelDataDto;

@Repository
public class ExcelDataDAOImpl extends SqlSessionDaoSupport  implements ExcelDataDAO {

	String ns = "com.entity.ExcelDataDtoMapper.";
	@Override
	public void save(ExcelDataDto excelData) {
		
		this.getSqlSession().insert(ns+"insertExcelData", excelData);
	}
	@Override
	public List<ExcelDataDto> findAll() {

		return this.getSqlSession().selectList(ns+"selectAll");
	}
	@Override
	public List<String> findResultsDetermin() {

		return this.getSqlSession().selectList(ns+"selectResultsDetermin");
	}
	@Override
	public List<String> findProvincial() {
		
		return this.getSqlSession().selectList(ns+"selectResultsProvincial");
	}
	@Override
	public int getCount(String resultsDetermine, String provincial) {
		
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("resultsDetermine", resultsDetermine);
		map.put("provincial", provincial);
		return this.getSqlSession().selectOne(ns+"selectCount",map);
	}
	@Override
	public List<Map<String, String>> getCount(List list, List list2) {
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("resultsDetermine", list);
		map.put("provincial", list2);
		return this.getSqlSession().selectOne(ns+"selectCountByList",map);
	}
	

	
}

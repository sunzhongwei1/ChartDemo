package com.controller;

import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.ChartData;
import com.entity.ExcelDataDto;
import com.entity.SeriesData;
import com.service.ExcelDataService;
import com.utils.DataToSql;
import com.utils.ExcelUtil;

@Controller
@RequestMapping("/demoECharts")
public class DemoEChartsController {

	private ExcelDataDto dto;
	@Autowired
	private ExcelDataService dataService;

	@RequestMapping("/initScript.do")
	public void initScript(HttpServletRequest request,
			HttpServletResponse response, PrintWriter printWriter)
			throws ParseException {

		// List<String[]> strs = getExcelData();
         String path="C:\\Users\\Administrator\\Desktop\\测试.xlsx";
		try {
			switchData(path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@RequestMapping("/initECharts.do")
	    public void initECharts(HttpServletRequest request, HttpServletResponse response, PrintWriter printWriter) throws ParseException {

	   //  List<ExcelDataDto>	dataDtos =dataService.findAll();
         List<String> resultsDetermineList =dataService.findResultsDetermin(); //5个
         List<String> provincialList =dataService.findProvincial(); //24个
	      //不合格 ，24个省
         Map<String,SeriesData> SeriesDataMap =new  HashMap<String,SeriesData>(); //需要4个 不合格，合格等
         ChartData chartData =null; 
        List<ChartData> list =null;  
        SeriesData seriesData =null;
        for(int j=0;j<resultsDetermineList.size();j++){
        	 seriesData =new SeriesData();
        	list =new ArrayList<ChartData>(); //不合格信息 
        	String resultsDetermine = resultsDetermineList.get(j); //获取不合格
        //List<Map<String,String>> listMap =new ArrayList<Map<String,String>>();
        
        List<Map<String,String>> listMap =  dataService.getCount(resultsDetermineList, provincialList);
         for(int i=0;i<provincialList.size();i++){
        	  chartData =new ChartData(); //省份 值
        	 String provincialName = provincialList.get(i);
        	 int count =dataService.getCount(resultsDetermine,provincialName);//查数据 count
        	 chartData.setName(provincialName);
        	 chartData.setValue(count+"");
        	 
          }
          list.add(chartData); //{省份：数据}
          seriesData.setData(list);
          SeriesDataMap.put(resultsDetermine,seriesData);
        }
        
	     Map<String,Object> data = new HashMap<String,Object>();
         data.put("resultsDetermineList", resultsDetermineList);
         data.put("provincialList", provincialList);
         data.put("ObjectList", SeriesDataMap);
         String json = JSONObject.fromObject(data).toString();
         
         printWriter.write(json);
	     
         
	    }	
	// 把execl数据保存到数据库中
	public void switchData(String filepath) throws Exception {
		List<String[]> list = ExcelUtil.parseExcel(filepath);
		if (list.size() > 0) {

			for (int i = 0; i < list.size(); i++) {
				// row数据
				String[] strs = list.get(i);
				// strs=new String[120];
				dto = DataToSql.switchDataToSql(strs);
				dataService.save(dto);
			}
		}

	}

}

package com.controller;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


@Controller
@RequestMapping("/eCharts")
public class EChartsController {

	


    @RequestMapping("/initScript.do")
    public void initScript(HttpServletRequest request, HttpServletResponse response, PrintWriter printWriter) throws ParseException {
       // List<TimeLine> list = timeLineService.findAll();
        List<String[]> script = new ArrayList<String[]>();
//        for (TimeLine timeLine:list) {
//            String [] arr = new String[2];
//            arr[0] = timeLine.getId();
//            arr[1] = timeLine.getScriptName();
//            script.add(arr);
//        }
        String json = JSONArray.fromObject(script).toString();
        printWriter.write(json);
    }

    @RequestMapping("/initECharts.do")
    public void initCourse(HttpServletRequest request, HttpServletResponse response, PrintWriter printWriter) throws ParseException {

//        Sort sort = new Sort(Arrays.asList(new Sort.Order(Sort.Direction.DESC, "created"))); //根据创建时间倒序排序。
//        Map<String, Object> searchParams = Servlets.getParametersStartingWith(request, "search_");
//        String timeLineID = "";
//        if(StringUtils.isBlank((String)searchParams.get("EQ_timeLineID"))){
//            timeLineID = "359c79bd04d5464a862852147d01eede";
//        }else {
//            timeLineID =  (String)searchParams.get("EQ_timeLineID");
//        }
//        List<Object[]> SecondOccupationNameList = timeLineDataService.findSecondOccupationNameByTimeLineID(timeLineID);
//        searchParams.remove("EQ_timeLineID");
//        searchParams.put("NotEQ_fOccupationCode","");
//        searchParams.put("NotEQ_fOccupationCode","");
//        List<Course> courseList ;
//        if(StringUtils.isBlank((String) searchParams.get("GT_created"))){
//            System.out.println(searchParams.get("GT_created"));
//            //Page<Course> coursesPage = courseService.queryContion(searchParams,sort);
//            //courseList = coursesPage.getContent();
//            courseList = courseService.queryConditonNoPage(searchParams,sort);
//
//        }else{
//            courseList = courseService.queryConditonNoPage(searchParams,sort);
//        }
//        List<Course> NewCourseList = new ArrayList<>();
//        for (Course course : courseList) {
//            Map<String,Object> commentParams = new HashMap<>();
//            commentParams.put("EQ_courseName",course.getCourseName());
//            commentParams.put("EQ_commentState","0");
//            List<Comment> comments = commentService.queryConditonNoPage(commentParams);
//            if(comments!= null && comments.size()>0){
//            }else {
//                if(StringUtils.isBlank((String) searchParams.get("GT_created"))&&NewCourseList.size()>=10){
//                    break;
//                }
//                NewCourseList.add(course);
//            }
//        }
//        List<String> secondOccupationList = new ArrayList<>();
//        List<String> courseNameList = new ArrayList<>();
//        List<List<SeriesData>> ObjectList = new ArrayList<>();
//        for (Course course : NewCourseList) {
//            courseNameList.add(course.getCourseName());
//        }
//        for (Object[] secondOccupationArr : SecondOccupationNameList) {
//            secondOccupationList.add((String) secondOccupationArr[0]);
//            List<SeriesData> list = new ArrayList<>();
//            List<ChartData> sumList = new ArrayList<>();
//            List<ChartData> operationSumList = new ArrayList<>();
//            List<ChartData> selectSumList = new ArrayList<>();
//            List<ChartData> audioSumList = new ArrayList<>();
//            int audioAllSum = 0;
//            int selectAllSum = 0;
//            int operationAllSum = 0;
//            for (Course course : NewCourseList) {
//                Integer sum = commentService.sumByCrouseNameAndSecondOccupationCode(course.getCourseName(), (String) secondOccupationArr[1]);
//                Integer operationSum = commentService.sumByCrouseNameAndSecondOccupationCodeAndQuestionType(course.getCourseName(), (String) secondOccupationArr[1], "operation");
//                Integer selectSum = commentService.sumByCrouseNameAndSecondOccupationCodeAndQuestionType(course.getCourseName(), (String) secondOccupationArr[1], "select");
//                Integer audioSum = commentService.sumByCrouseNameAndSecondOccupationCodeAndQuestionType(course.getCourseName(), (String) secondOccupationArr[1], "audio");
//                sum = sum == null?0:sum;
//                operationSum = operationSum == null?0:operationSum;
//                selectSum = selectSum == null?0:selectSum;
//                audioSum = audioSum == null?0:audioSum;
//                ChartData chartData = new ChartData();
//                chartData.setName(course.getCourseName());
//                chartData.setValue(sum+"");
//                sumList.add(chartData);
//                chartData = new ChartData();
//                chartData.setName(course.getCourseName());
//                chartData.setValue(operationSum+"");
//                operationSumList.add(chartData);
//                chartData = new ChartData();
//                chartData.setName(course.getCourseName());
//                chartData.setValue(selectSum+"");
//                selectSumList.add(chartData);
//                chartData = new ChartData();
//                chartData.setName(course.getCourseName());
//                chartData.setValue(audioSum+"");
//                audioSumList.add(chartData);
//                audioAllSum = audioAllSum + audioSum;
//                selectAllSum = selectAllSum + selectSum;
//                operationAllSum = operationAllSum + operationSum;
//            }
//
//            ChartData audioChartData = new ChartData();
//            audioChartData.setName("语音题");
//            audioChartData.setValue(audioAllSum+"");
//            ChartData selectChartData = new ChartData();
//            selectChartData.setName("选择题");
//            selectChartData.setValue(selectAllSum+"");
//            ChartData operationChartData = new ChartData();
//            operationChartData.setName("操作题");
//            operationChartData.setValue(operationAllSum+"");
//            List<ChartData> pieList = new ArrayList<>();
//            pieList.add(audioChartData);
//            pieList.add(selectChartData);
//            pieList.add(operationChartData);
//            SeriesData pieData = new SeriesData();
//            pieData.setData(pieList);
//            SeriesData sumseriesData = new SeriesData();
//            sumseriesData.setData(sumList);
//            SeriesData operationseriesData = new SeriesData();
//            operationseriesData.setData(operationSumList);
//            SeriesData  selectseriesData = new SeriesData();
//            selectseriesData.setData(selectSumList);
//            SeriesData audioseriesData = new SeriesData();
//            audioseriesData.setData(audioSumList);
//            list.add(sumseriesData);
//            list.add(audioseriesData);
//            list.add(selectseriesData);
//            list.add(operationseriesData);
//            list.add(pieData);
//            ObjectList.add(list);
//        }
        Map<String,Object> data = new HashMap<String,Object>();
//        data.put("SecondOccupationNameList", secondOccupationList);
//        data.put("courseNameList", courseNameList);
//        data.put("ObjectList", ObjectList);
        String json = JSONObject.fromObject(data).toString();
        printWriter.write(json);
    }

     public void  gettaskSource(){
 		
    	 
 		
     }

}

<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
<title>统计分析</title>
<link
	href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="${pageContext.request.contextPath}/assets/css/style.min.css"
	rel="stylesheet" />
<script
	src="${pageContext.request.contextPath}/assets/js/jquery-2.1.1.min.js"></script>
<script
	src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/core.min.js"></script>
<script src="${pageContext.request.contextPath}/sea.js"></script>
<script
	src="${pageContext.request.contextPath}/assets/plugins/My97DatePicker/WdatePicker.js"></script>
<script src="echarts.min.js"></script>
<%
        String path = request.getContextPath();
    %>
<script type="text/javascript">
        var path = "<%=path%>";
    </script>
</head>
<body>
	<%--class="sidebar-hide"--%>

	<div class="container-fluid content">
		<div class="row">

			<!-- start: 菜单-->
			<div class="sidebar ">

				<div class="sidebar-collapse">
					<div class="sidebar-header t-center"></div>
					<div class="sidebar-menu">
						<ul class="nav nav-sidebar">
							<li><a href="#"><i class="glyphicon glyphicon-signal"></i><span
									class="text"> 统计查询</span><span
									class="glyphicon glyphicon-chevron-down pull-right"></span></a>
								<ul class="nav sub">
									<li><a href="DemoECharts.jsp"><i
											class="glyphicon glyphicon-signal"></i><span class="text">按结果统计</span></a></li>


								</ul></li>

						</ul>
					</div>
				</div>
				<div class="sidebar-footer"></div>

			</div>
			<!-- end: 菜单 -->


			<!-- start: 主体内容 -->
			<div class="main">

				<div class="row">
					<div class="col-lg-12">
						<div class="panel panel-default">
							<div class="panel-heading">
								<a href="DemoECharts.jsp#" id="main-menu-toggle"> <i
									class="glyphicon glyphicon-signal red"></i><strong>按结果统计</strong>
								</a>
								<div class="panel-actions">
									<a href="#" class="btn-minimize"><i
										class="fa fa-angle-down pull-right"></i></a>
								</div>
							</div>
							<div class="panel-body" style="height:860px;">

								<br> <br>
								<div class="row">
									<div class="col-lg-1" style="width:5%;">&nbsp;</div>
									<div id="barTest" class="col-lg-10"
										style="width: 90%;height:700px; "></div>
									<div class="col-lg-1" style="width:5%;">&nbsp;</div>
								</div>
								<script type="text/javascript">
								
									$(document).ready(function(){ 
									  initECharts();
									}); 
									
                                // 基于准备好的dom，初始化echarts实例
                                var barTestChart = echarts.init(document.getElementById('barTest'));


                                /*data1:不合格等项，data2：要统计的数据*/
                                function initData(data1, data2) {
                                    var chartdata = new Array();
                                    for (var i = 0; i < data1.length; i++) {
                                        var obj = {};
                                        var title = {};
                                        title['text'] = data1[i];
                                        obj['title'] = title;
                                        var seriesArr = new Array();
                                        obj['series'] = data2[i];
                                        chartdata[i] = obj
                                    }
                                    return chartdata;
                                }

                      
                              function initECharts() {      
                                $.ajax({
                                url: path + "/demoECharts/initECharts.do",
                                async:false,
                                success: function(data) {
                                         alert(1111111)
                                        var data = eval("(" + data + ")");
                                        
                                        var resultsDetermineList = data.resultsDetermineList;
                                        var ObjectList = data.ObjectList;
                                        var provincialList = data.provincialList;
                                         //初始化数据
                                        var chartdata = initData(resultsDetermineList, ObjectList);
                                         alert(resultsDetermineList)
                                         alert(JSON.stringify(ObjectList))
                                         alert(provincialList)    
                                            option = {
                                            baseOption: {
                                                timeline: {
                                                    axisType: 'category',
                                                    autoPlay: true,
                                                    playInterval: 3000,
                                                    data: resultsDetermineList,
                                                    //symbolSize:[10,10]
                                                },
                                                toolbox: {
                                                    feature: {
                                                        dataView: {show: true, readOnly: false},
                                                            saveAsImage: {show: true}
                                                    }
                                                },
                                                title: {
                                                    subtext: ''
                                                },
                                                tooltip: {},
                                                legend: {
                                                    x: 'center',
                                                    itemWidth:30,
                                                    itemHeight:20,
                                                    data: ['不合格项','不判定项','合格项','未检验','问题项']//, '语音题', '选择题', '操作题','综合'
                                                },
                                                calculable: true,
                                                grid: {
                                                    top: 80,
                                                    bottom: 100
                                                },
                                                xAxis: [
                                                    {
                                                        'type': 'category',
                                                        'axisLabel': {'interval': 0},
                                                        'data': provincialList,
                                                        splitLine: {show: false}
                                                    }
                                                ],
                                                yAxis: [
                                                    {
                                                        type: 'value',
                                                        name: '分数',
                                                        // max: 53500
                                                        max: 100
                                                    }
                                                ],
                                                series: [
                                                    {name: '不合格项', type: 'bar'},
                                                    {name: '不判定项', type: 'bar'},
                                                    {name: '合格项', type: 'bar'},
                                                    {name: '未检验', type: 'bar'},
                                                    {name: '问题项', type: 'bar'}
                                                  
                                                ]
                                            }, options: chartdata
                                        }
                      
                                        barTestChart.setOption(option);

                                }
                            });
                            
                            }
                 
                           
                           

                            </script>
							</div>
						</div>
					</div>
				</div>


			</div>
		</div>
	</div>

</body>
</html>


<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<html>
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
									<li><a href="FirstECharts.jsp"><i
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
								<a href="ECharts.jsp#" id="main-menu-toggle"> <i
									class="glyphicon glyphicon-signal red"></i><strong>结果判定</strong>
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
             
                                // 基于准备好的dom，初始化echarts实例
                                var barAndPieTestChart = echarts.init(document.getElementById('barTest'));
                                
                                var  option = {
                                title : {
						        text: '结果判定',
						       // subtext: '纯属虚构'
								    },
								    tooltip : {
								        trigger: 'axis'
								    },
								    legend: {
								        data:['不合格项','不判定项','合格项','未检验','问题项']
								    },
								    toolbox: {
								        show : true,
								        feature : {
								            mark : {show: true},
								            dataView : {show: true, readOnly: false},
								            magicType : {show: true, type: ['line', 'bar']},
								            restore : {show: true},
								            saveAsImage : {show: true}
								        }
								    },
								    calculable : true,
								    xAxis : [
								        {
								            type : 'category',
								            show:true,
								            axisLable:{interval:0,ratate:60,formatter:function(val){return val.split("").join("\n");}},
								            data : ['吉林','上海','湖南','广东','黑龙江','湖北','福建','贵州','宁夏','陕西','山东','重庆','江西','安徽','辽宁','北京','河北','山西','浙江','天津','河南','甘肃','内蒙古','江苏']
								        }
								    ],
								    yAxis : [
								        {
								            type : 'value'
								        }
								    ],
								    series : [
								        {
								            name:'不合格项',
								            type:'bar',
								            data:[0,0,0,27,8,0,3,0,0,14,4,0,3,2,3,5,0,0,0,0],
								            markPoint : {
								                data : [
								                    {type : 'max', name: '最大值'},
								                    {type : 'min', name: '最小值'}
								                ]
								            },
								            markLine : {
								                data : [
								                    {type : 'average', name: '平均值'}
								                ]
								             }
								           },
								              {
								            name:'不判定项',
								            type:'bar',
								            data:[465,215,1916,630,1134,242,1348,50,123,1077,1183,140,930,339,92,207,121,34,53,53],
								            markPoint : {
								                data : [
								                    {type : 'max', name: '最大值'},
								                    {type : 'min', name: '最小值'}
								                ]
								            },
								            markLine : {
								                data : [
								                    {type : 'average', name: '平均值'}
								                ]
								            }
								        },
								              {
								            name:'合格项',
								            type:'bar',
								            data:[1341,575,5479,1554,3092,588,3758,94,345,3115,3364,316,2066,900,252,511,327,98,146,149],
								            markPoint : {
								                data : [
								                    {type : 'max', name: '最大值'},
								                    {type : 'min', name: '最小值'}
								                ]
								            },
								            markLine : {
								                data : [
								                    {type : 'average', name: '平均值'}
								                ]
								            }
								        },
								              {
								            name:'未检验',
								            type:'bar',
								            data:[89,31,245,140,265,68,319,8,25,178,170,72,307,112,20,57,33,2,14,11],
								            markPoint : {
								                data : [
								                    {type : 'max', name: '最大值'},
								                    {type : 'min', name: '最小值'}
								                ]
								            },
								            markLine : {
								                data : [
								                    {type : 'average', name: '平均值'}
								                ]
								            }
								        },
								              {
								            name:'问题项',
								            type:'bar',
								            data:[1,0,0,3,6,0,0,1,0,4,0,0,0,0,0,0,0,0,0,0],
								            markPoint : {
								                data : [
								                    {type : 'max', name: '最大值'},
								                    {type : 'min', name: '最小值'}
								                ]
								            },
								            markLine : {
								                data : [
								                    {type : 'average', name: '平均值'}
								                ]
								            }
								        }
								    ]
                                
                                };
            
   
                                 barAndPieTestChart.setOption(option);

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


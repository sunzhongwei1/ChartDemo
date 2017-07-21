<%--
  Created by IntelliJ IDEA.
  User: lzf
  Date: 2016/6/17
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>考题分析</title>
    <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/assets/css/style.min.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/jsp/comment/css/bootstrap-table.min.css" rel="stylesheet"/>
    <script src="${pageContext.request.contextPath}/assets/js/jquery-2.1.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/core.min.js"></script>
    <script src="${pageContext.request.contextPath}/jsp/comment/js/bootstrap-table.min.js"></script>
    <script src="${pageContext.request.contextPath}/sea.js"></script>
    <%
        String path = request.getContextPath();
    %>
    <script type="text/javascript">
        var path = "<%=path%>";

    </script>
</head>
<body>
<div class="container-fluid content">
    <div class="row">
        <!-- start: 菜单-->
        <div class="sidebar ">
            <div class="sidebar-collapse">
                <div class="sidebar-header t-center">
                </div>
                <div class="sidebar-menu">
                    <ul class="nav nav-sidebar">
                        <li><a href="#"><i class="glyphicon glyphicon-signal"></i><span class="text"> 统计查询</span><span
                                class="glyphicon glyphicon-chevron-down pull-right"></span></a>
                            <ul class="nav sub">
                                <li><a href="ECharts.jsp"><i class="glyphicon glyphicon-signal"></i><span
                                        class="text">按角色统计</span></a></li>
                                <li><a href="questionReport.jsp"><i class="glyphicon glyphicon-signal"></i><span
                                    class="text">考题分析</span></a></li>

                            </ul>
                        </li>

                    </ul>
                </div>
            </div>
            <div class="sidebar-footer">

            </div>

        </div>
        <!-- end: 菜单 -->
        <!-- start: 主体内容 -->
        <div class="main">
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <a href="questionReport.jsp#" id="main-menu-toggle">
                                <i class="glyphicon glyphicon-signal red"></i><strong>考题分析</strong>
                            </a>
                            <div class="panel-actions">
                                <a href="#" class="btn-minimize"><i class="fa fa-angle-down pull-right"></i></a>
                            </div>
                        </div>
                        <div class="panel-body" style="height:860px;">
                            <div class="row">
                                <div class="col-lg-2" style="width:10%;"></div>
                                <div class="form-inline col-lg-9" id="serachPamars">
                                    <div class="form-group">
                                        <span>考题类型：</span>
                                        <select class="form-control" name="search_EQ_subType" id="SearchSubType" SerachCondition>
                                            <option value="">请选择...</option>
                                            <option id='2D_select_ss' value='2D_select_ss'>2D单选题</option>
                                            <option id='2D_select_ms' value='2D_select_ms'>2D多选题</option>
                                            <option id='3D_select_ss' value='3D_select_ss'>3D单选题</option>
                                            <option id='3D_select_ms' value='3D_select_ms'>3D多选题</option>
                                            <option id='match' value='match'>连线题</option>
                                            <option id='order' value='order'>排序题</option>
                                            <option id='2D3D_alternately' value='2D3D_alternately'>2D3D交互题</option>
                                            <option id='audio_audio' value='audio_audio'>语音题</option>
                                            <option id='audio_answer' value='audio_answer'>回复题</option>
                                        </select>
                                    </div>
                                    &nbsp;
                                    <div class="form-group" style="width: 50%">
                                        <span>题干：</span>
                                        <input type="text" style="width: 80%" id="SearchQuestionContent" SerachCondition name="search_LIKE_questionContent" class="form-control">
                                    </div>

                                    &nbsp;
                                    <button type="button" id="search" name="c" id="111" tableID='table'
                                            class="btn btn-primary search">查询
                                    </button>
                                    &nbsp;
                                    <button type="button" id="rests" name="rests"
                                            class="btn btn-primary">重置
                                    </button>
                                </div>
                                <div class="col-lg-1"  style="width:10%;"></div>
                            </div>
                            <br>
                            <br>
                            <div class="row" >
                                <table id="questionReportTable"   data-height="720" class="table table-bordered"></table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">

    seajs.use('ECharts/questionReport');
</script>
</html>

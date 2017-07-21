define(function (require) {
    var BootStrapTableBase = require('assets/myPlugins/bootStrap/BootStrapTableBase');
    var BootStrapFrom = require('assets/myPlugins/bootStrap/BootStrapFrom');
    var BootStrapCore = require('assets/myPlugins/bootStrap/BootStrapCore');

    var initTable = function (data) {
        $('#questionReportTable').bootstrapTable("destroy");
        $("#questionReportTable").bootstrapTable({
            columns: [
                {

                    field: 'subTypeName',
                    align: "center",
                    title: '考题类型',
                    width: '8%'
                }, {
                    field: 'questionCode',
                    align: "center",
                    title: '考题编码',
                    width: '5%',
                    formatter: function operateFormatter(value, row,
                                                         index) {
                        var url = "<a href='javascript:void(0)'>" + value + "</a>"
                        return url;
                    }
                }, {

                    field: 'questionContent',
                    halign: "center",
                    title: '题干',
                    width: '20%'
                }, {

                    field: 'checkAbilityName',
                    align: "center",
                    title: '考核能力',
                    width: '10%'
                }, {

                    field: 'minGrade',
                    align: "center",
                    title: '最低分',
                    width: '5%'
                }, {

                    field: 'maxGrade',
                    align: "center",
                    width: '5%',
                    title: '最高分'
                }, {

                    field: 'avgGrade',
                    align: "center",
                    width: '5%',
                    title: '平均分'
                }, {

                    field: 'countNum',
                    align: "center",
                    width: '5%',
                    title: '答题次数'
                }
            ],
            data: data,
            onClickCell: function (field, value, row) {
                if ("questionCode" === field) {
                    $.ajax({
                        type: "POST",
                        url: path + '/questionsReport/questionInfo.do',//?commentData='+comment+"&commentID="+commentID
                        dataType: "json",
                        data: {questionCode: value},
                        success: function (data) {
                            $("#subTypeName").val(row['subTypeName'])
                            $("#checkAbilityName").val(row['checkAbilityName'])
                            $("#questionContent").val(row['questionContent'])
                            initQuestionInfoTable(data);
                            $("#questionInfo").modal("show");
                        }
                    });

                }
            }
        });
    };
    var initQuestionInfoTable = function (data) {
        $('#questionInfoTable').bootstrapTable("destroy");
        $("#questionInfoTable").bootstrapTable({
            columns: [
                {

                    //field : 'courseName',
                    align: "center",
                    title: '课程名称',
                    width: '8%'
                }, {

                    //field : 'courseName',
                    align: "center",
                    title: '点评时间',
                    width: '8%'
                }, {

                    //field : 'grade',
                    align: "center",
                    title: '得分',
                    width: '5%'
                }, {

                    // field : 'questionValue',
                    align: "center",
                    width: '5%',
                    title: '分值'
                }
                , {

                    //field : 'comment',
                    halign: "center",
                    title: '点评',
                    width: '15%'
                }, {

                    //field : 'secondOccupationName',
                    align: "center",
                    width: '8%',
                    title: '角色名称'
                }, {

                    //field : 'userName',
                    align: "center",
                    width: '8%',
                    title: '学员姓名'
                }
            ],
            data: data
        });
    };
    var initPage = function () {
        var search_EQ_subType = $("#SearchSubType").val();
        var search_LIKE_questionContent = $("#SearchQuestionContent").val();
        $.ajax({
            type: "POST",
            url: path + '/questionsReport/questionsReport.do',//?commentData='+comment+"&commentID="+commentID
            dataType: "json",
            data: {
                search_EQ_subType: search_EQ_subType,
                search_LIKE_questionContent: search_LIKE_questionContent
            },
            success: function (data) {
                initTable(data);
            }
        });
    };
    initPage();
    $(".Close").click(function () {
        $("#questionInfo").modal("hide");
    });
    $("#search").click(function(){
        initPage();
    })
    $("#rests").click(function(){
        $("#SearchSubType").val("");
       $("#SearchQuestionContent").val("");
    })
});
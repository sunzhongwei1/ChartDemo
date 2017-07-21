define(function (require) {
    //  var utils = require('assets/myPlugins/Utils');
    var BootStrapCore = {};
    BootStrapCore.falg = true;
    BootStrapCore.resetForm = function (fromID) {
        var id = "#" + fromID;
        $(':input', id)
            .not(':button, :submit, :reset')
            .val('')
            .removeAttr('checked')
            .removeAttr('selected');
        $("#" + fromID).data('bootstrapValidator').resetForm(true);

    };
    /**
     *
     * @param params 最基本条件，如pageNumber，pageSize
     * @returns {___anonymous191_192}
     */
    BootStrapCore.params = function (params, attr) {
        var newparams = {};
        if (attr) {
            $("input[" + attr + "]").each(function () {
                var name = $(this).attr("name");
                var value = $(this).val();
                newparams[name] = value;
            });
            $("select[" + attr + "]").each(function () {
                var name = $(this).attr("name");
                var value = $(this).val();
                newparams[name] = value;
            });
        } else {
            $("input[SerachCondition]").each(function () {
                var name = $(this).attr("name");
                var value = $(this).val();
                newparams[name] = value;
            });
            $("select[SerachCondition]").each(function () {
                var name = $(this).attr("name");
                var value = $(this).val();
                newparams[name] = value;
            });
        }
        newparams['pageNumber'] = params.pageNumber;
        newparams['pageSize'] = params.pageSize;
        return newparams;
    };
    /**
     *
     * @param tableID 表格ID
     *
     * 初始化，表格的编辑，删除，查询按钮
     */
    BootStrapCore.editButton = function(){
        $(".edit").unbind("click");
        $(".edit").bind("click", function () {
            var entityID = $(this).attr("entityID");
            var url = $(this).attr("url");
            var fromID = $(this).attr("fromID");
            var fromModal = fromID + "Modal";
            var fromObj = $('#' + fromID);

            $.post(url, {entityID: entityID}, function (data) {
               // alert(JSON.stringify(data))
                var obj = eval("(" + data + ")");
                BootStrapCore.showFromData(fromObj, obj[0]);
                var fileUrl = $('#'+fromID).fileupload('option', 'url');

                if(obj[0].attachmentID){

                    fileUrl=fileUrl+"?ids="+obj[0].attachmentID;
                }
                $('#'+fromID).addClass('fileupload-processing');
                $.ajax({
                    url: fileUrl,
                    dataType: 'json',
                    context: $('#'+fromID)[0]
                }).always(function () {
                    $(this).removeClass('fileupload-processing');
                }).done(function (result) {
                    $(".files").html("");
                    $(this).fileupload('option', 'done')
                        .call(this, $.Event('done'), {result: result});
                });
                $('#' + fromModal).modal('show');
            });
        });
    };
    BootStrapCore.removeButton = function(){
        $(".remove").unbind("click");
        $(".remove").bind("click", function () {
            var entityID = $(this).attr("entityID");
            var url = $(this).attr("url");
            var tableID = $(this).attr("tableID");
            bootbox.confirm({
                size: 'small',
                message: '<h4  style="color: red;">是否删除？</h4>',
                callback: function (result) {
                    if (result) {
                        $.post(url, {entityID: entityID}, function (data) {
                            $('#' + tableID).bootstrapTable("refresh");
                            BootStrapCore.SuccessCallBack(data);
                        });
                    }
                }
            });
        });
    };
    BootStrapCore.searchButton = function(){
        $(".search").bind("click", function () {
            var tableID = $(this).attr("tableID");
            $("#" + tableID).bootstrapTable("refresh");
        });
    };
    BootStrapCore.removeMoreButton = function(){
        $(".removeMore").bind("click", function () {
            if(BootStrapCore.falg){
                BootStrapCore.falg = false;
                var tableID = $(this).attr("tableID");
                var url = $(this).attr("url");
                url = path + url;
                var datas = $("#" + tableID).bootstrapTable("getSelections");
                var entityIDS = "";
                if (datas && datas != null && datas.length > 0) {
                    bootbox.confirm({
                        size: 'small',
                        message: '<h4 style="color: red">是否删除？</h4>',
                        callback: function (result) {
                            if (result) {
                                for (var i = 0; i < datas.length; i++) {
                                    entityIDS += datas[i].id + ",";
                                }
                                entityIDS = entityIDS.substr(0,entityIDS.length - 1);
                                $.post(url, {entityIDS: entityIDS}, function (data) {
                                    BootStrapCore.SuccessCallBack(data);
                                    $('#' + tableID).bootstrapTable("refresh");
                                    BootStrapCore.falg = true;
                                });
                            }
                        }
                    });


                } else {
                    bootbox.dialog({
                        message: "<h4 style='color: red'>请选择所需删除记录！</h4>",
                        title: "操作提示",
                        buttons: {
                            OK: {
                                label: "确认",
                                className: "btn-primary",
                                callback: function () {
                                    BootStrapCore.falg = true;
                                }
                            }
                        }
                    });
                }
            }
        });
    };
    BootStrapCore.initToolbars = function () {

        BootStrapCore.searchButton();
        BootStrapCore.removeMoreButton();
    };
    BootStrapCore.initToolbarsForTableIn = function () {
        BootStrapCore.editButton();
        BootStrapCore.removeButton();
    };
    /**
     *
     * @param props
     *
     * 初始化，表单的展开，关闭，注销按钮
     */

    BootStrapCore.initFromToolbar = function (props) {
        var fromModal = props['fromModal'];
        var fromID = props['fromID'];
        $(".btn-setting").click(function (t) {
            BootStrapCore.resetForm(fromID);
            //附件上传做的修改 start
            $(".files").html("");
            //附件上传做的修改 end
            $("#" + fromModal).modal("show");
        });
        $(".Close").click(function (t) {
            BootStrapCore.resetForm(fromID);
            $("#" + fromModal).modal("hide");
        });
        $(".Reset").click(function () {
            BootStrapCore.resetForm(fromID);
        });
    };
    /**
     *
     * @param data
     * @returns {Boolean}
     * 表格加载 完成后调用，留以后重写用
     */
    BootStrapCore.loadSuccess = function (data) {
        return true;
    };
    /**
     *
     * @param row
     * @param editUrl
     * @param removeUrl
     * @param tableID
     * @param fromID
     * @returns
     * 返回表格操作列的数据html。
     */
    BootStrapCore.initToolbarsHTML = function (row, editUrl, removeUrl, tableID, fromID) {
        var json = [
            '<a class="edit ml10" href="javascript:void(0)" name="edit" entityID="' + row['id'] + '" url="' + editUrl + '"  fromID="' + fromID + '" onclick="editButton()"  title="Edit">',
            '<i class="glyphicon glyphicon-edit"></i>',
            '</a>',
            '<a class="remove ml10" href="javascript:void(0)" entityID="' + row['id'] + '" url="' + removeUrl + '" tableID="' + tableID + '"  title="Remove">',
            '<i class="glyphicon glyphicon-remove"></i>', '</a>']
            .join('');
        return json;
    };

    /**
     * @param e
     * @param data
     * @param url
     * 表格校验成功后调用该方法，做保存。
     */
    BootStrapCore.validatorSuccess = function (e, data, url,fromModal,tableID) {
        var $form = $(e.target);
       /* $.post(url, $form.serialize(), function (result) {
            BootStrapCore.SuccessCallBack(result);
        }, 'json');*/
        $.ajax({
            type: "POST",
            url: url,
            async: false,
            data: $form.serialize(),
            success: function (data) {
                var fromArr = fromModal.split("Modal");
                BootStrapCore.resetForm(fromArr[0]);
                $("#"+fromModal).modal("hide");
                $('#'+tableID).bootstrapTable("refresh");

            }
        });

    };
    /**
     *
     * @param e
     * @param result
     * @returns {Boolean}
     * 实体保存成功后条用的回调函数
     */
    BootStrapCore.SuccessCallBack = function ( result) {
        //bootbox.setDefaults("locale","zh_CN");
        //bootbox.alert("<h4 style='color: green'>操作成功！</h4>");
        return true;
    };

    /**
     * 把props参数指定的属性内容填写到指定位置。
     * @param  {Object} props 包含要复制到obj对象上的属性或方法的对象。
     */
    BootStrapCore.showFromData = function (obj, props, strict) {


        for (var key in props) {
            if (!strict || obj.hasOwnProperty(key) || obj[key] != undefined) obj[key] = props[key];
            $('#' + key).val(props[key]);
        }

    };
    /**
     * 获取GET请求地址后的参数并封装成对象
     *
     */
    BootStrapCore.getRequest = function(url){
        var theRequest = {};
        if (url.indexOf("?") != -1) {
            var str = url.substr(1);
            strs = str.split("&");
            for(var i = 0; i < strs.length; i ++) {
                theRequest[strs[i].split("=")[0]]=unescape(strs[i].split("=")[1]);
            }
        }
        return theRequest;
    };

    BootStrapCore.showViewFile = function(viewFromID,attachmentID){

        $('#'+viewFromID).fileupload({
            url: '/redcross/upload'
        });
        var fileUrl = $('#'+viewFromID).fileupload('option', 'url');
        if(attachmentID){
            fileUrl=fileUrl+"?ids="+attachmentID;
        }
        $('#'+viewFromID).addClass('fileupload-processing');
        $.ajax({
            url: fileUrl,
            dataType: 'json',
            context:   $('#'+viewFromID)[0]
        }).always(function () {
            $(this).removeClass('fileupload-processing');
        }).done(function (result) {
            $(".files").html("");
            $(this).fileupload('option', 'done')
                .call(this, $.Event('done'), {result: result});
            $("#"+viewFromID+" .fileinput-button").hide();
            $("#"+viewFromID+" .delete").hide();
        });
    };
    return BootStrapCore;
});
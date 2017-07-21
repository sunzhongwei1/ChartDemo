<%--
  Created by IntelliJ IDEA.
  User: lzf
  Date: 2016/3/10
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%--核心js/css start --%>
<link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet"/>
<link href="${pageContext.request.contextPath}/assets/css/style.min.css" rel="stylesheet"/>
<script src="${pageContext.request.contextPath}/assets/js/jquery-2.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/core.min.js"></script>
<script src="${pageContext.request.contextPath}/sea.js"></script>
<%--核心js/css end --%>
<!--start:表格插件-->
<script src="${pageContext.request.contextPath}/assets/js/bootstrap-table.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/bootstrap-table-zh-CN.js"></script>
<!--end:表格插件-->
<!--start:表单校验-->
<link href="${pageContext.request.contextPath}/assets/css/bootstrapValidator.css" rel="stylesheet"/>
<script src="${pageContext.request.contextPath}/assets/js/bootstrapValidator.js"></script>
<!--end:表单校验-->
<%--消息提示框插件：start--%>
<script src="${pageContext.request.contextPath}/assets/plugins/bootBox/bootbox.js"></script>
<%--消息提示框插件：end--%>
<%--时间插件：start--%>
<script src="${pageContext.request.contextPath}/assets/plugins/My97DatePicker/WdatePicker.js" ></script>
<%--时间插件：end--%>
<!--树形结构ztree start-->
<link rel="stylesheet" href="${pageContext.request.contextPath}/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/ztree/js/jquery.ztree.core.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/ztree/js/jquery.ztree.excheck.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/ztree/js/jquery.ztree.exhide.min.js"></script>
<!--树形结构ztree end-->
<%--附件上传插件css/js：start--%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/file/css/jquery.fileupload.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/file/css/jquery.fileupload-ui.css">
<script id="template-upload" type="text/x-tmpl">
{% for (var i=0, file; file=o.files[i]; i++) { %}
    <tr class="template-upload fade">
       <%-- 这个是处理加载的动态条<td>
            <span class="preview"></span>
        </td>--%>
        <td>
            <p class="name">{%=file.name%}</p>
            <strong class="error text-danger"></strong>
        </td>
        <td>
            <p class="size">0%</p>
            <div class="progress progress-striped active" role="progressbar" aria-valuemin="0" aria-valuemax="100" aria-valuenow="0"><div class="progress-bar progress-bar-success" style="width:0%;"></div></div>
        </td>
        <td>
            {% if (!i && !o.options.autoUpload) { %}
                <button class="btn btn-primary start">
                    <i class="glyphicon glyphicon-upload"></i>
                    <span>上传</span>
                </button>
            {% } %}
            {% if (!i) { %}
                <button class="btn btn-warning cancel">
                    <i class="glyphicon glyphicon-ban-circle"></i>
                    <span>取消</span>
                </button>
            {% } %}
        </td>
    </tr>
{% } %}
</script>
<script id="template-download" type="text/x-tmpl">
{% for (var i=0, file; file=o.files[i]; i++) { %}

    <tr class="template-download fade">

        <td>
            <p class="name">
                {% if (file.url) { %}
                    <a href="/redcross/{%=file.url%}" title="{%=file.name%}" download="{%=file.name%}" {%=file.thumbnailUrl?'data-gallery':''%}>{%=file.name%}</a>
                    <input type="hidden" name="attachmentID" value="{%=file.id%}">
                {% } else { %}
                    <span>{%=file.name%}</span>
                {% } %}
            </p>
            {% if (file.error) { %}
                <div><span class="label label-danger">错误</span> 上传失败</div>
            {% } %}
        </td>
        <td>
            <span class="size">{%=o.formatFileSize(file.size)%}</span>
        </td>
        <td>
            {% if (file.deleteUrl) { %}
                <button class="btn btn-danger delete" data-type="{%=file.deleteType%}" data-url="/redcross/{%=file.deleteUrl%}"{% if (file.deleteWithCredentials) { %} data-xhr-fields='{"withCredentials":true}'{% } %}>
                    <i class="glyphicon glyphicon-trash"></i>
                    <span>删除</span>
                </button>
            {% } else { %}
                <button class="btn btn-warning cancel">
                    <i class="glyphicon glyphicon-ban-circle"></i>
                    <span>Cancel</span>
                </button>
            {% } %}
        </td>
    </tr>
{% } %}
</script>
<script src="${pageContext.request.contextPath}/assets/plugins/file/js/jquery.ui.widget.js"></script>
<script src="${pageContext.request.contextPath}/assets/plugins/file/js/tmpl.js"></script>
<script src="${pageContext.request.contextPath}/assets/plugins/file/js/jquery.fileupload.js"></script>
<script src="${pageContext.request.contextPath}/assets/plugins/file/js/jquery.fileupload-validate.js"></script>
<script src="${pageContext.request.contextPath}/assets/plugins/file/js/jquery.fileupload-ui.js"></script>
<%--附件上传插件css/js：end--%>
<%
    String path = request.getContextPath();
%>
<script type="text/javascript">
    var path = "<%=path%>";
</script>


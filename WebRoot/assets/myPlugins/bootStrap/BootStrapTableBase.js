define(function(require) {
    var utils = require('assets/myPlugins/Utils');
    var Class = require('assets/myPlugins/Class');
    var BootStrapCore = require('assets/myPlugins/bootStrap/BootStrapCore');
    var BootStrapTableBase = Class.create({
        initialize:function(props){
            this.id ="";
            this.queryUrl="";
            this.uniqueId="";
            this.columns = null;
            this.striped=false;
            this.search=false;
            this.uniqueId="id";
            this.pageList=[5, 10, 15, 20];
            this.pageSize=10;
            this.pageNumber=1;
            this.queryParamsType="undefined";
            this.queryParamsType=null;
            this.sidePagination="server";
            this.singleSelect=true;
            this.toolbar="";
            this.sortOrder="desc";
            this.cache=false;
            this.pagination=true;
            utils.merge(this, props);
        },
        initTable:function(){
            $('#'+this.id).bootstrapTable({
                url: this.queryUrl, //请求地址
                columns: this.columns,//表格字段
                striped:this.striped,//显示条纹
                method:"post",
                uniqueId:this.uniqueId,//类似于主键ID,默认为实体ID
                sortOrder:this.sortOrder, //定义了列的排序顺序,只能“asc”或“desc”。默认为降序
                search:this.search, //是否显示搜索框,默认false
                pageNumber:this.pageNumbe,//当前页，默认为1
                pageSize:this.pageSize,//每页显示条数，默认为10
                pagination:this.pagination,//在底部显示分页工具栏,默认true
                pageList: this.pageList,//显示条数，工具栏
                //设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder
                //设置为limit可以获取limit, offset, search, sort, order
                queryParamsType : this.queryParamsType,
                queryParams:this.queryParams, //查询条件
                showColumns:false,//列在下拉列表中显示
                minimunCountColumns: 2,//控制表格显示几列，配合showColumns属性使用
                showPaginationSwitch:false,//控制显示分页
                sidePagination: this.sidePagination, //服务端请求
                singleSelect:this.singleSelect,//设置表格单选
                onLoadSuccess:this.onLoadSuccess,//数据加载成功后调用
                onLoadError:this.onLoadError,//数据加载失败后调用
                onClickRow:this.onClickRow,//点击行是触发事件
                onClickCell:this.onClickCell, //点击列是触发事件
                toolbar:this.toolbar,//表格菜单
                cache:this.cache,//是否对表格数据进行缓存，默认false
                contentType:"application/x-www-form-urlencoded",//spring只有这个格式在POST请求下，才能实现
                dataType:"json"//这格式传输内容的格式
            });
            BootStrapCore.initToolbars();
        },
        //摧毁表格
        destroy:function(){
            $('#'+this.id).bootstrapTable("destroy");
        },
        //刷新表格
        refresh:function(){
            $('#'+this.id).bootstrapTable("refresh");
        },
        //获得表格对象
        getTableObj:function(){
            var obj = $('#'+this.id);
            return obj;
        },
        //点击行触发事件
        onClickRow:function(row, element){
          //  alert(row)
            return true;
        },
        //点击列触发事件
        onClickCell:function(cell, element){
            //  alert(row)
            return true;
        },
        //选择行是触发
        onCheck:function(row, element){
            return true;
        },
        //选择行是触发
        onCheck:function(row, element){
            return true;
        },
        //表格加载 完后触发
        onLoadSuccess:function(data){
            BootStrapCore.initToolbarsForTableIn();
            BootStrapCore.loadSuccess(data);
            return true;
        },
        //表格加载失败触发
        onLoadError:function(status, res){
            return true;
        },
        //获取选中的数据，返回json对象
        getSelections:function(){
            return  this.getTableObj().bootstrapTable("getSelections");

        },
        //获得表格全数据
        getData:function(){
            return this.getTableObj().bootstrapTable("getData");
        }
    });
    return BootStrapTableBase;
});


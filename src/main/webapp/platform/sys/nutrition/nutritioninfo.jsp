<%--
  Created by IntelliJ IDEA.
  User: 01
  Date: 七月 05 0005
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>营养信息管理</title>

    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link href="<%=path %>/platform/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="<%=path %>/platform/css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="<%=path %>/platform/css/plugins/bootstrap-table/bootstrap-table.min.css" rel="stylesheet">
    <link href="<%=path %>/platform/css/plugins/bootstrap-table/bootstrap-editable.css" rel="stylesheet" />
    <link href="<%=path %>/platform/css/animate.css" rel="stylesheet">
    <%--<link href="../../../platform/css/style.css?v=4.1.0" rel="stylesheet">--%>
    <link href="<%=path %>/platform/css/style.css?v=4.1.0" rel="stylesheet">
</head>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">

    <!-- End Panel Columns & Select -->

    <!-- Panel Other -->
    <div class="ibox float-e-margins">
        <div class="ibox-content">
            <div class="row row-lg">

                <div class="col-sm-12">
                    <!-- Example Pagination -->
                    <div class="example-wrap">
                        <h4 class="example-title">营养数据表</h4>
                        <div class="example">
                            <div id="toolbar" class="btn-group">
                                <%--<button id="btn_add" type="button" class="btn btn-default">
                                    <span class="glyphicon glyphicon-plus" href="addnutri.jsp" aria-hidden="true"></span>新增
                                </button>
                                <button id="btn_edit" type="button" class="btn btn-default">
                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
                                </button>
                                <button id="btn_delete" type="button" class="btn btn-default">
                                    <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
                                </button>--%>
                                <a data-toggle="modal" id="btn_add"  class="btn btn-default glyphicon glyphicon-plus" href="nutritioninfo.jsp#modal-form" aria-hidden="true">新增</a>
                                <%--<a data-toggle="modal" id="btn_edit" class="btn btn-default glyphicon glyphicon-pencil" aria-hidden="true">修改</a>--%>
                                <a data-toggle="modal" id="btn_delete" class="btn btn-default glyphicon glyphicon-remove" aria-hidden="true">删除</a>
                            </div>
                            <table id="nutritionInfoTable" class="col-xs-12" data-toolbar="#toolbar">
                                <%--<table id="nutritionInfoTable" data-toggle="table" data-url="js/demo/bootstrap_table_test.json" data-query-params="queryParams"
                                       data-mobile-responsivse="true" data-height="400" data-pagination="true" data-icon-size="outline" data-search="true">
                                    <thead>
                                    <tr>
                                        <th data-field="state" data-checkbox="true"></th>
                                        <th data-field="id">ID</th>
                                        <th data-field="name">名称</th>
                                        <th data-field="price">价格</th>
                                    </tr>
                                    </thead>
                                </table>--%>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div id="modal-form" class="modal fade" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-body">
                    <div class="row">
                        <div class="col-sm-12" >
                            <h3 class="m-t-none m-b">新增</h3>
                            <p>新增营养基础数据(⊙o⊙)</p>
                            <%--<form role="form" action="insertNutList">--%>
                            <form role="form" class="insertForm">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">序号：</label>
                                    <div class="col-sm-8">
                                        <input type="text" placeholder="请输入序号" name="id" class="form-control" value="${item.id}">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">营养名：</label>
                                    <div class="col-sm-8">
                                        <input type="text" placeholder="请输入营养名" name="name" class="form-control" value="${item.name}" >
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-3 control-label">NRV值：</label>
                                    <div class="col-sm-8">
                                        <input type="text" placeholder="请输入NRV值" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">计量单位：</label>
                                    <div class="col-sm-8">
                                        <input type="text" placeholder="请输入计量单位" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">修约间隔：</label>
                                    <div class="col-sm-8">
                                        <input type="text" placeholder="请输入修约间隔" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">修约符号：</label>
                                    <div class="col-sm-8">
                                        <input type="text" placeholder="请输入修约符号" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">修约值：</label>
                                    <div class="col-sm-8">
                                        <input type="text" placeholder="请输入修约值" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">能量转化值：</label>
                                    <div class="col-sm-8">
                                        <input type="text" placeholder="请输入能量转化值" class="form-control">
                                    </div>
                                </div>
                                <div>
                                    <%--<button class="btn btn-sm btn-primary pull-right m-t-n-xs" type="submit"><strong>新增</strong>--%>
                                        <button class="btn btn-sm btn-primary pull-right m-t-n-xs" id="submit"><strong>新增</strong>
                                        <%--<button class="btn btn-success" id="submit">submit</button>--%>
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- 全局js -->
<script src="<%=path %>/platform/js/jquery.min.js?v=2.1.4"></script>
<script src="<%=path %>/platform/js/bootstrap.min.js?v=3.3.6"></script>

<!-- 自定义js -->
<script src="<%=path %>/platform/js/content.js?v=1.0.0"></script>


<!-- Bootstrap table -->
<script src="<%=path %>/platform/js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
<script src="<%=path %>/platform/js/plugins/bootstrap-table/bootstrap-table-mobile.min.js"></script>
<script src="<%=path %>/platform/js/plugins/bootstrap-table/bootstrap-editable.js"></script>
<script src="<%=path %>/platform/js/plugins/bootstrap-table/bootstrap-editable.min.js"></script>
<script src="<%=path %>/platform/js/plugins/bootstrap-table/bootstrap-table-editable.js"></script>
<script src="<%=path %>/platform/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>

<!-- Peity -->
<script src="<%=path %>/platform/js/demo/bootstrap-table-demo.js"></script>

<script type="text/javascript">
    var curRow = {};
    $(function () {
        $('#nutritionInfoTable').bootstrapTable({
            method: 'get',
            toolbar: '#toolbar',    //工具按钮用哪个容器
            striped: true,      //是否显示行间隔色
            cache: false,      //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,     //是否显示分页（*）
            sortable: false,      //是否启用排序
            height: 600,
            sortOrder: "asc",     //排序方式
            pageNumber:1,      //初始化加载第一页，默认第一页
            pageSize: 10,      //每页的记录行数（*）
            pageList: [10, 25, 50, 100],  //可供选择的每页的行数（*）
            url: "queryNutList",//这个接口需要处理bootstrap table传递的固定参数
            queryParamsType:'', //默认值为 'limit' ,在默认情况下 传给服务端的参数为：offset,limit,sort
                                // 设置为 ''  在这种情况下传给服务器的参数为：pageSize,pageNumber

            //queryParams: queryParams,//前端调用服务时，会默认传递上边提到的参数，如果需要添加自定义参数，可以自定义一个函数返回请求参数
            sidePagination: "server",   //分页方式：client客户端分页，server服务端分页（*）
            //search: true,      //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            strictSearch: true,
            showColumns: true,     //是否显示所有的列
            //showRefresh: true,     //是否显示刷新按钮
            minimumCountColumns: 2,    //最少允许的列数
            clickToSelect: true,    //是否启用点击选中行
            searchOnEnterKey: true,
            idField: "id",
            columns: [{
                radio: true
            },    {
                field: 'id',
                title: '序号',
                align: 'center'
            }, {
                field: 'name',
                title: '营养名',
                align: 'center',
                editable: {
                    type: 'text',
                    title: '营养名',
                    validate: function (v) {
                        if (!v) return '营养名不能为空';

                    }
                }
            }, {
                field: 'nrvvalue',
                title: 'NRV值',
                align: 'center'
            },{
                field: 'measurement',
                title: '计量单位',
                align: 'center'
            },{
                field: 'rounding',
                title: '修约间隔',
                align: 'center'
            },{
                field: 'contrastmark',
                title: '修约符号',
                align: 'center'
            },{
                field: 'criticalvalue',
                title: '修约值',
                align: 'center'
            },{
                field: 'energyrate',
                title: '能量转化值',
                align: 'center',
                formatter: function (value, row, index) {
                    return "<a href=\"#\" name=\"energyrate\" data-type=\"text\" data-pk=\""+row.id+"\" data-title=\"能量转化值\">" + value + "</a>";
                }
            },{
                title: '操作',
                align: 'center',
                formatter:function(value,row,index){
                    //通过formatter可以自定义列显示的内容
                    //value：当前field的值，即id
                    //row：当前行的数据
                    //var a = '<a href="" >删除</a>';
                    return "<a href=\"#\" name=\"UserName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\">" + "删除" + "</a>";
                }
            }],
            onClickRow: function (row, $element) {
                curRow = row;
            },
            /*onLoadSuccess: function (aa, bb, cc) {
                $("#nutritionInfoTable a").editable({
                    url: function (params) {
                        debugger;
                        var sName = $(this).attr("name");
                        curRow[sName] = params.value;
                        $.ajax({
                            type: 'POST',
                            url: "/Editable/Edit",
                            data: curRow,
                            dataType: 'JSON',
                            success: function (data, textStatus, jqXHR) {
                                alert('保存成功！');
                            },
                            error: function () { alert("error");}
                        });
                    },
                    type: 'text'
                });
            },*/
            onEditableSave: function (field, row, oldValue, $el) {
                debugger;
                $.ajax({
                    type: "post",
                    url: "updateNutri",
                    data: row,
                    dataType: 'JSON',
                    success: function (data, status) {
                        debugger;
                        if (status == "success") {
                            alert(data.msg);
                        }
                    },
                    error: function () {
                        alert('编辑失败');
                    },
                    complete: function () {

                    }

                });
            },
            pagination:true
        });
        $("button#submit").click(function(){
            $.ajax({
                type: "POST",
                url: "insertNutList",
                data: $('form.insertForm').serialize(),
                success: function(msg){
                    alert(msg);
                },
                error: function(){
                    alert("failure");
                }
            });
        });

        var $remove = $('#btn_delete');
        var $table = $("#nutritionInfoTable");
        $remove.click(function () {
            debugger;
            var ids = $.map($table.bootstrapTable('getSelections'), function (row) {
                return row.id;
            });
            if (ids.length != 1 ) {
                alert("请选择一行删除!");
                return;
            }

            $.ajax({
                type: "POST",
                url: "delNutri",
                data: {"id":ids[0]},
                success: function(msg){
                    alert(msg.msg);
                    $table.bootstrapTable('remove', {
                        field: 'id',
                        values: ids
                    });
                },
                error: function(){
                    alert("failure");
                }
            });
            /*$table.bootstrapTable('remove', {
                field: 'id',
                values: ids
            });*/
        });
    })

</script>

</body>
</html>

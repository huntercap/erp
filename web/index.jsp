<%--
  Created by IntelliJ IDEA.
  User: Administrator  Date: 2017/1/31
  Time: 2:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="easyUI1.5/jquery.min.js"></script>
    <script type="text/javascript" src="easyUI1.5/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="easyUI1.5/locale/easyui-lang-zh_CN.js"></script>
    <link href="bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link rel="stylesheet" href="easyUI1.5/themes/default/easyui.css" type="text/css">
    <link rel="stylesheet" href="easyUI1.5/themes/icon.css" type="text/css">
    <link rel="stylesheet" href="js/index.js">


    <script language="JavaScript">
        function addTab(title, url) {
            if ($('#home').tabs('exists', title)) {
                $('#home').tabs('select', title);
            } else {
                var content = '<iframe scrolling="auto" frameborder="0" src="'
                        + url + '" style="width:100%;height:100%;"></iframe>';
                $('#home').tabs('add', {
                    title: title,
                    content: content,
                    closable: true
                });
            }
        }

        $(document).ready(function () {

        });
    </script>
    <style>
        .footer {
            width: 100%;
            text-align: center;
            line-height: 35px;
        }

        .top-bg {
            background-color: #d8e4fe;
            height: 80px;
        }
    </style>
</head>
<body class="easyui-layout">

<div region="north" border="true" split="true"
     style="overflow: hidden; height: 80px;">
    <div class="footer">
        简单数据CRUD系统</a>
    </div>
</div>

<div region="south" border="true" split="true"
     style="overflow: hidden; height: 40px;">
    <div class="footer">
        版权所有：<a href="http://www.ewan.cn/">益玩平台</a>
    </div>
</div>

<div region="west" split="true" title="功能菜单" style="width: 200px;">

    <div id="aa" class="easyui-accordion"
         style="position: absolute; top: 27px; left: 0px; right: 0px; bottom: 0px;">

        <div title="查看数据" selected="true"
             style="overflow: auto; padding: 10px;">
            <ul class="easyui-tree">
                <li><a href="#" onclick="addTab('用户列表','list')">用户玩家</a></li>
            </ul>
        </div>

        <div title="添加数据" style="padding: 10px;">
            <ul class="easyui-tree">
                <li><a href="#" onclick="addTab('添加用户','add')">添加用户</a></li>
            </ul>
        </div>

        <div title="删除数据" style="padding: 10px;">
            <ul class="easyui-tree">
                <li><a href="#" onclick="addTab('删除用户','delete')">删除用户</a></li>
            </ul>
        </div>
        <div title="修改数据" style="padding: 10px;">
            <ul class="easyui-tree">
                <li><a href="#" onclick="addTab('修改用户','update')">修改用户</a></li>
            </ul>
        </div>

    </div>
</div>


<div id="mainPanle" region="center" style="overflow: hidden;">

    <div id="home" class="easyui-tabs" style="width: 1300px; height: 800px;">
        <div title="Home">Hello,welcome to use this system.</div>
    </div>
</div>
</body>

</html>

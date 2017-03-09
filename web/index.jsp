<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/31
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
	<link href="bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet">
</head>

<body class="">
<div>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<a href="#" class="navbar-brand"><big>人事处</big>
					<small>昆明医科大学第二附属医院</small>
				</a>
				<span class="glyphicon glyphicon-pencil"></span>
				<button type="button" class="navbar-toggle" data-toggle="collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
			<div class="collapse navbar-collapse" id="navbar-collapse"><%--加上collapse属性，屏幕缩小时不显示li元素--%>
				<ul class="nav navbar-nav navbar-right" style="margin-top:0px">
					<li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span> 首页</a></li>
					<li class="active"><a href="#"><span class=""></span>医院首页</a></li>
					<li class="active"><a href="#"><span class="glyphicon glyphicon-info-sign"></span> 关于</a></li>
				</ul>
			</div>
		</div>
	</nav>
</div>
<div prefix=""
<div>
	<p>标签式的导航菜单</p>
	<ul class="nav nav-tabs">
		<li class="active"><a href="#">Home</a></li>
		<li><a href="emp-list" target="_self">显示所有人员 h</a></li>
		<li><a href="emp-input" target="inputForm">新增人员</a></li>
		<li><a href="#">VB.Net</a></li>
		<li><a href="#">Java</a></li>
		<li><a href="#">PHP</a></li>
	</ul>
</div>
<div class="dropdown">
	<button class="btn btn-default" data-toggle="dropdown">
		下拉菜单
		<span class="caret"></span>
	</button>
	<ul class="dropdown-menu">
		<li class="dropdown-header">导航</li>
		<li><a href="#">nihao</a></li>
		<li><a href="#">首页</a></li>
		<li><a href="#">伟业</a></li>
		<li><a href="#">对对对</a></li>
	</ul>
</div>
<!-- 16:9 aspect ratio -->
<div id="mainFrom">

	<P>
	<h1>你好反反复复付付付付</h1>
	</P>

</div>

<!-- 4:3 aspect ratio -->
<div class="embed-responsive embed-responsive-4by3">
	<iframe id="listForm"></iframe>
</div>
<div class="embed-responsive-4by3">
	<iframe id="inputForm"></iframe>
</div>

<!--
    <a href="emp-list">List All Employees</a>

    <br><br>

    <a href="emp-input">Add New Employee</a>
    -->
<script>
	$(document).ready(function () {

		$("#listForm").attr("src", "/emp-list");
		$("#inputForm").attr("src", "/emp-input");
		alert("nihao");
		$("#mainFrom").hide();
		/*        $("#mainFrom").innerHTML=
		 $.get("/emp-list",function(data,status){
		 alert("数据: " + data + "\n状态: " + status);
		 });

		 });*/
	});

</script>
</body>
</html>

<!doctype html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/31
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
    <link href="bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet">


    <script type="text/javascript" src="easyUI1.5/jquery.min.js"></script>
    <script type="text/javascript" src="easyUI1.5/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="easyUI1.5/locale/easyui-lang-zh_CN.js"></script>
    <link href="bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link rel="stylesheet" href="easyUI1.5/themes/default/easyui.css" type="text/css">
    <link rel="stylesheet" href="easyUI1.5/themes/icon.css" type="text/css">
    <script type="text/javascript">
        $(function(){
            //1. 点击 delete 时, 弹出 确定是要删除 xx 的信息吗 ? 若确定, 执行删除, 若不确定, 则取消
            $(".delete").click(function(){
                var lastName = $(this).next(":hidden").val();
                var flag = confirm("确定要删除" + lastName + "的信息吗?");
                if(flag){
                    var $tr = $(this).parent().parent();
                    //删除, 使用 ajax 的方式
                    var url = this.href;
                    var args = {"time":new Date()};
                    $.post(url, args, function(data){
                        //若 data 的返回值为 1, 则提示 删除成功, 且把当前行删除
                        if(data == "1"){
                            alert("删除成功!");
                            $tr.remove();
                        }else{
                            //若 data 的返回值不是 1, 提示删除失败.
                            alert("删除失败!");
                        }
                    });
                }
                //取消超链接的默认行为
                return false;
            });
        })
    </script>
</head>
<body style="margin: 50px;">
<h4>Employee List Page!</h4>
<s:debug></s:debug>
<s:if test="#request.employees == null || #request.employees.size() == 0">
没有任何员工信息
</s:if>
<s:else>
    <table class=""
        <tr>
            <td>id</td>
            <td>fullName</td>
            <td>gender</td>
            <td>民族</td>
            <td>编制类型</td>
            <td>birthDate</td>
            <td>jobNo</td>
            <td>salaryId</td>
            <td>idNo</td>
            <td>endowmentNo</td>
            <td>DELETE</td>
            <td>EDIT</td>
        </tr>
        <s:iterator value="#request.employees">
            <tr>
                <td>${id}</td>
                <td>${fullName}</td>
                <td>${gender}</td>
                <td>${nation.nation}</td>
                <td>${contract.contractType}</td>
                <%--format值中年月日格式化format="yyyy-MM-dd"，
                月一定要用大写"MM",小写“m”表示秒;--%>
                <td>
                    <s:date name="birthDate" format="yyyy-MM-dd"/><%--format="yyyy-mm-dd"--%>
                </td>
                <td>${jobNo}</td>
                <td>${salaryId}</td>
                <td>${idNo}</td>
                <td>${endowmentNo}</td>
                <td>
                    <s:iterator value="entryInfo">
                        <td>${registDate}</td>
                    </s:iterator>
                </td>

                <td>
                    <a href="emp-delete?id=${id} " class="delete">删除</a>
                    <input type="hidden" value="${lastName} "/>
                </td>
                <td>
                    <a href="emp-input?id=${id}">修改</a>
                </td>
            </tr>

        </s:iterator>

    </table>
</s:else>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/26
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>学生信息</h1>
<form action="/hello/save" method="post">
    编号：<input name="id"  type="text"/><br/>
    姓名：<input type="text" name="name" /><br/>
    年龄：<input type="text" name="age" /><br/>
    <input type="submit" value="添加"/>
</form>
</body>
</html>

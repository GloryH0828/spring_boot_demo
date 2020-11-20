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
    <form action="/hello/update" method="post">
        <input name="id" value="${student.id}" readonly="readonly" type="hidden"/><br/>
        姓名：<input type="text" name="name" value="${student.name}"/><br/>
        年龄：<input type="text" name="age" value="${student.age}"/><br/>
        <input type="submit" value="确认修改"/>
    </form>
</body>
</html>

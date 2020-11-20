<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/26
  Time: 14:13
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
<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>功&nbsp;&nbsp;&nbsp;能</th>

    </tr>
    <c:forEach items="${list}" var="studentList">
        <tr>
            <th>${studentList.id}</th>
            <th>${studentList.name}</th>
            <th>${studentList.age}</th>
            <th>
                <a href="/hello/findById/${studentList.id}">编辑</a>
                &nbsp;
                <a href="/hello/deleteById/${studentList.id}">删除</a>
                &nbsp;
            </th>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="/add.jsp">添加学生</a>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 10449
  Date: 2019/7/13
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>序号</th>
        <th>请假人</th>
        <th>请假理由</th>
    </tr>
    <c:forEach items="${leaveList}" var="i" varStatus="n">
        <tr id="tr${i.lid}">
            <td>${n.count}</td>
            <td>${i.user.username}</td>
            <td>${i.reason}</td>
        </tr>
    </c:forEach>
</table>
<a href="/user/list">返回首页</a>
</body>
</html>

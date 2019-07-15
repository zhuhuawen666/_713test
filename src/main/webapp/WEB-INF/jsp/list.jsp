<%--
  Created by IntelliJ IDEA.
  User: 10449
  Date: 2019/7/13
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
你好${sessionScope.user.username}&nbsp;&nbsp;<a href="/user/logout">退出登录</a><br>
<a href="/leave">添加请假</a>
<a href="/getLeaveList">查看假条</a>
<a href="/leaveList">审批假条</a>
</body>
</html>

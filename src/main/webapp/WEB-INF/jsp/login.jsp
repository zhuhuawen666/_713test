<%--
  Created by IntelliJ IDEA.
  User: 10449
  Date: 2019/7/13
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/user/login">
    用户名：<input type="text" name="username" id="username"><br>
    密码：<input type="text"name="password" id="password"><br>
    角色:<input type="radio" value="teacher" name="cha">老师
    <input type="radio" value="student" name="cha">学生
    <input type="submit" value="登录">
</form>
</body>
</html>

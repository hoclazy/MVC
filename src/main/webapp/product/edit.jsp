<%--
  Created by IntelliJ IDEA.
  User: Thinkpad t440s
  Date: 5/25/2022
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <input type="number" name="id" value="${spCanSua.id}">
    <input type="text" name="name"value="${spCanSua.name}">
    <input type="number" name="price"value="${spCanSua.price}">
    <button>Sửa</button>
</form>
</body>
</html>

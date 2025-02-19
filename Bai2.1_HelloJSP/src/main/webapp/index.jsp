<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Hello JSP Example</title>
  <style>
    body {
      margin: 0;
      height: 100vh; 
      display: flex;
      justify-content: center; 
      align-items: center;
    }
    .content {
      text-align: center; 
    }
  </style>
</head>
<body>
  <div class="content">
    <h1>HELLO JSP - 64CLC</h1>
    <p><%= new Date().toString() %></p>
    <%
      int x = 5;
      int y = x + 99;
    %>
    <p>Kết quả của y: <%= y %></p>
    <p><b>Hôm nay tôi học JSP</b></p>
  </div>
</body>
</html>

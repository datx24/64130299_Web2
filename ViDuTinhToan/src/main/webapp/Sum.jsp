<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="styles.css">
    <title>Tính tổng hai số</title>
</head>
<body>
    <form action="Sum.jsp" method="get">
        a = <input type="number" name="a" required> <br>
        b = <input type="number" name="b" required> <br>
        <input type="submit" value="Tính tổng">

    <%
        String strA = request.getParameter("a");
        String strB = request.getParameter("b");

        if (strA != null && strB != null && !strA.isEmpty() && !strB.isEmpty()) {
            try {
                int valueA = Integer.parseInt(strA);
                int valueB = Integer.parseInt(strB);
                int sum = valueA + valueB;
                
                out.print("<div class='result'> Tổng của " + valueA + " và " + valueB + " là: " + sum + "</div>");
            } catch (NumberFormatException e) {
                out.print("<div class='error' >Lỗi: Giá trị nhập vào không hợp lệ!</div>");
            }
        } else {
            out.print("<div class='error'>Vui lòng nhập cả hai số!</div>");
        }
    %>
        </form>
</body>
</html>

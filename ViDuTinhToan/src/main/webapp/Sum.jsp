<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tính tổng hai số</title>
</head>
<body>
    <form action="Sum.jsp" method="get">
        a = <input type="number" name="a" required> <br>
        b = <input type="number" name="b" required> <br>
        <input type="submit" value="Tính tổng">
    </form>

    <%
        String strA = request.getParameter("a");
        String strB = request.getParameter("b");

        if (strA != null && strB != null && !strA.isEmpty() && !strB.isEmpty()) {
            try {
                int valueA = Integer.parseInt(strA);
                int valueB = Integer.parseInt(strB);
                int sum = valueA + valueB;
                
                out.print("<h2>Tổng của " + valueA + " và " + valueB + " là: " + sum + "</h2>");
            } catch (NumberFormatException e) {
                out.print("<h2 style='color:red;'>Lỗi: Giá trị nhập vào không hợp lệ!</h2>");
            }
        } else {
            out.print("<h2 style='color:blue;'>Vui lòng nhập cả hai số!</h2>");
        }
    %>
</body>
</html>

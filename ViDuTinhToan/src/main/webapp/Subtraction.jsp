<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tính hiệu hai số</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
	<form action="Subtraction.jsp" method="get">
	a = <input type="number" name="a" required><br>
	b = <input type="number" name="b" required><br>
	<input type="submit" value="Tính hiệu">
	<%
		String strA = request.getParameter("a");
		String strB = request.getParameter("b");
		
		if(strA != null && strB != null && !strA.isEmpty() && !strB.isEmpty()){
			try{
				double valueA = Double.parseDouble(strA);
				double valueB = Double.parseDouble(strB);
				double sub = valueA - valueB;
				out.print("<div class='result'>Hiệu của hai số " + valueA + " và " + valueB + " là: " + sub + "</div>");
			}catch(NumberFormatException e){
				out.print("<div class='error'>Lỗi: Giá trị nhập vào không hợp lệ</div>");
			}
		} else {
			out.print("<div class='error'>Vui lòng nhập cả hai số !</div>");
		}
	%>
	</form>
</body>
</html>
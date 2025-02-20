<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tính hiệu hai số</title>
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
				out.print("Hiệu của hai số " + valueA + " và " + valueB + " là: " + sub);
			}catch(NumberFormatException e){
				out.print("Lỗi: Giá trị nhập vào không hợp lệ");
			}
		} else {
			out.print("Vui lòng nhập cả hai số !");
		}
	%>
	</form>
</body>
</html>
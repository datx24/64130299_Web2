<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tính tích hai số</title>
</head>
<body>
	<form action="Multiplication.jsp" method="get">
	a = <input type="number" name="a"><br>
	b = <input type="number" name="b"><br>
	<input type="submit" value="Tính tích">
	
	<%
	String strA = request.getParameter("a");
	String strB = request.getParameter("b");
	if(strA != null && strB != null && !strA.isEmpty() && !strB.isEmpty()){
		try{
			double valueA = Double.parseDouble(strA);
			double valueB = Double.parseDouble(strB);
			
			double mul = valueA * valueB;
			out.print("Tích của hai số " + valueA + " và " + valueB + " là: " + mul);
		}catch(NumberFormatException e) {
			out.print("Lỗi: Giá trị nhập vào không hợp lệ !");
		}
	} else {
		out.print("Vui lòng nhập cả hai số");
	}
	%>
	</form>
</body>
</html>
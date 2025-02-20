<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles.css">
<title>Phép chia hai số</title>
</head>
<body>
	<form action="Division.jsp" method="get">
	a = <input type="number" name="a"><br>
	b = <input type="number" name="b"><br>
	<input type="submit" value="Chia hai số">
	
	<%
	String strA = request.getParameter("a");
	String strB = request.getParameter("b");
	
	if(strA != null && strB != null && !strA.isEmpty() && !strB.isEmpty()){
		try{
			double valueA = Double.parseDouble(strA);
			double valueB = Double.parseDouble(strB);
			double div = valueA / valueB;
			if(valueB == 0) {
				out.print("<div class='error'>Lỗi: Không thể chia hết cho 0 !<div>");
			}
			else {
				out.print("<div class='result'>Kết quả: " + div +"</div>");
			}
		}catch(NumberFormatException e) {
			out.print("<div class='error'>Lỗi: Giá trị nhập không hợp lệ</div>");
		}
	} else {
		out.print("<div class='error'>Vui lòng nhập hai số !</div>");
	}
	%>
	</form>
</body>
</html>
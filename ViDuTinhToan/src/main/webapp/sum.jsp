<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="sum.jsp" method ="get">
	a = <input type = "number" name = "a">
	b = <input type = "number" name = "b">
	</form>
	<%String strA = request.getParameter("a");
	int valueA = Integer.parseInt(strA);
	String strB = request.getParameter("b");
	int valueB = Integer.parseInt(strB);
	out.print("Tổng của ");
	out.print(valueA);
	out.print(" và ");
	out.print(valueB);
	out.print(" bằng: ");
	out.print(valueA + valueB);
	%>
</body>
</html>
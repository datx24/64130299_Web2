<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if ("ABC".equals(username) && "MNK".equals(password)) {
        response.sendRedirect("UserProfile.html");
    } else {
%>
    <h2>Đăng nhập thất bại!</h2>
    <p>Tên đăng nhập hoặc mật khẩu không đúng. Vui lòng thử lại.</p>
    <a href="Login.html">Quay lại đăng nhập</a>
<%
    }
%>

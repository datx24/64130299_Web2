<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if ("ABC".equals(username) && "MNK".equals(password)) {
        response.sendRedirect("UserProfile.html");
    } else {
%>
    <link rel="stylesheet" href="styles.css">
    <div class="error-container">
        <h2><i class="fas fa-exclamation-triangle"></i> Đăng nhập thất bại!</h2>
        <p>Tên đăng nhập hoặc mật khẩu không đúng. Vui lòng thử lại.</p>
        <a href="Login.html"><i class="fas fa-arrow-left"></i> Quay lại đăng nhập</a>
    </div>
<%
    }
%>

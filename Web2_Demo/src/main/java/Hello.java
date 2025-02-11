import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class Hello extends HttpServlet {
    
    // Hiển thị form HTML khi truy cập bằng GET
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.write("<!DOCTYPE html>");
        out.write("<html lang='vi'>");
        out.write("<head>");
        out.write("<meta charset='UTF-8'><title>Form POST</title>");
        
        // CSS để làm giao diện đẹp hơn
        out.write("<style>");
        out.write("body { font-family: Arial, sans-serif; background-color: #f4f4f4; text-align: center; padding: 50px; }");
        out.write(".container { background: white; padding: 20px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1); width: 300px; margin: auto; }");
        out.write("h2 { color: #333; }");
        out.write("input { width: 90%; padding: 10px; margin: 10px 0; border: 1px solid #ccc; border-radius: 5px; }");
        out.write("button { background: #28a745; color: white; padding: 10px 15px; border: none; border-radius: 5px; cursor: pointer; }");
        out.write("button:hover { background: #218838; }");
        out.write("</style>");
        
        out.write("</head>");
        out.write("<body>");
        out.write("<div class='container'>");
        out.write("<h2>Nhập tên của bạn</h2>");
        out.write("<form action='/Web2_Demo/hello' method='post'>");
        out.write("<input type='text' name='name' placeholder='Nhập tên của bạn' required>");
        out.write("<button type='submit'>Gửi</button>");
        out.write("</form>");
        out.write("</div>");
        out.write("</body></html>");
    }

    // Xử lý dữ liệu khi người dùng nhấn Submit (POST request)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");

        PrintWriter out = response.getWriter();
        out.write("<!DOCTYPE html>");
        out.write("<html lang='vi'>");
        out.write("<head><meta charset='UTF-8'><title>Kết quả</title>");
        
        // CSS cho trang kết quả
        out.write("<style>");
        out.write("body { font-family: Arial, sans-serif; background-color: #f4f4f4; text-align: center; padding: 50px; }");
        out.write(".message { background: white; padding: 20px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1); width: 300px; margin: auto; }");
        out.write("h1 { color: #28a745; }");
        out.write("</style>");
        
        out.write("</head>");
        out.write("<body>");
        out.write("<div class='message'>");
        out.write("<h1>Xin chào, " + name + "!</h1>");
        out.write("<p>Đây là phản hồi từ POST.</p>");
        out.write("</div>");
        out.write("</body></html>");
    }
}

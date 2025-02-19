package dat.nx;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AboutMe
 */
@WebServlet(name = "Homeeeeeeee", urlPatterns = {"/Home"})
public class AboutMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutMe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
     
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='vi'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Thông Tin Sinh Viên</title>");
        out.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css'>");
        out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css'>");
        out.println("<style>");
        out.println("body { background-color: #f8f9fa; font-family: Arial, sans-serif; }");
        out.println(".container { max-width: 600px; }");
        out.println(".card { border-radius: 15px; box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1); }");
        out.println(".card-header { background: linear-gradient(to right, #007bff, #00c6ff); color: white; }");
        out.println(".avatar { width: 120px; height: 120px; border-radius: 50%; display: block; margin: 10px auto; }");
        out.println(".info-item { font-size: 18px; margin-bottom: 10px; display: flex; align-items: center; }");
        out.println(".info-item i { width: 40px; text-align: center; color: #007bff; font-size: 22px; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");

        // Căn giữa theo cả chiều dọc và ngang
        out.println("<div class='d-flex justify-content-center align-items-center min-vh-100'>");
        out.println("<div class='container'>");
        out.println("<div class='card'>");
        out.println("<div class='card-header text-center'>");
        out.println("<h3>Thông Tin Sinh Viên</h3>");
        out.println("</div>");
        out.println("<div class='card-body text-center'>");

        // Ảnh avatar
        out.println("<img src='images/f1.jpg' alt='Avatar' class='avatar'>");

        // Thông tin sinh viên với icon FontAwesome
        out.println("<div class='info-item'><i class='fas fa-user'></i> <strong>Họ và Tên:</strong> Nguyễn Xuân Đạt</div>");
        out.println("<div class='info-item'><i class='fas fa-id-card'></i> <strong>Mã số sinh viên:</strong> 64130299</div>");
        out.println("<div class='info-item'><i class='fas fa-users'></i> <strong>Lớp:</strong> 64CNTT.CLC2</div>");
        out.println("<div class='info-item'><i class='fas fa-envelope'></i> <strong>Email:</strong> dat.nx.64cntt@ntu.edu.vn</div>");
        out.println("<div class='info-item'><i class='fas fa-heart'></i> <strong>Sở thích:</strong> Lập trình, Xem phim, Đọc sách</div>");

        out.println("</div>");
        out.println("<div class='card-footer text-center'>");
        out.println("<a href='/' class='btn btn-primary'><i class='fas fa-home'></i> Trang chủ</a>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>"); // Kết thúc div căn giữa

        out.println("</body>");
        out.println("</html>");
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

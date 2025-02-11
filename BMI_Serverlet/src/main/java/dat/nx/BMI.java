package dat.nx;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BMI", urlPatterns = {"/BMI"})
public class BMI extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public BMI() {
        super();
    }

    // Xử lý GET request: Hiển thị form nhập chiều cao, cân nặng
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='vi'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Tính Chỉ Số BMI</title>");
        out.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css'>");
        out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css'>");
        out.println("<style>");
        out.println("body { background: linear-gradient(135deg, #ff9a9e, #fad0c4); font-family: Arial, sans-serif; height: 100vh; display: flex; justify-content: center; align-items: center; }");
        out.println(".card { width: 100%; max-width: 400px; padding: 20px; border-radius: 15px; box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.2); background: white; }");
        out.println(".card h3 { text-align: center; color: #007bff; }");
        out.println(".form-control { border-radius: 10px; }");
        out.println(".btn-primary { background: #007bff; border-radius: 10px; font-size: 18px; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");

        out.println("<div class='card'>");
        out.println("<h3><i class='fas fa-weight'></i> Tính Chỉ Số BMI</h3>");
        out.println("<form action='/BMI_Serverlet/BMI' method='POST'>");
        out.println("<div class='mb-3'>");
        out.println("<label class='form-label'><i class='fas fa-ruler-vertical'></i> Chiều cao (m):</label>");
        out.println("<input type='number' step='0.01' class='form-control' name='height' required>");
        out.println("</div>");
        out.println("<div class='mb-3'>");
        out.println("<label class='form-label'><i class='fas fa-weight'></i> Cân nặng (kg):</label>");
        out.println("<input type='number' step='0.1' class='form-control' name='weight' required>");
        out.println("</div>");
        out.println("<button type='submit' class='btn btn-primary w-100'><i class='fas fa-calculator'></i> Tính BMI</button>");
        out.println("</form>");
        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }

    // Xử lý POST request: Tính toán và hiển thị kết quả BMI
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Lấy dữ liệu từ form
        double height = Double.parseDouble(request.getParameter("height"));
        double weight = Double.parseDouble(request.getParameter("weight"));

        // Tính BMI
        double bmi = weight / (height * height);
        String category;
        String color;

        // Xác định tình trạng cơ thể theo BMI
        if (bmi < 18.5) {
            category = "Dưới chuẩn (Gầy)";
            color = "text-warning";
        } else if (bmi < 24.9) {
            category = "Bình thường";
            color = "text-success";
        } else if (bmi < 29.9) {
            category = "Thừa cân";
            color = "text-danger";
        } else {
            category = "Béo phì";
            color = "text-danger fw-bold";
        }

        out.println("<!DOCTYPE html>");
        out.println("<html lang='vi'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Kết Quả BMI</title>");
        out.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css'>");
        out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css'>");
        out.println("<style>");
        out.println("body { background: linear-gradient(135deg, #a18cd1, #fbc2eb); font-family: Arial, sans-serif; height: 100vh; display: flex; justify-content: center; align-items: center; }");
        out.println(".card { width: 100%; max-width: 400px; padding: 20px; border-radius: 15px; box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.2); background: white; text-align: center; }");
        out.println(".card h3 { color: #007bff; }");
        out.println(".bmi-result { font-size: 22px; font-weight: bold; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");

        out.println("<div class='card'>");
        out.println("<h3><i class='fas fa-heartbeat'></i> Kết Quả BMI</h3>");
        out.printf("<p class='bmi-result %s'>BMI của bạn: %.2f</p>", color, bmi);
        out.printf("<p class='fw-bold'><i class='fas fa-info-circle'></i> Tình trạng: <span class='%s'>%s</span></p>", color, category);
        out.println("<a href='/BMI_Serverlet/BMI' class='btn btn-secondary'><i class='fas fa-redo'></i> Tính lại</a>");
        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}

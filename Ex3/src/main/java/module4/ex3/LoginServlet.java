package module4.ex3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Kiểm tra tài khoản và mật khẩu cứng
        if ("admin".equals(username) && "password123".equals(password)) {
            // Đăng nhập thành công, chuyển hướng đến trang thông báo
            response.sendRedirect("loginSuccess.jsp");
        } else {
            // Đăng nhập thất bại, hiển thị thông báo trên cùng trang
            request.setAttribute("message", "Tài khoản hoặc mật khẩu không chính xác");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}

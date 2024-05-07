package module4.ex2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/add")
public class UserServlet extends HttpServlet {

@Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        int age = Integer.parseInt(req.getParameter("age"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Id: "
                + id + "</h1>");
        writer.println("<h1>Name: " + name+"</h1>");
        writer.println("<h1> Email: " + email + "</h1>");
        writer.println("<h1> Age: " + age + "</h1>");
        writer.println("</html>");
    }


}
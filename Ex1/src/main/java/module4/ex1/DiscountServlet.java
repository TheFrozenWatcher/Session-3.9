package module4.ex1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(value = "/submit")
public class DiscountServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }


    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        float discount=Float.parseFloat(req.getParameter("discount"));
        float listPrice=Float.parseFloat(req.getParameter("list-price"));
        float discountedPrice=listPrice*(100-discount)/100;
        String description = req.getParameter("description");
        PrintWriter writer=resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Mô tả: "
                +description + "</h1>");
        writer.println("<h1>Giá gốc: "
                + listPrice + "</h1>");
        writer.println("<h1>Chiết khấu: " + discount + " %</h1>");
        writer.println("<h1>Giá chiết khấu: " + discountedPrice + "</h1>");
        writer.println("</html>");

    }
}
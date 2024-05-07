package module4.ex4.controller;

import module4.ex4.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

@WebServlet(name = "ProductServlet", value = "/ProductServlet")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024, // 1MB - kích thước bộ nhớ tạm
        maxFileSize = 1024 * 1024 * 5,   // 5MB
        maxRequestSize = 1024 * 1024 * 5 * 10 // 50MB
)
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "add.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uploadPath = "C:\\Users\\HUNG\\IdeaProjects\\Module 3 JAVA\\Session 3.9\\Ex4\\src\\main\\webapp\\upload";
        String name = request.getParameter("name");
        float price = Float.parseFloat(request.getParameter("price"));
        int stock = Integer.parseInt(request.getParameter("stock")); // corrected getIntHeader to parseInt
        Part file = request.getPart("file");
        String fileName = file.getSubmittedFileName();
        String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
        String saveFileName = System.currentTimeMillis() + "." + fileExtension; // generate a unique filename
        Product product = new Product(name, price, stock, "/uploads/" + saveFileName);
        file.write(uploadPath + File.separator + saveFileName);
        request.setAttribute("product", product); // set the product attribute
        request.getRequestDispatcher("WEB-INF/list.jsp").forward(request, response);
    }

}
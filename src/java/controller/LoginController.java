package controller;

import service.UserService;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("Login");
        String password = req.getParameter("Password");

        if(userService.checkIfValid(username,password)){
            req.getSession().setAttribute("login",username);

            resp.sendRedirect(getServletContext().getContextPath()+ "/");
        }else{
            getServletContext().getRequestDispatcher("/login.jsp").forward(req,resp);
        }



    }
}
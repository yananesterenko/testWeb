package servlet;

import model.User;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse respons) throws ServletException, IOException {
        String user = req.getParameter("user");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("pass");
        if (login == null || password == null) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/wrong.jsp");
            dispatcher.forward(req, resp);
        } else {
            User user = UserService.getUserByLoginAndPassword(login, password);
            if (user != null) {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/collection.jsp");
                dispatcher.forward(req, resp);
            } else {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/wrong.jsp");
                dispatcher.forward(req, resp);
            }

        }
    }
}

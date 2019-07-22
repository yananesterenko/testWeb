package servlet;

import model.User;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UserRegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse respons) throws ServletException, IOException {
        String user = req.getParameter("user");

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("firstName");
        String secondname = req.getParameter("secondName");
        String login = req.getParameter("login");
        String password = req.getParameter("pass");
        if (firstname == null || secondname == null || login == null || password == null) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/wrongRegistration.jsp");
            dispatcher.forward(req, resp);
        } else {
            User user = UserService.addUser(firstname, secondname, login, password);
            System.out.println(user);
            if (user != null) {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/collection.jsp");
                dispatcher.forward(req, resp);
            } else {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/wrongRegistration.jsp");
                HttpSession session = req.getSession();
                session.setAttribute("user", String.format("%s %s", firstname, secondname));
                dispatcher.forward(req, resp);
            }

        }
    }
}

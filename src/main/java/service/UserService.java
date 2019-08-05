package service;

import dao.ConnectionPostgress;
import dao.UserDaoImpl;
import model.User;

import java.sql.Connection;
import java.sql.SQLException;

public class UserService {


    public static User getUserByLoginAndPassword(String login, String password) {
        User user = null;
        try {
            Connection connection = new ConnectionPostgress().getConnection();
            if (connection != null){
            user = UserDaoImpl.getUserByLoginPass(login, password, connection);
            connection.close();}
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public static User addUser(String firstname, String secondname, String login, String password) {
        User user = null;
        Connection connection = new ConnectionPostgress().getConnection();
        user = UserDaoImpl.addUser(firstname, secondname,login, password, connection);

        return user;
    }


}

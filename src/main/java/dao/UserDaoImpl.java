package dao;

import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl {

    public static User getUserByLoginPass(String login, String pass, Connection connection) {
        String sql = "SELECT firstname, lastname FROM users WHERE login = '" + login + "'";
        System.out.println();
        User user = null;
        try {
            connection.setAutoCommit(false);
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                user.setFirstName(rs.getString(2));
                user.setLastName(rs.getString(3));
            }
            connection.close();
            //connection.commit();
            // logger.info("Item " + item.getName() + " was added");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public static User addUser(String firstname, String secondname, String login, String pass, Connection connection) {
        String sql = "INSERT INTO users (firstname, lastname, login, password) VALUES (?, ?, ?, ?)";
        User user = null;
        try {
            connection.setAutoCommit(false);
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, firstname);
            stm.setString(2, secondname);
            stm.setString(3, login);
            stm.setString(4, pass);
            stm.executeUpdate();
            connection.commit();

            String sqlSelect = "SELECT id FROM users where firstname = '"+ firstname + "' and  lastname = '" +secondname +"'" ;
            stm = connection.prepareStatement(sqlSelect);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setFirstName(firstname);
                user.setLastName(secondname);
                user.setLogin(login);
                user.setPassword(pass);
            }
            connection.close();
            // logger.info("Item " + item.getName() + " was added");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;

    }

}

package dao;


import model.User;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDaoImplTest {

    @Test
    public void getUserByLoginPass() {
    }

    @Test
    public void addUser() {

        try {
            Connection connection = new ConnectionPostgress().getConnection();
            User user = UserDaoImpl.addUser("YanaTest", "NTest", "ne_yana", "123456", connection);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
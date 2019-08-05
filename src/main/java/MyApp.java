import dao.ConnectionPostgress;
import dao.UserDaoImpl;
import model.User;

import java.sql.Connection;
import java.sql.SQLException;

public class MyApp {
    public static void main(String[] args) {

        Connection connection = new ConnectionPostgress().getConnection();
        User user = UserDaoImpl.getUserByLoginPass("q", "q", connection);

    }
}

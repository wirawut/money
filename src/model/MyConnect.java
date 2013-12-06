package model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class MyConnect {

    String db_name = "db_money";
    String db_user = "root";
    String db_pass = "1234";
    String db_host = "localhost";
    String db_driver = "com.mysql.jdbc.Driver";

    public java.sql.Connection getConnection() {
        try {
            Class.forName(db_driver);
            String url = "jdbc:mysql://" + db_host + "/" + db_name;
            return DriverManager.getConnection(url, db_user, db_pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

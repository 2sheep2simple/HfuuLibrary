import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @program: HfuuLibrary
 * @description: 数据库连接工具类
 * @author: 2simple
 * @create: 2019-03-30 21:58
 **/
public class Util {

    public static Connection getConn() {
        String DRIVER = "com.mysql.jdbc.Driver";
        String URL = "jdbc:mysql://39.108.128.88:3306/library?useUnicode=true&characterEncoding=utf8";
        String USERNAME = "root";
        String PASSWORD = "1q2w3E4!";
        Connection conn = null;
        try {
            Class.forName(DRIVER); //classLoader,加载对应驱动
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}

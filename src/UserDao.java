import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program: HfuuLibrary
 * @description: dao类
 * @author: 2simple
 * @create: 2019-03-30 00:42
 **/
public class UserDao {

    public int login(String name,String password) throws SQLException {
        int ifLogined = 0; // 默认未登陆

        Connection conn = Util.getConn();
        PreparedStatement pstmt;
        String sql = "SELECT password,status FROM user WHERE name =  "+name+" ";
        System.out.println(sql);
        try {
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs != null){
                if (password.equals(rs.getString("password"))){
                    ifLogined = 1;
                    return ifLogined;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ifLogined;
    }

}

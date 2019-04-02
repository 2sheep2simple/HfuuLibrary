import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: HfuuLibrary
 * @description:
 * @author: 2simple
 * @create: 2019-03-30 00:58
 **/

public class BookDao {

    public List<Book> getAllBook(String name)throws SQLException  {

        List<Book> list = new ArrayList();

        Connection conn = Util.getConn();
        PreparedStatement pstmt;
        StringBuilder sqlBuilder = new StringBuilder("SELECT id,name,author,press,pressdate FROM book WHERE name LIKE ");
        sqlBuilder.append("'%"+name+"%'");
        String sql = sqlBuilder.toString();
        System.out.println(sql);

        try {
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while ( rs.next()) {
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setAuthor(rs.getString("author"));
                book.setPress(rs.getString("press"));
                book.setPressdate(rs.getString("pressdate"));
                System.out.println(rs.getInt("id")+rs.getString("name")+rs.getString("author"));
                list.add(book);
            }
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public Book getBookDetail(String id) throws SQLException{
        Book book = new Book();
        Connection conn = Util.getConn();
        PreparedStatement pstmt;

        String sql = "SELECT id,name,address,status,detail FROM book WHERE id = "+id+" ";
        System.out.println(sql);

        try {
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while ( rs.next()) {
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setAddress(rs.getString("address"));
                book.setStatus(rs.getString("status"));
                book.setDetail(rs.getString("detail"));
                System.out.println(rs.getInt("id")+rs.getString("name")+rs.getString("status"));
            }
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return book;
    }

    public static int borrow(String id) throws SQLException {
        int ifUpdate = 0; // 默认未登陆
        Connection conn = Util.getConn();
        Statement stmt = null ;
        String sql = "update book set status = '已出馆' where id = '"+id+"'";
        System.out.println(sql);
        try {
            stmt = conn.prepareStatement(sql);
            ifUpdate = stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        stmt.close();
        conn.close();
        return ifUpdate;
    }




}

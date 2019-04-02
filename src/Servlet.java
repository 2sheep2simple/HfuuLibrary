import net.sf.json.JSONArray;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,HttpServletResponse  response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse  response) throws javax.servlet.ServletException, IOException {

        /*设置字符编码*/
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String requestType = request.getParameter("msg");

        if (requestType.equals("0")){
            String name = request.getParameter("name");
            System.out.println("search name:"+name);
            BookDao bookDao = new BookDao();
            try {
                List<Book> books = bookDao.getAllBook(name);
                JSONArray jsonArray = JSONArray.fromObject(books);
                response.getWriter().println(jsonArray);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else if (requestType.equals("1")){
            BookDao bookDao = new BookDao();
            String id = request.getParameter("id");
            try {
                Book book = bookDao.getBookDetail(id);
                JSONArray jsonArray = JSONArray.fromObject(book);
                response.getWriter().println(jsonArray);
            }catch (SQLException e){
                e.printStackTrace();
            }

        } else if(requestType.equals("2")){
            UserDao userDao = new UserDao();
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            try {
                int ifLogined = userDao.login(name,password);
                response.getWriter().println(ifLogined);
            }catch (SQLException e){
                e.printStackTrace();
            }

        } else if(requestType.equals("3")){
            UserDao userDao = new UserDao();
            String id = request.getParameter("id");
            try {
                int ifUpdate = BookDao.borrow(id);
                response.getWriter().println(ifUpdate);
            }catch (SQLException e){
                e.printStackTrace();
            }

        }


    }
}

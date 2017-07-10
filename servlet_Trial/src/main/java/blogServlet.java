package main.java;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
public class blogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String blog = request.getParameter("AddBlog");
        HttpSession session=request.getSession(true);
        Integer uid = (Integer) session.getAttribute("uid");
            connect c1 = new connect();
            try {
                String queryText = "insert into addblog(uId,blogContent) values(?,?)";
                PreparedStatement ps = c1.con.prepareStatement(queryText);
                ps.setInt(1, uid);
                ps.setString(2, blog);
                int status = ps.executeUpdate();
                if(status>0){
                    //out.println("<p>Blog saved successfully!</p>");
                    request.getRequestDispatcher("Welcome.jsp").include(request, response);
                }
               /* else{
                    out.println("Sorry! Unable to save Blog");
                }*/
                ps.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
    }
}
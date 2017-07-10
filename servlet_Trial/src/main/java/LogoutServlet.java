package main.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try{
            HttpSession session=request.getSession(false);
            //session.removeAttribute("name");
            if(session!=null)
                session.invalidate();
            response.sendRedirect("login.jsp");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}


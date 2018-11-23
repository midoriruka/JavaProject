package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import dao.HeroDAO;
/**
 * @author sijt
 * @date 2018/11/22 15:31.
 */
public class HeroDeleteServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        int id=Integer.parseInt(request.getParameter("id"));
        HeroDAO h=new HeroDAO();
        h.delete(id);
        response.sendRedirect("/login/listHero");
    }

}

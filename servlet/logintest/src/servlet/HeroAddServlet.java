package servlet;

/**
 * @author sijt
 * @date 2018/11/22 14:33.
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Hero;
import dao.HeroDAO;

public class HeroAddServlet extends HttpServlet{
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        Hero h=new Hero();
        h.setName(request.getParameter("name"));
        h.setHp(Float.parseFloat(request.getParameter("hp")));
        h.setDamage(Integer.parseInt(request.getParameter("damage")));
        new HeroDAO().add(h);
        response.sendRedirect("/login/listHero");
    }
}

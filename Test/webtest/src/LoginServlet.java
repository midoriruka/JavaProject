/**
 * @author sijt
 * @date 2018/11/16 17:57.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
    throws ServletException,IOException{
        String name=request.getParameter("name");
        String password=request.getParameter("password");
//        System.out.println("浏览器发出请求时的完整URL，包括协议 主机名 端口(如果有): " + request.getRequestURL());
//        System.out.println("浏览器发出请求的资源名部分，去掉了协议和主机名: " + request.getRequestURI());
//        System.out.println("请求行中的参数部分: " + request.getQueryString());
//        System.out.println("浏览器所处于的客户机的IP地址: " + request.getRemoteAddr());
//        System.out.println("浏览器所处于的客户机的主机名: " + request.getRemoteHost());
//        System.out.println("浏览器所处于的客户机使用的网络端口: " + request.getRemotePort());
//        System.out.println("服务器的IP地址: " + request.getLocalAddr());
//        System.out.println("服务器的主机名: " + request.getLocalName());
//        System.out.println("得到客户机请求方式: " + request.getMethod());

        System.out.println("name:" + name);
        System.out.println("password:" + password);
//        String html=null;
//        if("admin".equals(name)&& "1234".equals(password)){
//            html="<div>success</div>";
//        }
//        else{
//            html="<div>fail</div>";
//        }
//        PrintWriter pw=response.getWriter ();
//        pw.println(html);
//        if("admin".equals(name)&& "1234".equals(password)){
//            request.getRequestDispatcher("success.html").forward(request,response);
//        }
//        else{
//            response.sendRedirect("fail.html");
//        }
    }
}

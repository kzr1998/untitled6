package it;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       int num=Integer.parseInt(request.getParameter("number"));
       int sum=0;
        for(int i = 0; i<=num; i ++)
        {
            sum = sum + i;
        }
       PrintWriter out= response.getWriter();
       out.print(sum);
//       request.setAttribute("sum",sum);
//        RequestDispatcher rd=request.getRequestDispatcher("/it.Servlet2");
//        rd.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       this.doPost(request,response);
    }
}

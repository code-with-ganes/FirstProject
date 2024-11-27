package project_product;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/admin")
public class Adminlogi extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest srq,HttpServletResponse rsp)throws ServletException,IOException {
		Demoinfo di=new AdminDao().login(srq.getParameter("uname"), srq.getParameter("pword"));
		if(di==null) {
			srq.setAttribute("msg", "invalid user && possword");
			RequestDispatcher dc=srq.getRequestDispatcher("msgloh.jsp");
			dc.forward(srq, rsp);
		}
		else {
			HttpSession hp=srq.getSession();
			hp.setAttribute("uDemoinfo", di);
			RequestDispatcher dc=srq.getRequestDispatcher("adlogin.jsp");
			dc.forward(srq, rsp);
			
		}
		
	}

}

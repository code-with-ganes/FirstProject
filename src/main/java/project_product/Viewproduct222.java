package project_product;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/view")
public class Viewproduct222 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest rsq,HttpServletResponse rsp) throws ServletException, IOException {
		HttpSession hs=rsq.getSession(false);
		if(hs==null) {
			rsq.setAttribute("msg", "invalidproduct");
			RequestDispatcher dc=rsq.getRequestDispatcher("msgloh.jsp");
			dc.forward(rsq, rsp);
		}else {
			ArrayList<ProductBean>al=new Viewproduct().views();
			hs.setAttribute("al", al);
			RequestDispatcher dc=rsq.getRequestDispatcher("viewp.jsp");
			dc.forward(rsq, rsp);
			
		}
	}

}

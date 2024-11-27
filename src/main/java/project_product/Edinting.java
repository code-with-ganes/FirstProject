package project_product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/edit")
public class Edinting extends HttpServlet{
    @SuppressWarnings("unchecked")
	@Override
	public void doGet(HttpServletRequest rsq,HttpServletResponse rsp)throws ServletException,IOException {
		HttpSession hs=rsq.getSession(false);
		if(hs==null) {
			rsq.setAttribute("msg", "edit is not possible");
			RequestDispatcher dc=rsq.getRequestDispatcher("msgloh.jsp");
			dc.forward(rsq, rsp);
		}else {
			String pcode=rsq.getParameter("code");
			ArrayList<ProductBean>al= (ArrayList<ProductBean>)hs.getAttribute("al");
			Iterator<ProductBean> it=al.iterator();
					while(it.hasNext()) {
						ProductBean pb=(ProductBean)it.next();
						if(pcode.equals(pb.getCode())) 
						{
							rsq.setAttribute("pb", pb);
							RequestDispatcher dc=rsq.getRequestDispatcher("Editproduct.jsp");
							dc.forward(rsq, rsp);
							break;
				}
						
			}
		}
	}

}

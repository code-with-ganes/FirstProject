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
@WebServlet("/add")
public class Addproduct11 extends HttpServlet {
	@Override
    public void doPost(HttpServletRequest rsq,HttpServletResponse rsp)throws ServletException,IOException
    {
    	HttpSession hs=rsq.getSession(false);
    	if(hs==null) {
    		rsq.setAttribute("msg", "product invalid.....<br>");
    		RequestDispatcher dc=rsq.getRequestDispatcher("msgloh.jsp");
    		dc.forward(rsq, rsp);
    	}
    	else {
    		ProductBean pb=new ProductBean();
    		pb.setCode(rsq.getParameter("code"));
    		pb.setName(rsq.getParameter("name"));
    		pb.setPrice(Long.parseLong(rsq.getParameter("price")));
    		pb.setQty(Long.parseLong(rsq.getParameter("qty")));
    		int k =new AddproductDao().add(pb);
    		if(k>0) {
    			rsq.setAttribute("msg", "insert successfully.....?");
    			RequestDispatcher dc=rsq.getRequestDispatcher("addproduct.jsp");
    			dc.forward(rsq, rsp);
    		}
    	}
    	
    	
    }
}

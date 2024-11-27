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
@WebServlet("/ubdate")
public class Updateproduct extends HttpServlet {
	
	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest rsq,HttpServletResponse rsp)throws ServletException,IOException
	{
	          HttpSession hs=rsq.getSession(false);
	          if(hs==null) {
	        	  rsq.setAttribute("msg", "session Expired...<br>");
	        	  RequestDispatcher dc=rsq.getRequestDispatcher("msgloh.jsp");
	        	  dc.forward(rsq, rsp);
	          }
	          else {
	        	  String pcode=rsq.getParameter("code");
	        	  String pname=rsq.getParameter("name");
	        	  long pprice=Long.parseLong(rsq.getParameter("price"));
	        	  long pqty=Long.parseLong(rsq.getParameter("qty"));
	        	  ArrayList<ProductBean>al=(ArrayList<ProductBean>)hs.getAttribute("al");
	        	  Iterator<ProductBean>it=al.iterator();
	        	  while(it.hasNext()) {
	        		  ProductBean pb=(ProductBean)it.next();
	        		  if(pcode.equals(pb.getCode())) {
	        			  pb.setName(pname);
	        			  pb.setPrice(pprice);
	        			  pb.setQty(pqty);
	        			  int k=new EditingDao().editing(pb);
	        			  if(k>0) {
	        				  rsq.setAttribute("msg", "update successfullll");
	        				  RequestDispatcher dc=rsq.getRequestDispatcher("updatepromax.jsp");
	        				  dc.forward(rsq, rsp);
	        				  
	        			  }
	        			  break;
	        		  }
	        	  }
	        	  
	          }
	}

}

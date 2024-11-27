package project_product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Viewproduct {
	ArrayList<ProductBean>al=new ArrayList<ProductBean>();
	public ArrayList<ProductBean>views(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","0008");
			PreparedStatement pc1=con.prepareStatement("select * from product63");
			ResultSet rr=pc1.executeQuery();
			while(rr.next()) {
				ProductBean pb=new ProductBean();
				pb.setCode(rr.getString(1));
				pb.setName(rr.getString(2));
				pb.setPrice(rr.getLong(3));
				pb.setQty(rr.getLong(4));
				al.add(pb);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return al;
		
	}
		
}

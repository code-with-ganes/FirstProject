package project_product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddproductDao {
	
	public int k=0;
	public int add(ProductBean pb) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","0008");
			PreparedStatement pc=con.prepareStatement("insert into product63 values(?,?,?,?)");
			pc.setString(1, pb.getCode());
			pc.setString(2, pb.getName());
			pc.setLong(3, pb.getPrice());
			pc.setLong(4, pb.getQty());
			k=pc.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return k;
	}

}

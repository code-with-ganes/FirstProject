package project_product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EditingDao {
	
	public int k=0;
	public int editing(ProductBean pb) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","0008");
			PreparedStatement pc=con.prepareStatement("update product63 set name=?,price=?,qty=? where code=?");
			pc.setString(1, pb.getName());
			pc.setLong(2, pb.getPrice());
			pc.setLong(3, pb.getQty());
			pc.setString(4, pb.getCode());
			k=pc.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return k;
		
	}

}

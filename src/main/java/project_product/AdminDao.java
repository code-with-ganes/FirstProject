package project_product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDao {
	public Demoinfo di=null;
	public Demoinfo login(String un,String psw) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","0008");
			PreparedStatement pc=con.prepareStatement("select * from admin63 where uname=? and PWORD=?");
			pc.setString(1, un);
			pc.setString(2, psw);
			ResultSet rr=pc.executeQuery();
			if(rr.next()) {
				di=new Demoinfo();
				di.setUname(rr.getString(1));
				di.setPword(rr.getString(2));
				di.setFname(rr.getString(3));
				di.setLname(rr.getString(4));
				di.setMid(rr.getString(5));
				di.setAddr(rr.getString(6));
				di.setPhno(rr.getLong(7));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return di;
	}

}

package web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import web.entity.Category;

public class CategoryService {

	
	
	public List<Category> getList(){
		List<Category> list = new ArrayList<>();
		
		String sql = "SELECT * FROM STUDY_CATEGORY";

		
		String url = "jdbc:oracle:thin:@1.222.116.188:1521/xepdb1";
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "STUDYIN", "STUDYIN!@");
		
		PreparedStatement st = con.prepareStatement(sql);
		
		Category category = new Category();
		
		String id = st.getInt("id");
		
		
		list = st.executeQuery();
		
		st.close();
		con.close();
		
		return list;
		
	}
}

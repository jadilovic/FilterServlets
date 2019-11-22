package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Account {

	private Connection conn;
	
	public Account(Connection conn){
		this.conn = conn;
	}
	
	public boolean login(String username, String password) throws SQLException{
		
		String sql = "SELECT COUNT(*) AS COUNT FROM user WHERE username=? AND password=?";
		
		PreparedStatement stat = conn.prepareStatement(sql);
		
		stat.setString(1, username);
		stat.setString(2, password);
		
		ResultSet rs = stat.executeQuery();
		
		int count = 0;
		
		if(rs.next()){
			count = rs.getInt("COUNT");
		}
		
		rs.close();
		
		if(count == 0){
			return false;
		} else {
			return true;
		}
	}
}

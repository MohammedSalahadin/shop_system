package project.shop.com;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class DBConnection {
	private String url = "jdbc:mysql://localhost/bikepartsshop";
	private String user = "root";
	private String password = "";

	public Connection connection;
	
	public DBConnection() {
		loadDriver();
		connectToDb();
		
	}
	
	private void loadDriver() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		}
		catch(ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void connectToDb() {
		try {
			setConnection(DriverManager.getConnection(url,user,password));
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public Connection getConnection() {
		return connection;
	}

}

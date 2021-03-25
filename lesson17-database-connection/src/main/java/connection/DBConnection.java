package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;




public class DBConnection {
	public static Connection connection;
	


	public static Connection getConnection() {
		// driver
		if (connection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Properties props= DBProvider.getProperties();
				connection=DriverManager.getConnection(props.getProperty("URL"),props.getProperty("USER"),props.getProperty("PASSWORD"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
	public static void main(String[] args) {
		System.out.println("info:"+getConnection());
	}
}
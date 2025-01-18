package Ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static final String URL= "jdbc:mysql://localhost:3306/crud_java";
	private static final String USER= "root";
	private static final String PASSWORD= "123456789";
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexión Exitosa");
		} catch (Exception e){
			e.printStackTrace();
			
		}
		
		return con; 
	}
}

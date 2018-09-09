package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

import org.testng.annotations.Test;

import java.sql.ResultSet;

import java.sql.Statement;

public class ConnectMySQL {

	@Test
	public void testDB() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver1");
		System.out.println("Driver Loaded");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium?user=root&password=root");

		System.out.println("Coonected to MySQL DB");

		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from seleniumuser");

		while (rs.next()) {

			String firstname = rs.getString("firstname");
			System.out.println("Database record is  " + firstname);
			String email = rs.getString("email");
			System.out.println("Database record is        " + email);

		}
	}
}
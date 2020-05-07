package com.activity.activity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class ActivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivityApplication.class, args);

		String connectionUrl =
				"jdbc:sqlserver://DESKTOP-G1UMMVA\\SQLEXPRESS;databaseName=EtkinlikDb;integratedSecurity=true";

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			String SQL = "SELECT  * FROM Member";
			ResultSet rs = stmt.executeQuery(SQL);

			while (rs.next()) {
				System.out.println(rs.getString("Member_Id") + " " + rs.getString("Name"));
			}
// Code here.
			String a="";
		}
// Handle any errors that may have occurred.
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

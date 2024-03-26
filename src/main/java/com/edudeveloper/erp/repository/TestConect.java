package com.edudeveloper.erp.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConect {
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jsfprimefacescad","postgres","root");
		if(con != null) {
			System.out.println("Database Connected...");
		}
	}

}

package br.com.ex.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() throws SQLException, ClassNotFoundException {
		// Registrar o driver jdbc
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost/exercicio?characterEncoding=utf8";
		return DriverManager.getConnection(url, "root", "jesuscristo");
	}

}

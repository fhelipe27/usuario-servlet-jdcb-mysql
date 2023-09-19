package br.com.ex.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

	// Atributos
	private Connection cn;

	// Método construtor
	public UsuarioDAO() throws ClassNotFoundException, SQLException {
		cn = new ConnectionFactory().getConnection();
	}

	// Método para adicionar um novo usuário
	public void adiciona(Usuario usuario) throws SQLException {
		String sql = "insert into usuario(nome, senha) values(?, md5(?))";

		PreparedStatement stmt = cn.prepareStatement(sql);
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getSenha());

		// Execução do comando
		stmt.execute();
	}
}

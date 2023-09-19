package br.com.ex.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ex.model.Usuario;
import br.com.ex.model.UsuarioDAO;

public class UsuarioAction extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Captura dos dados
		String nome = req.getParameter("txtNome");
		String senha = req.getParameter("txtSenha");

		// Montagem do objeto
		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setSenha(senha);

		UsuarioDAO dao;
		try {
			dao = new UsuarioDAO();
			dao.adiciona(usuario);
			resp.getWriter().println("Gravação ok!");
		} catch (SQLException e) {
			resp.getWriter().println("Erro de SQL: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			resp.getWriter().println("JDBC com erro: " + e.getMessage());
		}
	}
}

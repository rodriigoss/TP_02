package persistencia;


import java.sql.*;

public class Conexao {
	private String Host;
	private String Usuario;
	private String Senha;
	private String Banco;

	public Conexao() {
		this.Banco = "ligaUFC";
		this.Host = "localhost";   //"localhost:3305" <==na minha maquina linux pra conectar
		this.Usuario = "root";
		this.Senha = "";

	}

	public Connection getConexao() {
		try {
			String url = "jdbc:mysql://" + this.Host + "/" + this.Banco;
			return DriverManager.getConnection(url, this.Usuario, this.Senha);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}

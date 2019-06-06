package persistencia;

import tp_1.Lutador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LutadorDAO {
	
	
	public ArrayList<Lutador> selecionarTodos() {
		ArrayList<Lutador> ArrayLutadors = new ArrayList<Lutador>();
		try {
			Connection conexao = new Conexao().getConexao();

			ResultSet result = conexao.prepareStatement("SELECT * FROM Lutador;").executeQuery();

			Lutador Lutador;
			while (result.next()) {
				Lutador = new Lutador();
				
				Lutador.setIdLutador(result.getInt("idLutador"));
				Lutador.setNome(result.getString("nome"));
				Lutador.setSexo(result.getString("sexo"));
				Lutador.setPais(result.getString("pais"));
				Lutador.setCategoria(result.getString("categoria"));
				ArrayLutadors.add(Lutador);
			}
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ArrayLutadors;
	}

	public Lutador selecionar(Lutador LutadorEntity) {
		Lutador Lutador = new Lutador();
		try {
			Connection conexao = new Conexao().getConexao();
			ResultSet result = conexao
					.prepareStatement("SELECT * FROM Lutador WHERE IdLutador = " + LutadorEntity.getIdLutador()).executeQuery();

			while (result.next()) {
				Lutador.setIdLutador(result.getInt("idLutador"));
				Lutador.setNome(result.getString("nome"));
				Lutador.setSexo(result.getString("sexo"));
				Lutador.setPais(result.getString("pais"));
				Lutador.setCategoria(result.getString("categoria"));
			}
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return Lutador;
	}

	public boolean inserir(Lutador Lutador) {
		int valor = 0;
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement result = conexao.prepareStatement("INSERT INTO Lutador (nome, sexo,pais, categoria) values (?,?,?,?);");

			result.setString(1, Lutador.getNome());
			result.setString(2, Lutador.getSexo());
			result.setString(3, Lutador.getPais());
			result.setString(4, Lutador.getCategoria());

			valor = result.executeUpdate();
			conexao.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (valor == 1)
			return true;
		else
			return false;

	}

	public void deletar(Lutador a) {
		try {
			Connection conexao = new Conexao().getConexao();
			PreparedStatement result = conexao.prepareStatement("DELETE FROM Lutador WHERE IdLutador = ?;");

			result.setInt(1, a.getIdLutador());
			result.executeUpdate();
			conexao.close();
		} catch (Exception e) {

		}

	}
}

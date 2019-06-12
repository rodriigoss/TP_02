package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import tp_1.Luta;

public class LutaDAO {
	
	public ArrayList<Luta> selecionarTodos() {
		ArrayList<Luta> ArrayLutas = new ArrayList<Luta>();
		try {
			Connection conexao = new Conexao().getConexao();

			ResultSet result = conexao.prepareStatement("SELECT * FROM Luta;").executeQuery();

			Luta Luta;
			while (result.next()) {
				Luta = new Luta();
				
				Luta.setIdLuta(result.getString("idLuta"));
				Luta.setAnoLiga(result.getString("anoLiga"));
				Luta.setVencedor(result.getString("vencedor"));
				Luta.setLutador1(result.getString("lutador1"));
				Luta.setLutador2(result.getString("lutador2"));
				ArrayLutas.add(Luta);
			}
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ArrayLutas;
	}

	public Luta selecionar(Luta LutaEntity) {
		Luta Luta = new Luta();
		try {
			Connection conexao = new Conexao().getConexao();
			ResultSet result = conexao
					.prepareStatement("SELECT * FROM Luta WHERE IdLuta = " + LutaEntity.getIdLuta()).executeQuery();

			while (result.next()) {
				Luta.setIdLuta(result.getString("idLuta"));
				Luta.setAnoLiga(result.getString("anoLiga"));
				Luta.setVencedor(result.getString("vencedor"));
				Luta.setLutador1(result.getString("lutador1"));
				Luta.setLutador2(result.getString("lutador2"));
			}
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return Luta;
	}

	public boolean inserir(Luta Luta) {
		int valor = 0;
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement result = conexao.prepareStatement("INSERT INTO Luta (idLuta,anoLiga,vencedor,lutador1,lutador2) values (?,?,?,?,?);");

			result.setString(1, Luta.getIdLuta());
			result.setString(2, Luta.getAnoLiga());
			result.setString(3, Luta.getVencedor());
			result.setString(4, Luta.getLutador1());
			result.setString(5, Luta.getLutador2());


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

	/*public void deletar(Luta a) {
		try {
			Connection conexao = new Conexao().getConexao();
			PreparedStatement result = conexao.prepareStatement("DELETE FROM Luta WHERE IdLuta = ?;");

			result.setInt(1, a.getIdLuta());
			result.executeUpdate();
			conexao.close();
		} catch (Exception e) {

		}

	}*/
  
}

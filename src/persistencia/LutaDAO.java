package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import tp_1.Luta;
import tp_1.Strings;

public class LutaDAO {
	
	public void selecionarTodos() {
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
		Strings.printLutas(ArrayLutas);

	}

	public  void selecionarFinals() {
		String vencedor;
		String numLutas;
		try {
			Connection conexao = new Conexao().getConexao();
			ResultSet result = conexao
					.prepareStatement("SELECT count(*) as NumVitorias, vencedor FROM Luta GROUP BY vencedor ORDER BY SUM(pontosVencedor)  DESC LIMIT 1;").executeQuery();

			while (result.next()) {
				numLutas=result.getString("NumVitorias");
				vencedor=result.getString("vencedor");
                Strings.printFinals(numLutas, vencedor);
			}
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean inserir(Luta Luta) {
		int valor = 0;
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement result = conexao.prepareStatement("INSERT INTO Luta (idLuta,anoLiga,vencedor,pontosVencedor,lutador1,lutador2) values (?,?,?,?,?,?);");

			result.setString(1, Luta.getIdLuta());
			result.setString(2, Luta.getAnoLiga());
			result.setString(3, Luta.getVencedor());
			result.setInt(4, Luta.getPontosVencedor());
			result.setString(5, Luta.getLutador1());
			result.setString(6, Luta.getLutador2());


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


  
}

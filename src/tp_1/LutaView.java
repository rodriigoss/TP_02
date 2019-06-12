package tp_1;

import java.util.ArrayList;
import java.util.Scanner;

import persistencia.LutaDAO;

public class LutaView {

	private Scanner scan = new Scanner(System.in);
	public void Inicio() {
		String val = "1";
		while (val != "0") {
			System.out.println("\nEscolha uma Operacao - Tela Luta");
			System.out.println("__________________________");
			System.out.println("[1] Relatorio de Luta");
			System.out.println("[2] Pesquisar um Luta");
			System.out.println("[3] Cadastrar Luta");

			System.out.println("__________________________");

			val = scan.nextLine();
			switch (val) {
			case "1":
				Listar();
				break;
			case "2":
				ListarUnidade();
				break;
			case "3":
				//Novo();
				break;
			default:
				return;
			}
		}
	}

	public void Listar() {
		LutaDAO LutaRepository = new LutaDAO();
		ArrayList<Luta> listLuta = LutaRepository.selecionarTodos();
		for (Luta Luta : listLuta) {
			System.out.println("Codigo: " + Luta.getIdLuta() + "\n" + "Nome: " + Luta.getAnoLiga() + "\n"
					 + "______________________________");
		}
	}
/*	public void historiocoLocacao() {
		LocacaoDAO locacaoRepository = new LocacaoDAO();
		Luta LutaEntity = new Luta();
		System.out.println(" Entre com o codigo do Luta para ver seu historico");
		String aux = scan.nextLine();
		LutaEntity.setIdLuta(Integer.valueOf(aux));
		ArrayList<Locacao> listLocacao = locacaoRepository.historicoLutaLocacao(LutaEntity);
		for (Locacao locacao : listLocacao) {
			System.out.println("Codigo Registro: " + locacao.getIdLocacao() + "\n" + "Codigo Luta: "
					+ locacao.getIdLuta() + "\n" + "Codigo Livro: " + locacao.getIdLivro() + "\n"
					+ "Codigo Data Emprestimo: " + locacao.getDataEmprestimo() + "\n" + "Codigo Data Prevista: "
					+ locacao.getDataPrevista() + "\n" + "Codigo Data Entrega: " + locacao.getDataEntrega() + "\n"
					+ "_______________________________");
		}
	}*/


	public void ListarUnidade() {
		LutaDAO LutaRepository = new LutaDAO();
		Luta LutaEntity = new Luta();
		System.out.print("Digite o codigo para buscar o dados do Luta:");
		String aux = scan.nextLine();
		LutaEntity.setIdLuta(aux);
		Luta Luta = LutaRepository.selecionar(LutaEntity);
		if (Luta != null && Integer.valueOf(Luta.getIdLuta())>0) {
		System.out.println("Codigo: " + Luta.getIdLuta() + "\n" + "Nome: " + Luta.getAnoLiga() + "\n"  + "______________________________");
		return;
		}
		System.out.println("Registro nao encontado!");
		return;
	}

	public void Novo(String idLuta,String anoLiga, String vencedor, String lutador1, String lutador2) {
		LutaDAO LutaRepository = new LutaDAO();
		Luta Luta = new Luta();
		//System.out.print("Digite o novo Nome:");
		//String aux = scan.nextLine();
		Luta.setIdLuta(idLuta);
		//System.out.print("Digite a sexo:");
		//String aux1 = scan.nextLine();
		Luta.setAnoLiga(anoLiga);
		//System.out.print("Digite a pais:");
		//String aux2 = scan.nextLine();
		Luta.setVencedor(vencedor);
		//System.out.print("Digite a categoria:");
		//String aux3 = scan.nextLine();
		Luta.setLutador1(lutador1);
		Luta.setLutador2(lutador2);
		
		try {
			if (LutaRepository.inserir(Luta))
				System.out.println("Salvo com Sucesso");
		} catch (Exception e) {
			System.out.println("Erro");
		}
	}}

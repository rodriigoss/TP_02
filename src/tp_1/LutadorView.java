package tp_1;

import java.util.ArrayList;
import java.util.Scanner;

import persistencia.LutadorDAO;

public class LutadorView {

	private Scanner scan = new Scanner(System.in);
	public void Inicio() {
		String val = "1";
		while (val != "0") {
			System.out.println("\nEscolha uma Operacao - Tela Lutador");
			System.out.println("__________________________");
			System.out.println("[1] Relatorio de Lutador");
			System.out.println("[2] Pesquisar um Lutador");
			System.out.println("[3] Cadastrar Lutador");

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
		LutadorDAO LutadorRepository = new LutadorDAO();
		ArrayList<Lutador> listLutador = LutadorRepository.selecionarTodos();
		for (Lutador Lutador : listLutador) {
			System.out.println("Codigo: " + Lutador.getIdLutador() + "\n" + "Nome: " + Lutador.getNome() + "\n"
					 + "______________________________");
		}
	}
/*	public void historiocoLocacao() {
		LocacaoDAO locacaoRepository = new LocacaoDAO();
		Lutador LutadorEntity = new Lutador();
		System.out.println(" Entre com o codigo do Lutador para ver seu historico");
		String aux = scan.nextLine();
		LutadorEntity.setIdLutador(Integer.valueOf(aux));
		ArrayList<Locacao> listLocacao = locacaoRepository.historicoLutadorLocacao(LutadorEntity);
		for (Locacao locacao : listLocacao) {
			System.out.println("Codigo Registro: " + locacao.getIdLocacao() + "\n" + "Codigo Lutador: "
					+ locacao.getIdLutador() + "\n" + "Codigo Livro: " + locacao.getIdLivro() + "\n"
					+ "Codigo Data Emprestimo: " + locacao.getDataEmprestimo() + "\n" + "Codigo Data Prevista: "
					+ locacao.getDataPrevista() + "\n" + "Codigo Data Entrega: " + locacao.getDataEntrega() + "\n"
					+ "_______________________________");
		}
	}*/


	public void ListarUnidade() {
		LutadorDAO LutadorRepository = new LutadorDAO();
		Lutador LutadorEntity = new Lutador();
		System.out.print("Digite o codigo para buscar o dados do Lutador:");
		String aux = scan.nextLine();
		LutadorEntity.setIdLutador(Integer.valueOf(aux));
		Lutador Lutador = LutadorRepository.selecionar(LutadorEntity);
		if (Lutador != null && Lutador.getIdLutador()>0) {
		System.out.println("Codigo: " + Lutador.getIdLutador() + "\n" + "Nome: " + Lutador.getNome() + "\n"  + "______________________________");
		return;
		}
		System.out.println("Registro nao encontado!");
		return;
	}

	public void Novo(String nome, String sexo, String pais, String categoria) {
		LutadorDAO LutadorRepository = new LutadorDAO();
		Lutador Lutador = new Lutador();
		//System.out.print("Digite o novo Nome:");
		//String aux = scan.nextLine();
		Lutador.setNome(nome);
		//System.out.print("Digite a sexo:");
		//String aux1 = scan.nextLine();
		Lutador.setSexo(sexo);
		//System.out.print("Digite a pais:");
		//String aux2 = scan.nextLine();
		Lutador.setPais(pais);
		//System.out.print("Digite a categoria:");
		//String aux3 = scan.nextLine();
		Lutador.setCategoria(categoria);
		
		try {
			if (LutadorRepository.inserir(Lutador))
				System.out.println("Salvo com Sucesso");
		} catch (Exception e) {
			System.out.println("Erro");
		}
	}}



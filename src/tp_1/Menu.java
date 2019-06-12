package tp_1;

import java.util.Scanner;

import persistencia.LutaDAO;
import persistencia.LutadorDAO;

/**
 * 
 * @author rodrigo
 * A classe menu e a que interage com o usuario , e mostra opçoes na tela
 */
public class Menu {
	private Scanner scan;

	public void Start() {
		LutaDAO lutaDAO = new LutaDAO();
		LutadorDAO lutadorDAO = new LutadorDAO();
		
		scan = new Scanner(System.in);
		String val = "1";
		while (val != "0") {
			System.out.println("Menu Principal");
			System.out.println("__________________________");
			System.out.println("[1] Mostrar Lutadores");
			System.out.println("[2] Mostrar Lutas");
			System.out.println("[3] Campeao Finals(Campeao dos Campeoes)");
			System.out.println("[0] Sair");
			System.out.println("__________________________");

			val = scan.nextLine();
			switch (val) {
			case "1":
				lutadorDAO.selecionarTodos();
				break;
			case "2":
				lutaDAO.selecionarTodos();
				break;
			case "3":
				lutaDAO.selecionarFinals();
				break;
			case "0":
				System.out.println("Ate logo!");
				return;
			}
		}
	}
}
package tp_1;

/**
 * @author rodrigo
 * classe main chama a Classe visualizarArquivos da classe ReadArq
 * e depois chama o Menu
 */
public class Main {

	public static void main(String[] args) {


			ReadArq v = new ReadArq();
			Menu menu = new Menu();
			
			v.visualizarArquivos();
			menu.Start();
			
			
	}
}

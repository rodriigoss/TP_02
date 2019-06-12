package tp_1;

import java.util.ArrayList;
 /**
  * 
  * 
  * @author rodrigo
  * a classe Strings é Statica e serve para imprimir mensagens na tela 
  */
public class Strings {
	
	public static void printFinals(String Numero, String Nome) {
		System.out.println("O Grande Campeao é "+Nome+" com "+Numero+" vitorias!!"+"\n");

	}
		
	public static void printLutas(ArrayList<Luta> ArrayLutas) {
		for (Luta luta2 : ArrayLutas) {
			System.out.println(" IdLuta   : "+ luta2.getIdLuta());
			System.out.println(" AnoLiga  : "+ luta2.getAnoLiga());
			System.out.println(" Lutador1 : "+ luta2.getLutador1());
			System.out.println(" Lutador2 : "+ luta2.getLutador2());
			System.out.println(" Vencedor : "+ luta2.getVencedor());
			System.out.println(" ----------------------------------- ");
		}


	}
	
	public static void printLutadores(ArrayList<Lutador> ArrayLutadors) {
		for (Lutador lutador : ArrayLutadors) {
			System.out.println(" IdLutador : "+ lutador.getIdLutador());
			System.out.println(" Nome      : "+ lutador.getNome());
			System.out.println(" Pais      : "+ lutador.getPais());
			System.out.println(" Sexo      : "+ lutador.getSexo());
			System.out.println(" Categoria : "+ lutador.getCategoria());
			System.out.println(" ----------------------------------- ");
		}
	}
}

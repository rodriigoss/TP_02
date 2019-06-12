package tp_1;
import java.util.ArrayList;
import java.util.Scanner;

public class LigaUFC {

	private ArrayList<Lutador>  maquina;
	private String nome;
	private Lutador jogador; 
	private Scanner ler;
	private combate luta;
	
	public LigaUFC() {
		maquina= new ArrayList<Lutador>();
		ler = new Scanner(System.in);
		luta= new combate();
	}	
	
	public void nomeLutadores() {                     // da nome aos Lutadores e determina os pontos
		maquina.add(new Lutador("silva", 0));
		maquina.add(new Lutador("Junior", 500));
		maquina.add(new Lutador("Jones", 1500));
		maquina.add(new Lutador("Aldo", 2500));
		maquina.add(new Lutador("McGregor", 3000));
		System.out.println("Qual o nome do seu Lutador:");
		nome= ler.next();
		jogador = new Lutador(nome, 0);
	}
	
	public void lutar() {
	    int i=0;
		
		for (Lutador lutador2 : maquina) {                 //FOR EACH percorre o Arraylist,
			i++;										   // Se vencer o combate , envia para novo combate 
			if(luta.combate(jogador, lutador2)) {		   // jogador e o proximo Lutador maquina
			    Strings.printVenceu(jogador, i,lutador2);	
			}												
			else {											
				Strings.printPerdeu(jogador, lutador2, i);	// caso retorne false, entra no else, é eliminado 
			}												// da liga e encerra 
		}
		Strings.printCampeao(jogador);        // caso saia do FOR significa que ganhou
	}	                                      //as 5 lutas , se torna o campeao da Liga
}

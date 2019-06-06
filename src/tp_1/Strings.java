package tp_1;
public class Strings {
		
	
	public static void printVenceu(Lutador jogador,int i,Lutador maquina) {
		System.out.println("parabens vc ganhou a "+i+"º luta contra "+maquina.getNome()+"\n");

	}
	public static void printCampeao(Lutador jogador) {
		System.out.println("Parabens "+ jogador.getNome()+"!! Voce venceu todos os combates e se tornou o compeao do UFC");		

	}
	public static void printPerdeu(Lutador jogador,Lutador maquina,int i) {
		System.out.println(jogador.getNome()+" voce perdeu a "+i+"º Luta para "+maquina.getNome()+" e foi eliminado do Torneio!");
        System.exit(0);
	}
	public static void printMostraVida(Lutador jogador,Lutador maquina) {
		System.out.println(" Fim do combate!!");
		System.out.println("vida jogador : "+ jogador.getVida());
		System.out.println("vida maquina : "+ maquina.getVida());
	}

}

package tp_1;

import java.util.ArrayList;

/**
 * 
 * @author rodrigo
 * A classe Combate faz o processamento das linhas do arquivo(rounds)
 * 
 *
 */
public  class Combate {
	
	Acao acao1;
	Acao acao2;
	int pontos[];
	int um;
	int dois;
	
	
	public Combate() {
		acao1=new Acao();
		acao2=new Acao();
	}
    
	/**
	 * 
	 * @param defesa
	 * @param ataque
	 * @param soco
	 * @param chute
	 * @param poder
	 * @param modalidade
	 * @param defesa2
	 * @param ataque2
	 * @param soco2
	 * @param chute2
	 * @param poder2
	 * @param modalidade2
	 * @return um array com informaçoes de quem ganhou o hound , e seus pontos
	 */
	public int[] fight(String defesa,String ataque,String soco,String chute,String poder,String modalidade,
			                 String defesa2,String ataque2,String soco2,String chute2,String poder2,String modalidade2) {

		int pontos[]= {0,0,0,0};
		acao1.defesa=defesa;
		acao1.ataque=ataque;
		acao1.soco=soco;
		acao1.chute=chute;
		acao1.poder=poder;
		acao2.defesa=defesa;
		acao2.ataque=ataque;
		acao2.soco=soco;
		acao2.chute=chute;
		acao2.poder=poder;
		um=0;
		dois=0;

		if(acao1.defesa=="1" || acao2.defesa=="1") {
			// se Lutador1 ou Lutador2 tem defesa igual 1 , ninguem ganha poder nem perde vida
		}
		else if(acao1.poder=="1" && acao2.poder=="0"){//Lutador1 poder 1 Lutador2 poder 0  
			pontos[1]++;
			um++;
		}
		else if(acao1.poder=="0" && acao2.poder=="1") {// Lutador2 poder 1 Lutador1 poder 0
						pontos[3]++;
						dois++;
					}
		else {
			 if(Integer.parseInt(modalidade)>Integer.parseInt(modalidade2)) { // soco ou chute Modalidade jogador maior ele ganha
				 pontos[1]++;				 
				 um++;
			 }
			 else if(Integer.parseInt(modalidade)<Integer.parseInt(modalidade2)) { // soco ou chute Modalidade maquina maior ela ganha
				 pontos[3]++;					 
				 dois++;
			 }
		}
	
		   pontos[0]=0;
		   pontos[2]=0;
			if(um>dois) { 
			pontos[0]=1;
			return pontos; // Lutador1 venceu
		}
		else {
			pontos[2]=1;
			return pontos; // Lutador2 venceu 
		}
}}
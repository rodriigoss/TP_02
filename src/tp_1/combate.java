package tp_1;

public  class combate {
	
	private int i;
	Acao acao1;
	Acao acao2;
	int um=0;
	int dois=0;
	
	public combate() {
		acao1=new Acao();
		acao2=new Acao();
	}

	public boolean combatee(String defesa,String ataque,String soco,String chute,String poder,String modalidade,
			                 String defesa2,String ataque2,String soco2,String chute2,String poder2,String modalidade2) {

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
		//Acao.criarAcoes(jogador);                             // cria açoes do jogador
		//Acao.criarAcoes(maquina);  							  // cria açoes da maquina
		for(i=0;i<19;i++) {


		if(acao1.defesa=="1" || acao2.defesa=="1") {
			// se jogador ou maquina tem defesa igual 1 , ninguem ganha poder nem perde vida
		}
		else if(acao1.poder=="1" && acao2.poder=="0"){//Jogador poder 1 maquina poder 0  
			//jogador.setPontos(jogador.getPontos()+50); // jogador ganha 50 pontos
			um++;
																				// maquina sobre o dano da Modalidade do jogador
		}
		else if(acao1.poder=="0" && acao2.poder=="1") {// Maquina poder 1 jogador poder 0
			//maquina.setPontos(maquina.getPontos()+50);
			dois++;
					}
		else {
			 if(Integer.parseInt(modalidade)>Integer.parseInt(modalidade2)) { // soco ou chute Modalidade jogador maior ele ganha
					//jogador.setPontos(jogador.getPontos()+50);
				 um++;
			 }
			 else if(Integer.parseInt(modalidade)<Integer.parseInt(modalidade2)) { // soco ou chute Modalidade maquina maior ela ganha
					//maquina.setPontos(maquina.getPontos()+50);
				 dois++;
			 }
		}
	}
			if(um>dois) { // Saiu do for, ganha quem tem mais vida
			//Strings.printMostraVida(jogador, maquina);
			return true; // jogador venceu
		}
		else {
			return false; // maquina venceu 
		}
}}

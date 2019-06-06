package tp_1;

public  class Luta {
	
	private int i;
	TodasAcoes Acao; 
	
	public Luta() {
		Acao=new TodasAcoes();
	}

	public boolean combate(Lutador jogador, Lutador maquina) {

		Acao.criarAcoes(jogador);                             // cria açoes do jogador
		Acao.criarAcoes(maquina);  							  // cria açoes da maquina
		//jogador.setVida(1000);                                // Jogador começa com 1000 de vida
		//maquina.setVida(1000);								  // Maquina começa com 1000 de vida
		jogador.adquirirModalidade();                         // Antes de cada combate cada Lutador adquire 
		maquina.adquirirModalidade();						  // a Modalidade possivel de acordo com seus pontos
		for(i=0;i<1000;i++) {

			/*if(jogador.getVida()<=0) {                     // vida jogador <= 0 perdeu o Combate
				Strings.printMostraVida(jogador, maquina);

				return false;
			}
			else if(maquina.getVida()<=0) {					// Vida maquina <=0 perdeu combate
				Strings.printMostraVida(jogador, maquina);

				return true;
			}*/
		if(jogador.acoes.get(i).defesa==1 || maquina.acoes.get(i).defesa==1) {
			// se jogador ou maquina tem defesa igual 1 , ninguem ganha poder nem perde vida
		}
		else if(jogador.acoes.get(i).poder==1 && maquina.acoes.get(i).poder==0){//Jogador poder 1 maquina poder 0  
			jogador.setPontos(jogador.getPontos()+50);                           // jogador ganha 50 pontos
			//maquina.setVida(maquina.getVida()-jogador.modalidade.danoDoPoder()); // maquina sobre o dano da Modalidade do jogador
		}
		else if(jogador.acoes.get(i).poder==0 && maquina.acoes.get(i).poder==1) {// Maquina poder 1 jogador poder 0
			maquina.setPontos(maquina.getPontos()+50);
			//jogador.setVida(jogador.getVida()-maquina.modalidade.danoDoPoder());
		}
		else {
			 if(jogador.modalidade.danoDoPoder()>maquina.modalidade.danoDoPoder()) { // soco ou chute Modalidade jogador maior ele ganha
					jogador.setPontos(jogador.getPontos()+50);
				//	maquina.setVida(maquina.getVida()-jogador.modalidade.danoDoPoder());
			 }
			 else if(jogador.modalidade.danoDoPoder()<maquina.modalidade.danoDoPoder()) { // soco ou chute Modalidade maquina maior ela ganha
					maquina.setPontos(maquina.getPontos()+50);
					//jogador.setVida(jogador.getVida()-maquina.modalidade.danoDoPoder());
			 }
		}
	}
			if(jogador.getPontos()>maquina.getPontos()) { // Saiu do for, ganha quem tem mais vida
			Strings.printMostraVida(jogador, maquina);
			return true; // jogador venceu
		}
		else {
			return false; // maquina venceu 
		}
}}

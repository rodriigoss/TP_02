package tp_1;

public class Jogar {

	LigaUFC liga;
	
	public Jogar() {
		liga = new LigaUFC();
	}
	
	public void comeca() {
		liga.nomeLutadores();   // chama metodo para dar nome aos Lutadores
		liga.lutar();           // chama metodo de Lutar da LigaUfc 
	}
}

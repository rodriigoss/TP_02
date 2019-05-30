import java.util.ArrayList;

public class Lutador {

	private String nome;
	private int vida;
	private int pontos;
	Modalidades modalidade;
	ArrayList<Acao> acoes;
	
   public Lutador(String nome , int pontos) {
	    acoes= new ArrayList<Acao>();
    	this.nome=nome;
      	modalidade = new Boxe();
		vida = 1000;
		this.pontos= pontos ;
	}
    
    public int getVida() {
		return vida;
	}
    public void setVida(int vida) {
		this.vida = vida;
	}
    public int getPontos() {
		return pontos;
	}
    public void setPontos(int pontos) {
		this.pontos = pontos;
	}
    public String getNome() {
		return nome;
	}
    public void setNome(String nome) {
		this.nome = nome;
	}
    public void adquirirModalidade() {
		if(this.pontos>= 3000) {
			modalidade = new Muay_thai();
		}
		else if(this.pontos>=2000) {
			modalidade = new Karate();
		}
		else if(this.pontos>=1000) {
			modalidade= new Jiu_jitsu();
		}
    }
}
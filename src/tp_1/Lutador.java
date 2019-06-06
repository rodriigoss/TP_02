package tp_1;
import java.util.ArrayList;

public class Lutador {

	private int idLutador;
	private String nome;
	//private int vida;
	private String categoria;
	private String sexo;
	private String pais;
	private int pontos;
	Modalidades modalidade;
	ArrayList<Acao> acoes;
	
   public Lutador(String nome , int pontos) {
	    acoes= new ArrayList<Acao>();
    	this.nome=nome;
      	modalidade = new Boxe();
		//vida = 1000;
		this.pontos= pontos ;
	}
    public Lutador() {
		// TODO Auto-generated constructor stub
	}
    /*public int getVida() {
		return vida;
	}
    public void setVida(int vida) {
		this.vida = vida;
	}*/
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

	public int getIdLutador() {
		return idLutador;
	}

	public void setIdLutador(int idLutador) {
		this.idLutador = idLutador;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
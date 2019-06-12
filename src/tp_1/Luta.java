package tp_1;

/**
 * 
 * @author rodrigo
 * Classe luta modela os atributos que uma luta precisa
 */
public class Luta {

	private String idLuta;
	private String anoLiga;
	private String vencedor;
	private int pontosVencedor;
	private String lutador1;
	private String lutador2;
	public String getIdLuta() {
		return idLuta;
	}
	public void setIdLuta(String idLuta) {
		this.idLuta = idLuta;
	}
	public String getAnoLiga() {
		return anoLiga;
	}
	public void setAnoLiga(String anoLiga) {
		this.anoLiga = anoLiga;
	}
	public String getVencedor() {
		return vencedor;
	}
	public void setVencedor(String vencedor) {
		this.vencedor = vencedor;
	}
	public String getLutador1() {
		return lutador1;
	}
	public void setLutador1(String lutador1) {
		this.lutador1 = lutador1;
	}
	public String getLutador2() {
		return lutador2;
	}
	public void setLutador2(String lutador2) {
		this.lutador2 = lutador2;
	}
	public int getPontosVencedor() {
		return pontosVencedor;
	}
	public void setPontosVencedor(int pontosVencedor) {
		this.pontosVencedor = pontosVencedor;
	}
	
	
	
}

package tp_1;

import persistencia.LutaDAO;

public class LutaView {

    /**
     * 
     * @param idLuta
     * @param anoLiga
     * @param vencedor
     * @param pontosVencedor
     * @param lutador1
     * @param lutador2
     * A clessa Novo envia uma navo luta ao Banco
     */
	public void Novo(String idLuta,String anoLiga, String vencedor,int pontosVencedor, String lutador1, String lutador2) {
		LutaDAO LutaRepository = new LutaDAO();
		Luta Luta = new Luta();

		Luta.setIdLuta(idLuta);
		Luta.setAnoLiga(anoLiga);
		Luta.setVencedor(vencedor);
		Luta.setPontosVencedor(pontosVencedor);
		Luta.setLutador1(lutador1);
		Luta.setLutador2(lutador2);
		
		try {
			if (LutaRepository.inserir(Luta))
				System.out.println("Salvo com Sucesso");
		} catch (Exception e) {
			System.out.println("Erro");
		}
	}}

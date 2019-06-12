package tp_1;

import persistencia.LutadorDAO;

public class LutadorView {


    /**
     * 
     * @param nome
     * @param sexo
     * @param pais
     * @param categoria
     * A classse Novo envia um novo Lutador ao Banco
     */
	public void Novo(String nome, String sexo, String pais, String categoria) {
		LutadorDAO LutadorRepository = new LutadorDAO();
		Lutador Lutador = new Lutador();

		Lutador.setNome(nome);
		Lutador.setSexo(sexo);
		Lutador.setPais(pais);
		Lutador.setCategoria(categoria);
		
		try {
			if (LutadorRepository.inserir(Lutador))
				System.out.println("Salvo com Sucesso");
		} catch (Exception e) {
			System.out.println("Erro");
		}
	}}



package br.com.fluxodecaixa.domain.en;


import org.springframework.core.annotation.Order;

public enum enTipoFluxo {

	@Order(1) ENTRADA("Entrada", 1),
	@Order(2) SAIDA("Saída", 2);
	
	private final String descricao;
	private final int numero;
	
	enTipoFluxo(String descricao, int numero){
		this.descricao = descricao;
		this.numero = numero;
		
	}

	public String getDescricao() {
		return descricao;
	}

	public int getNumero() {
		return numero;
	}
	
	
	
	
}

package br.com.fluxodecaixa.domain.en;

import org.springframework.core.annotation.Order;

public enum enTipoCusto {
	
	@Order(1) FIXO("Fixo", 1),
	@Order(2) VARIAVEL("Variável", 2);
	
	private final String descricao;
	private final int numero;
	
	enTipoCusto(String descricao, int numero){
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

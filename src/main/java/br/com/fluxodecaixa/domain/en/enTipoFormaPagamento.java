package br.com.fluxodecaixa.domain.en;

import org.springframework.core.annotation.Order;

public enum enTipoFormaPagamento {
	
	@Order(1) CARTAO_DE_CREDITO("Cartão de Crédito", 1),
	@Order(2) PIX("PIX", 2),
	@Order(3) BOLETO("Boleto",3),
	@Order(4) DEBITO("Débito", 4);
	
	private final String descricao;
	private final int numero;
	
	enTipoFormaPagamento(String descricao, int numero){
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

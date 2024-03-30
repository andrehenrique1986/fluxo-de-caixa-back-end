package br.com.fluxodecaixa.domain.en;

import org.springframework.core.annotation.Order;

public enum enTipoSubcategoria {

	@Order(1)  SALARIO("Salário", 1),
	@Order(2)  INVESTIMENTO("Investimento", 2),
	@Order(3)  VENDAS("Vendas", 3),
	@Order(4)  ALUGUEL("Aluguel", 4),
	@Order(5)  CONDOMINIO("Condomínio", 5),
	@Order(6)  LUZ("Luz", 6),
	@Order(7)  MANUTENCAO("Manutenção", 7),
	@Order(8)  GASOLINA("Gasolina", 8),
	@Order(9)  MANUTENCAO_CARRO("Manutenção carro", 9),
	@Order(10) SEGURO("Seguro", 10),
	@Order(11) IMPOSTOS_E_MULTAS("Gasolina", 11),
	@Order(12) UBER("Uber", 12),
	@Order(13) ONIBUS("Ônibus", 13),
	@Order(14) SUPERMERCADO("Supermercado", 14),
	@Order(15) PIZZARIA("Pizzaria", 15),
	@Order(16) JANTAR_FORA("Jantar Fora", 16),
	@Order(17) LANCHES("Jantar Fora", 17),
	@Order(18) CONSULTAS("Consultas", 18),
	@Order(19) EXAMES("Exames", 19),
	@Order(20) PLANO_DE_SAUDE("Plano de Saúde", 20),
	@Order(21) REMEDIOS("Remédios", 21),
	@Order(22) ACADEMIA("Academia", 22),
	@Order(23) ESCOLA("Escola", 23),
	@Order(24) UNIVERSIDADE("Universidade", 24),
	@Order(25) MATERIAL_ESCOLAR("Material Escolar", 25),
	@Order(26) CURSOS("Cursos", 26),
	@Order(27) CINEMA("Cinema", 27),
	@Order(28) RESTAURANTE("Restaurante", 28),
	@Order(29) VIAGENS("Viagens", 29),
	@Order(30) SHOWS("Shows", 30),
	@Order(31) EMPRESTIMO("Empréstimo", 31);
	
	
	private final String descricao;
	private final int numero;
	
	enTipoSubcategoria(String descricao, int numero){
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

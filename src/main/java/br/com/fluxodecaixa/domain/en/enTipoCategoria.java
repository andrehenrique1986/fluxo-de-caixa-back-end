package br.com.fluxodecaixa.domain.en;

import java.util.Arrays;
import java.util.List;

import org.springframework.core.annotation.Order;

public enum enTipoCategoria {

	@Order(1) RECEITAS("Receitas", 1, Arrays.asList(
			enTipoSubcategoria.SALARIO,
			enTipoSubcategoria.INVESTIMENTO,
			enTipoSubcategoria.VENDAS
			)),	
	
	
	@Order(2) MORADIA("Moradia", 2, Arrays.asList(
			enTipoSubcategoria.ALUGUEL,
			enTipoSubcategoria.CONDOMINIO,
			enTipoSubcategoria.LUZ,
			enTipoSubcategoria.MANUTENCAO
			)),
	
	@Order(3) TRANSPORTE("Transporte", 3, Arrays.asList(
			enTipoSubcategoria.GASOLINA,
			enTipoSubcategoria.MANUTENCAO_CARRO,
			enTipoSubcategoria.SEGURO,
			enTipoSubcategoria.IMPOSTOS_E_MULTAS,
			enTipoSubcategoria.UBER,
			enTipoSubcategoria.ONIBUS
			)),
	
	
	
	@Order(4) ALIMENTACAO("Alimentação", 4, Arrays.asList( 
			enTipoSubcategoria.SUPERMERCADO,
			enTipoSubcategoria.PIZZARIA,
			enTipoSubcategoria.JANTAR_FORA,
			enTipoSubcategoria.LANCHES	
			)),
	
	
	
	@Order(5) SAUDE("Saúde", 5, Arrays.asList(
			enTipoSubcategoria.CONSULTAS,
			enTipoSubcategoria.EXAMES,
			enTipoSubcategoria.PLANO_DE_SAUDE,
			enTipoSubcategoria.REMEDIOS,
			enTipoSubcategoria.ACADEMIA			
			)),
	
	
	
	@Order(6) EDUCACAO("Educação", 6,  Arrays.asList(
			enTipoSubcategoria.ESCOLA,
			enTipoSubcategoria.UNIVERSIDADE,
			enTipoSubcategoria.MATERIAL_ESCOLAR,
			enTipoSubcategoria.CURSOS
			)),
	
	
	@Order(7) LAZER("Lazer", 7,  Arrays.asList(
			enTipoSubcategoria.CINEMA,
			enTipoSubcategoria.RESTAURANTE,
			enTipoSubcategoria.VIAGENS,
			enTipoSubcategoria.SHOWS
			)),
	
	
	
	@Order(8) DIVIDAS("Dívidas", 8, Arrays.asList(
			enTipoSubcategoria.EMPRESTIMO
			));
	
	
	
	
	private final String descricao;
	private final int numero;
	private final List<?> subcategorias;
	
	
	enTipoCategoria(String descricao, int numero, List<?> subcategorias){
		this.descricao = descricao;
		this.numero = numero;
		this.subcategorias = subcategorias;
		
	}

	public String getDescricao() {
		return descricao;
	}

	public int getNumero() {
		return numero;
	}

	public List<?> getSubcategorias() {
		return subcategorias;
	}
	
	
}

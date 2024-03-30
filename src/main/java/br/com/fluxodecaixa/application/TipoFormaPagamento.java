package br.com.fluxodecaixa.application;

import java.util.List;

import br.com.fluxodecaixa.domain.en.enTipoFormaPagamento;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "formaPagamento")
public class TipoFormaPagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFormaPagamento;
	
	@Column(name = "dscFormaPagamento")
	private enTipoFormaPagamento dscFormaPagamento;
	
	@OneToMany(mappedBy = "formaPagamento", cascade = CascadeType.ALL)
	private List<Registro> registros;

	public Long getIdFormaPagamento() {
		return idFormaPagamento;
	}

	public void setIdFormaPagamento(Long idFormaPagamento) {
		this.idFormaPagamento = idFormaPagamento;
	}

	public enTipoFormaPagamento getDscFormaPagamento() {
		return dscFormaPagamento;
	}

	public void setDscFormaPagamento(enTipoFormaPagamento dscFormaPagamento) {
		this.dscFormaPagamento = dscFormaPagamento;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}
	
	
	
}

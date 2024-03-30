package br.com.fluxodecaixa.application;

import java.util.List;

import br.com.fluxodecaixa.domain.en.enTipoCusto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipoCusto")
public class TipoCusto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoCusto;
	
	@Column(name = "dscTipoCusto")
	private enTipoCusto dscTipoCusto;
	
	@OneToMany(mappedBy = "tipoCusto", cascade = CascadeType.ALL)
	private List<Registro> registros;

	public Long getIdTipoCusto() {
		return idTipoCusto;
	}

	public void setIdTipoCusto(Long idTipoCusto) {
		this.idTipoCusto = idTipoCusto;
	}

	public enTipoCusto getDscTipoCusto() {
		return dscTipoCusto;
	}

	public void setDscTipoCusto(enTipoCusto dscTipoCusto) {
		this.dscTipoCusto = dscTipoCusto;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}
	
	
	
}

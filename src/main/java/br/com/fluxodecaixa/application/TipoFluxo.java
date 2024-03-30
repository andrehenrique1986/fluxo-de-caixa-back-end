package br.com.fluxodecaixa.application;

import java.util.List;

import br.com.fluxodecaixa.domain.en.enTipoFluxo;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipoFluxo")
public class TipoFluxo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoFluxo;
	
	@Column(name = "dscTipoFluxo")
	private enTipoFluxo dscTipoFluxo;
	
	@OneToMany(mappedBy = "tipoFluxo", cascade = CascadeType.ALL)
	private List<Registro> registros;

	public Long getIdTipoFluxo() {
		return idTipoFluxo;
	}

	public void setIdTipoFluxo(Long idTipoFluxo) {
		this.idTipoFluxo = idTipoFluxo;
	}

	public enTipoFluxo getDscTipoFluxo() {
		return dscTipoFluxo;
	}

	public void setDscTipoFluxo(enTipoFluxo dscTipoFluxo) {
		this.dscTipoFluxo = dscTipoFluxo;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}

	
	
}

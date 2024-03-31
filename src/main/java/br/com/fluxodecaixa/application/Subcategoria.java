package br.com.fluxodecaixa.application;

import java.util.List;

import br.com.fluxodecaixa.domain.en.enTipoSubcategoria;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "subcategoria")
public class Subcategoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSubcategoria;
	
	@Column(name = "dscSubcategoria")
	@Enumerated(EnumType.STRING)
	private enTipoSubcategoria dscSubcategoria;
	
	@ManyToOne
	@JoinColumn(name = "idCategoria")
	private Categoria idCategoria;
	
	@OneToMany(mappedBy = "subcategoria", cascade = CascadeType.ALL)
	private List<Registro> registros;

	public Long getIdSubcategoria() {
		return idSubcategoria;
	}

	public void setIdSubcategoria(Long idSubcategoria) {
		this.idSubcategoria = idSubcategoria;
	}

	public enTipoSubcategoria getDscSubcategoria() {
		return dscSubcategoria;
	}

	public void setDscSubcategoria(enTipoSubcategoria dscSubcategoria) {
		this.dscSubcategoria = dscSubcategoria;
	}

	public Categoria getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Categoria idCategoria) {
		this.idCategoria = idCategoria;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}
	
	
	

}

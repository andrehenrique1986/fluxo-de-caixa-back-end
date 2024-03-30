package br.com.fluxodecaixa.application;

import java.util.List;

import br.com.fluxodecaixa.domain.en.enTipoCategoria;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategoria;
	
	@Column(name = "dscCategoria")
	private enTipoCategoria dscCategoria;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	private List<Subcategoria> subcategorias;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	private List<Registro> registros;

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public enTipoCategoria getDscCategoria() {
		return dscCategoria;
	}

	public void setDscCategoria(enTipoCategoria dscCategoria) {
		this.dscCategoria = dscCategoria;
	}

	public List<Subcategoria> getSubcategorias() {
		return subcategorias;
	}

	public void setSubcategorias(List<Subcategoria> subcategorias) {
		this.subcategorias = subcategorias;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}
	
	

}

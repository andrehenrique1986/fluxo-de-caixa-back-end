package br.com.fluxodecaixa.application;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "registro")
public class Registro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRegistro;  
	
	@Column(name = "dtRegistro")
	private Date dtRegistro;
	
	@ManyToOne
	@JoinColumn(name = "idTipoFluxo")
	private TipoFluxo idTipoFluxo;
	
	@ManyToOne
	@JoinColumn(name = "idCategoria")
	private Categoria idCategoria;
	
	@ManyToOne
	@JoinColumn(name = "idSubcategoria")
	private Subcategoria idSubcategoria;
	
	@ManyToOne
	@JoinColumn(name = "idTipoCusto")
	private TipoCusto idTipoCusto;
	
	@ManyToOne
	@JoinColumn(name = "idFormaPagamento")
	private TipoFormaPagamento idFormaPagamento;
	
	@Column(name = "vlRegistro")
	private double vlRegistro;
	
	

	public Long getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Long idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Date getDtRegistro() {
		return dtRegistro;
	}

	public void setDtRegistro(Date dtRegistro) {
		this.dtRegistro = dtRegistro;
	}

	public TipoFluxo getIdTipoFluxo() {
		return idTipoFluxo;
	}

	public void setIdTipoFluxo(TipoFluxo idTipoFluxo) {
		this.idTipoFluxo = idTipoFluxo;
	}

	public Categoria getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Categoria idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Subcategoria getIdSubcategoria() {
		return idSubcategoria;
	}

	public void setIdSubcategoria(Subcategoria idSubcategoria) {
		this.idSubcategoria = idSubcategoria;
	}

	public TipoCusto getIdTipoCusto() {
		return idTipoCusto;
	}

	public void setIdTipoCusto(TipoCusto idTipoCusto) {
		this.idTipoCusto = idTipoCusto;
	}

	public TipoFormaPagamento getIdFormaPagamento() {
		return idFormaPagamento;
	}

	public void setIdFormaPagamento(TipoFormaPagamento idFormaPagamento) {
		this.idFormaPagamento = idFormaPagamento;
	}

	public double getVlRegistro() {
		return vlRegistro;
	}

	public void setVlRegistro(double vlRegistro) {
		this.vlRegistro = vlRegistro;
	}
		
	
}

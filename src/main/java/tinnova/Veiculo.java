package tinnova;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class Veiculo {

	@Id private String id;

	private String veiculo;
	private String marca;
	private String descricao;
	private Integer ano;
	private Boolean vendido;

	@CreatedDate
	private java.util.Date created;
	@LastModifiedDate
	private java.util.Date updated;

//	@PrePersist
//	public void onPrePersist() {
//		this.created=new java.util.Date();
//	}
//
//	@PreUpdate
//	public void onPreUpdate() {
//		this.updated=new java.util.Date();
//	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Boolean getVendido() {
		return vendido;
	}

	public void setVendido(Boolean vendido) {
		this.vendido = vendido;
	}

	public java.util.Date getCreated() {
		return created;
	}

	public void setCreated(java.util.Date created) {
		this.created = created;
	}

	public java.util.Date getUpdated() {
		return updated;
	}

	public void setUpdated(java.util.Date updated) {
		this.updated = updated;
	}
}

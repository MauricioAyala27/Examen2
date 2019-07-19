package com.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "catalogo")
public class Catalogo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idCatalogo")
	private int idCatalogo;
	
	@Column(name = "nombreCatalogo")
	private String nombreCatalogo;
	
	@OneToMany(mappedBy = "catalogo", fetch = FetchType.EAGER)
	private Set<Producto> productosL;

	public Catalogo() {
	}

	public Catalogo(String nombreCatalogo) {
		this.nombreCatalogo = nombreCatalogo;
	}

	public int getIdCatalogo() {
		return idCatalogo;
	}

	public void setIdCatalogo(int idCatalogo) {
		this.idCatalogo = idCatalogo;
	}

	public String getNombreCatalogo() {
		return nombreCatalogo;
	}

	public void setNombreCatalogo(String nombreCatalogo) {
		this.nombreCatalogo = nombreCatalogo;
	}
	
	@XmlTransient
	public Set<Producto> getProductosL() {
		return productosL;
	}

	public void setProductosL(Set<Producto> productosL) {
		this.productosL = productosL;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCatalogo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Catalogo other = (Catalogo) obj;
		if (idCatalogo != other.idCatalogo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Catalogo [idCatalogo=" + idCatalogo + "]";
	}
	
	
	
	
	
	
	
	
	

}

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "marca")
public class Marca implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idMarca")
	private int idMarca;
	
	@Column(name = "nombreMarca")
	private String nombreMarca;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "paisEmsamblaje")
	private String paisEmsamblaje;
	
	@Column(name = "idProveedor")
	private int idProv;
	
	@OneToMany(mappedBy = "marca", fetch = FetchType.EAGER)
	private Set<Producto> productosLs;
	
	@JoinColumn(name = "idProveedor", insertable=false,updatable=false)
	@ManyToOne
	private Proveedor proveedor;

	public Marca() {
	}

	public Marca(String nombreMarca, String descripcion, String paisEmsamblaje, int idProv) {
		this.nombreMarca = nombreMarca;
		this.descripcion = descripcion;
		this.paisEmsamblaje = paisEmsamblaje;
		this.idProv = idProv;
	}

	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPaisEmsamblaje() {
		return paisEmsamblaje;
	}

	public void setPaisEmsamblaje(String paisEmsamblaje) {
		this.paisEmsamblaje = paisEmsamblaje;
	}

	public int getIdProv() {
		return idProv;
	}

	public void setIdProv(int idProv) {
		this.idProv = idProv;
	}

	public Set<Producto> getProductosLs() {
		return productosLs;
	}

	public void setProductosLs(Set<Producto> productosLs) {
		this.productosLs = productosLs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idMarca;
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
		Marca other = (Marca) obj;
		if (idMarca != other.idMarca)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Marca [idMarca=" + idMarca + "]";
	}
	
	
	
	
	
	

}

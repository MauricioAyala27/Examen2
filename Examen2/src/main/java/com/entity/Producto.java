package com.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idProducto")
	private int idProducto;
	
	@Column(name = "nombreProducto")
	private String nombreProducto;
	
	@Column(name = "idCatalogo")
	private int idCat;
	
	@Column(name = "idMarca")
	private int idMarc;
	
	@Column(name = "precio")
	private double precio;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "existencia")
	private int existencia;
	
	@JoinColumn(name = "idCatalogo", insertable=false,updatable=false)
	@ManyToOne
	private Catalogo catalogo;
	
	@JoinColumn(name = "idMarca",insertable=false,updatable=false)
	@ManyToOne
	private Marca marca;

	public Producto() {
	}

	public Producto(String nombreProducto, int idCat, int idMarc, double precio, String descripcion, int existencia) {
		this.nombreProducto = nombreProducto;
		this.idCat = idCat;
		this.idMarc = idMarc;
		this.precio = precio;
		this.descripcion = descripcion;
		this.existencia = existencia;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getIdCat() {
		return idCat;
	}

	public void setIdCat(int idCat) {
		this.idCat = idCat;
	}

	public int getIdMarc() {
		return idMarc;
	}

	public void setIdMarc(int idMarc) {
		this.idMarc = idMarc;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idProducto;
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
		Producto other = (Producto) obj;
		if (idProducto != other.idProducto)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + "]";
	}
	
	
	
	
}

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
@Table(name = "proveedor")
public class Proveedor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idProveedor")
	private int idProveedor;
	
	@Column(name = "nombreProveedor")
	private String nombreProveedor;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "correoElectronico")
	private String correoElectronico;
	
	@OneToMany(mappedBy = "proveedor", fetch = FetchType.EAGER)
	private Set<Marca> marcasL;

	public Proveedor() {
	}

	public Proveedor(String nombreProveedor, String telefono, String correoElectronico) {
		this.nombreProveedor = nombreProveedor;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
	}

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	@XmlTransient
	public Set<Marca> getMarcasL() {
		return marcasL;
	}

	public void setMarcasL(Set<Marca> marcasL) {
		this.marcasL = marcasL;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idProveedor;
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
		Proveedor other = (Proveedor) obj;
		if (idProveedor != other.idProveedor)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Proveedor [idProveedor=" + idProveedor + "]";
	}

	
	
}

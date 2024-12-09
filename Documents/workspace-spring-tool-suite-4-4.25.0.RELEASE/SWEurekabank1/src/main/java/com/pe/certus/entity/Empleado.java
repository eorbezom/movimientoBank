
package com.pe.certus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="chr_emplcodigo")
	private Long codigo;
	
	@Column(name="vch_emplpaterno")
	private String paterno;
	
	@Column(name= "vch_emplmaterno")
	private String materno;
	
	@Column(name="vch_emplnombre")
	private String nombre;
	
	@Column(name = "vch_emplusuario")
	private String usuario;
	
	@Column(name ="chr_emplestado")
	private Boolean estado;

	public Empleado() {
		super();
	}

	public Empleado(Long codigo, String paterno, String materno, String nombre, String usuario, Boolean estado) {
		super();
		this.codigo = codigo;
		this.paterno = paterno;
		this.materno = materno;
		this.nombre = nombre;
		this.usuario = usuario;
		this.estado = estado;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", paterno=" + paterno + ", materno=" + materno + ", nombre=" + nombre
				+ ", usuario=" + usuario + ", estado=" + estado + "]";
	}
	
	

}

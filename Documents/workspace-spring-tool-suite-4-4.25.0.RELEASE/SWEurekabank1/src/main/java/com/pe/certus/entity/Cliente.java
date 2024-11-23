package com.pe.certus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")

public class Cliente {
	// SE MAPEA TODO LOS CAMPOS
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "chr_cliecodigo")
	private Long id; 
	
	@Column(name = "vch_cliepaterno")
	private String paterno;
	
	@Column(name = "vch_cliematerno")
	private String materno;
	
	@Column(name = "vch_clienombre")
	private String nombres;
	
	@Column(name = "chr_cliedni")
	private String dni;
	
	@Column(name = "vch_clieciudad")
	private String ciudad;
	
	@Column(name = "vch_clieemail")
	private String email;
	
	@Column(name = "vch_clieestado")
	private Boolean estado;
	
	//CONSTRUCTOR BACIO
	public Cliente() {
		super();
	}
	
	//CONSTRUCTOR CON SUS DATOS
	public Cliente(Long id, String paterno, String materno, String nombres, String dni, String ciudad, String email,
			Boolean estado) {
		super();
		this.id = id;
		this.paterno = paterno;
		this.materno = materno;
		this.nombres = nombres;
		this.dni = dni;
		this.ciudad = ciudad;
		this.email = email;
		this.estado = estado;
	}
	//	GET AND SETER
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", paterno=" + paterno + ", materno=" + materno + ", nombres=" + nombres + ", dni="
				+ dni + ", ciudad=" + ciudad + ", email=" + email + ", estado=" + estado + "]";
	}
	
	
	

}

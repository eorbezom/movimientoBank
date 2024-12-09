package com.pe.certus.model;

public class Producto {
	//objetos de producto para mapear y hace referenca a mi tabla  producto de base de datos
	private Integer codProducto;
	private String nombre;
	private Double precio;
	
	
	
	//metodo constructor 
	public Producto() {
		super();
	}


	// metodo con sus datos
	public Producto(Integer codProducto, String nombre, Double precio) {
		super();
		this.codProducto = codProducto;
		this.nombre = nombre;
		this.precio = precio;
	}

	// metodo setters y getters,

	public Integer getCodProducto() {
		return codProducto;
	}


	public void setCodProducto(Integer codProducto) {
		this.codProducto = codProducto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	
	// metodo toString para mostrar en consola los resultados de todo los campos 
	//para vicualizar si la data viele correctamente
		
	@Override
	public String toString() {
		return "Producto [codProducto=" + codProducto + ", nombre=" + nombre + ", precio=" + precio + "]";// es como se va visualisar en la consola
	}
	
	
	
	

}

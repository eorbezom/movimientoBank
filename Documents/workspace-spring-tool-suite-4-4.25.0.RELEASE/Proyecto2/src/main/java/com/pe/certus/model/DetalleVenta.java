package com.pe.certus.model;

public class DetalleVenta {
	
	// OBJETOS DE LA TABLA DETALLE PRODUCTO PARA MAPEAR
	private Integer codigoVenta;
	private Integer codigoProducto;
	private Double cantidad;
	private double descuento;
	
	//constructor metodo basio
	public DetalleVenta() {
		super();
	}
	// constructor  metodo con elementos 

	public DetalleVenta(Integer codigoVenta, Integer codigoProducto, Double cantidad, double descuento) {
		super();
		this.codigoVenta = codigoVenta;
		this.codigoProducto = codigoProducto;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	
	
	//constructor metodo setters y getters,	
	public Integer getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(Integer codigoVenta) {
		this.codigoVenta = codigoVenta;
	}

	public Integer getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(Integer codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	
	// constructor metodo TO

	@Override
	public String toString() {
		return "DetalleVenta [codigoVenta=" + codigoVenta + ", codigoProducto=" + codigoProducto + ", cantidad="
				+ cantidad + ", descuento=" + descuento + "]";
	}

	
	
	

}

package com.pe.certus.model;

import java.util.Date;

public class Venta {
	
	private Integer codigoventa;
	private String cliente;
	private Date fecha;
	
	
	
	public Venta() {
		super();
	}



	public Venta(Integer codigoventa, String cliente, Date fecha) {
		super();
		this.codigoventa = codigoventa;
		this.cliente = cliente;
		this.fecha = fecha;
	}



	public Integer getCodigoventa() {
		return codigoventa;
	}



	public void setCodigoventa(Integer codigoventa) {
		this.codigoventa = codigoventa;
	}



	public String getCliente() {
		return cliente;
	}



	public void setCliente(String cliente) {
		this.cliente = cliente;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(java.sql.Timestamp fecha) { //SE AGREGA DATE PARA QUE ACCEDA A TIME STAM
		this.fecha = new Date(fecha.getTime());
	}



	@Override
	public String toString() {
		return "Venta [codigoventa=" + codigoventa + ", cliente=" + cliente + ", fecha=" + fecha + "]";
	}
	
	
	
	

}

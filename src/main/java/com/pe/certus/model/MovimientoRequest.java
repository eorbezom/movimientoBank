package com.pe.certus.model;

public class MovimientoRequest {
	
	private String codigoMovimiento;
	private Integer codigoNumeroMovimiento;
	private String fecha;
	private Integer codigoEmpleado;
	private Integer codigoTipo;
	private Double codigoMovimientoImporte;
	
	
	public MovimientoRequest() {
		super();
	}


	public MovimientoRequest(String codigoMovimiento, Integer codigoNumeroMovimiento, String fecha,
			Integer codigoEmpleado, Integer codigoTipo, Double codigoMovimientoImporte) {
		super();
		this.codigoMovimiento = codigoMovimiento;
		this.codigoNumeroMovimiento = codigoNumeroMovimiento;
		this.fecha = fecha;
		this.codigoEmpleado = codigoEmpleado;
		this.codigoTipo = codigoTipo;
		this.codigoMovimientoImporte = codigoMovimientoImporte;
	}


	public String getCodigoMovimiento() {
		return codigoMovimiento;
	}


	public void setCodigoMovimiento(String codigoMovimiento) {
		this.codigoMovimiento = codigoMovimiento;
	}


	public Integer getCodigoNumeroMovimiento() {
		return codigoNumeroMovimiento;
	}


	public void setCodigoNumeroMovimiento(Integer codigoNumeroMovimiento) {
		this.codigoNumeroMovimiento = codigoNumeroMovimiento;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public Integer getCodigoEmpleado() {
		return codigoEmpleado;
	}


	public void setCodigoEmpleado(Integer codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}


	public Integer getCodigoTipo() {
		return codigoTipo;
	}


	public void setCodigoTipo(Integer codigoTipo) {
		this.codigoTipo = codigoTipo;
	}


	public Double getCodigoMovimientoImporte() {
		return codigoMovimientoImporte;
	}


	public void setCodigoMovimientoImporte(Double codigoMovimientoImporte) {
		this.codigoMovimientoImporte = codigoMovimientoImporte;
	}


	@Override
	public String toString() {
		return "MovimientoRequest [codigoMovimiento=" + codigoMovimiento + ", codigoNumeroMovimiento="
				+ codigoNumeroMovimiento + ", fecha=" + fecha + ", codigoEmpleado=" + codigoEmpleado + ", codigoTipo="
				+ codigoTipo + ", codigoMovimientoImporte=" + codigoMovimientoImporte + "]";
	}
	
	
	
}

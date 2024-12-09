package com.pe.certus.model;

public class MovimientoResponse {
	
	private String codigoMovimiento;
	private Integer numeroMovimiento;
	private String fecha;
	private String empleado;
	private String tipoCodigo;
	private Double movimientoImporte;
	
	
	public MovimientoResponse() {
		super();
	}

	
	public MovimientoResponse(String codigoMovimiento, Integer numeroMovimiento, String fecha, String empleado,
			String tipoCodigo, Double movimientoImporte) {
		super();
		this.codigoMovimiento = codigoMovimiento;
		this.numeroMovimiento = numeroMovimiento;
		this.fecha = fecha;
		this.empleado = empleado;
		this.tipoCodigo = tipoCodigo;
		this.movimientoImporte = movimientoImporte;
	}

	
	public String getCodigoMovimiento() {
		return codigoMovimiento;
	}

	public void setCodigoMovimiento(String codigoMovimiento) {
		this.codigoMovimiento = codigoMovimiento;
	}

	public Integer getNumeroMovimiento() {
		return numeroMovimiento;
	}

	public void setNumeroMovimiento(Integer numeroMovimiento) {
		this.numeroMovimiento = numeroMovimiento;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}

	public String getTipoCodigo() {
		return tipoCodigo;
	}

	public void setTipoCodigo(String tipoCodigo) {
		this.tipoCodigo = tipoCodigo;
	}

	public Double getMovimientoImporte() {
		return movimientoImporte;
	}

	public void setMovimientoImporte(Double movimientoImporte) {
		this.movimientoImporte = movimientoImporte;
	}

	
	@Override
	public String toString() {
		return "MovimientoResponse [codigoMovimiento=" + codigoMovimiento + ", numeroMovimiento=" + numeroMovimiento
				+ ", fecha=" + fecha + ", empleado=" + empleado + ", tipoCodigo=" + tipoCodigo + ", movimientoImporte="
				+ movimientoImporte + "]";
	}
	
	
	
	

}

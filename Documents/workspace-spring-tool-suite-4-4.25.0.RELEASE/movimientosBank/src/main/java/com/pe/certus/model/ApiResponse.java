package com.pe.certus.model;

import java.util.List;

public class ApiResponse {
	private String codigo;
	private String mensaje;
	private List<MovimientoResponse> data;
	
	public ApiResponse() {
		super();
	}

	public ApiResponse(String codigo, String mensaje, List<MovimientoResponse> data) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
		this.data = data;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<MovimientoResponse> getData() {
		return data;
	}

	public void setData(List<MovimientoResponse> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ApiResponse [codigo=" + codigo + ", mensaje=" + mensaje + ", data=" + data + "]";
	}
	
}

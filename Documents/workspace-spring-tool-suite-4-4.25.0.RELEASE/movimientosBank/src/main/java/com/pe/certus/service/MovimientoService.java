package com.pe.certus.service;



import javax.ws.rs.core.Response;


import com.pe.certus.model.MovimientoRequest;


public interface MovimientoService {
	
	public Response listarMovimiento();
	public Response cerarMovimiento(MovimientoRequest movimientoRequest);

}

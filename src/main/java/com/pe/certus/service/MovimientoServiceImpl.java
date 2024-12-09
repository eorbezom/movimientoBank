package com.pe.certus.service;



import javax.ws.rs.core.Response;

import com.pe.certus.dao.MovimientoDao;
import com.pe.certus.model.ApiResponse;
import com.pe.certus.model.MovimientoRequest;

import com.pe.certus.util.ResponseUtil;

public class MovimientoServiceImpl implements MovimientoService{
	
	private MovimientoDao movimientoDao = new MovimientoDao();

	@Override
	public Response listarMovimiento() {
		
		return ResponseUtil.responseApiMovimientos("0", "Consulta Exitosa", movimientoDao.listarMovimientos());//LLAMAMOS MOVIMIENTODAO Y METODO LISTARMOVIMIENTO
	}

	@Override
	public Response cerarMovimiento(MovimientoRequest movimientoRequest) {
		ApiResponse response = movimientoDao.insertarMovimieto(movimientoRequest);
		return ResponseUtil.responseApiMovimientos(response.getCodigo(), response.getMensaje(), null);
	}

	
	
}

package com.pe.certus.util;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.pe.certus.model.ApiResponse;
import com.pe.certus.model.MovimientoResponse;


public class ResponseUtil {
											//METODO QUE CONSTRUYE EL MENSAJE Y LA DATA DE MOVIMIENTORESPONSE
	public static Response responseApiMovimientos(String codigo, String mensaje, List<MovimientoResponse> data) {
		ApiResponse response = new ApiResponse(codigo, mensaje, data);//ESTRUCTURA DE LA RESPUESTA
		if(data != null) { //SI LA DATA ES DIFERENTE QUE NULL RETORNA LA CLASE RESPONSE
			return Response.status(Status.OK).entity(response).build();//RESPONSE DEVULEVE LA ESTRUCTURA
		}else{
			return Response.status(Status.CREATED).entity(response).build();
		}
	}
}

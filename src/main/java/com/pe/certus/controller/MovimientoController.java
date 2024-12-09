package com.pe.certus.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response; 

import com.pe.certus.model.MovimientoRequest;
import com.pe.certus.service.MovimientoService;
import com.pe.certus.service.MovimientoServiceImpl;


@Path("v1/movimientos")
public class MovimientoController {
	
	private MovimientoService movimientoService = new MovimientoServiceImpl();
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON) //REQUEST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllMovimientos() {
		return movimientoService.listarMovimiento();
	}
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON) //REQUEST peticion
	@Produces(MediaType.APPLICATION_JSON) //respuesta
	public Response createMovimiento(MovimientoRequest request) {
		return movimientoService.cerarMovimiento(request);
	}
	

}

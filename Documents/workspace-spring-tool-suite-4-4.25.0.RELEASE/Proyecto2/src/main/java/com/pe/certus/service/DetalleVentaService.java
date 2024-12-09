package com.pe.certus.service;

import java.util.List;

import com.pe.certus.dao.DetalleVentaDao;
import com.pe.certus.model.DetalleVenta;

public class DetalleVentaService {
	
	
	private DetalleVentaDao detalleVentaDao = new DetalleVentaDao();
	
	public List<DetalleVenta> listarDetalleVenta(){
		return detalleVentaDao.listarDetalleVentas();// se lista todo el 
	}
	
	//para insertar dato
	public void insertarDetalleVenta(DetalleVenta detalleVenta) {
		
		detalleVentaDao.insertarDato(detalleVenta);
		
	}
	//PARA ACTUALIZAR DATOS
	
	public void actualizardventa(DetalleVenta detalleventa) {
		detalleVentaDao.actualizar(detalleventa);
		
	}
	//PARA ELIMINAR DATO 
	 public void eliminarDato(int codigoventa, int codigoproducto) {		 
		 detalleVentaDao.eliminarDatos(codigoventa, codigoproducto );
		 
	 }

}

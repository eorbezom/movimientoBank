package com.pe.certus.service;

import java.util.List;

import com.pe.certus.dao.VentaDao;
import com.pe.certus.model.Venta;

public class VentaService {
	
	
	private VentaDao ventadao = new VentaDao();
	
	public List<Venta> listarVenta(){
		return ventadao.listarVenta();
	}
	//insertar
	public void insertarVenta(Venta venta) {
		ventadao.insertar(venta);
	}
	//actualizar
	public void actualizarVenta(Venta venta) {
		ventadao.actualizar(venta);
	}
	// eliminar
	public void eliminarVenta(int codigoventa) {
		ventadao.eliminar(codigoventa);
		
	}

}

package com.pe.certus.service;

import java.util.List;

import com.pe.certus.dao.ProductoDao;
import com.pe.certus.model.Producto;
// este archivo solo hace la comunicacion
public class ProductoService {
	
	//logica de producto
	//instanciando productoDao para listar
	private ProductoDao productoDao = new ProductoDao(); 

	public List<Producto> listarProductos(){
		return productoDao.listarProductos();// se esta llamando producto dao y su metodo
		
		
	}
	//insertar producto
	public void insertarProducto(Producto producto) {
		
		productoDao.insertar(producto);
		
	}
	
	//actualizar produco
	public void actualizarProducto(Producto producto) {
		productoDao.actualizar(producto);// como parametro pasamos el producto
		
		
	}
	
	
	public void eliminaProducto(int codProducto) {
		productoDao.eliminar(codProducto);
	}

}

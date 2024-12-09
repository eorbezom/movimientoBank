package com.pe.certus.controller;

import com.pe.certus.model.Producto;
import com.pe.certus.service.DetalleVentaService;
import com.pe.certus.service.ProductoService;

//se ejecuta el la aplicacion para saber si funciona correctamente
public class ProductoController {
	
	
	public static void main(String[] arg) {
		
		//llamar los meotodos
		System.out.println("Proyecto 2");
		ProductoService productoService = new ProductoService();
		//se lista los producto de la tabla
		System.out.println("lista de de todo mis productos");
		System.out.println(productoService.listarProductos());
		
		// se inserta nuevo producto a la tabla
		System.out.println("insertar un producto");
		productoService.insertarProducto(new Producto(6,"Uva",7.99));//se esta utiliazndo el constructor de la clase producto y se pasa los valores
		System.out.println(productoService.listarProductos());
	
		//se actualisa nuevo producto
		System.out.println("actualisando producto");
		productoService.actualizarProducto(new Producto(8,"Durazno",10.2));
		System.out.println(productoService.listarProductos());
		
		
		
		//se elimina el producto de la tabla
		
		System.out.println("eliminando producto");
		productoService.eliminaProducto(7);
		System.out.println(productoService.listarProductos());
		
		
		
	}
	
	
}

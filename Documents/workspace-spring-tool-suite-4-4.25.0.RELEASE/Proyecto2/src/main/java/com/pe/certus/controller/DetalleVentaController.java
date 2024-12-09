package com.pe.certus.controller;

import com.pe.certus.model.DetalleVenta;
import com.pe.certus.service.DetalleVentaService;

public class DetalleVentaController {
	
	public static void main(String[] arg) {
		
		//AQUI SE LLAMA LOS METODOS
		System.out.println("proyecto 2 tabla detalle venta");
		DetalleVentaService detalleVentaService = new DetalleVentaService();
		
		//LISTAR LA TABLA DETALLEVENTA
		System.out.println("listar detalle venta");
		System.out.println(detalleVentaService.listarDetalleVenta());
		
//		System.out.println("se inserta nuevo dato en la tabla detalleventa");
//		detalleVentaService.insertarDetalleVenta(new DetalleVenta(1,6,2.55,20.55));
//		System.out.println(detalleVentaService.listarDetalleVenta());
//		
		System.out.println("actualizando detalle de venta");
		detalleVentaService.actualizardventa(new DetalleVenta(1,6,2.2,3.3));
		System.out.println(detalleVentaService.listarDetalleVenta());
		// Eliminar detalle de venta
//        int codigoVenta = 2; // Código de venta a eliminar
//        int codigoProducto = 5; // Código de producto a eliminar
//        System.out.println("Eliminando detalle de venta con codigoventa: " + codigoVenta + " y codigoproducto: " + codigoProducto);
//        detalleVentaService.eliminarDato(codigoVenta, codigoProducto); // Llamar a eliminarDato con dos argumentos
//        System.out.println(detalleVentaService.listarDetalleVenta());
	}

}

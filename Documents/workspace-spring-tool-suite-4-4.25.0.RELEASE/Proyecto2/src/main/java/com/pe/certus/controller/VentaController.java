package com.pe.certus.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.pe.certus.model.Venta;
import com.pe.certus.service.VentaService;

public class VentaController {
	
	public static void main(String[] arg)throws ParseException {
		
		VentaService ventaService = new VentaService();
		//listando venta
		System.out.println("lista de ventas");
		System.out.println(ventaService.listarVenta());
		
		//insertando nuevo venta
		System.out.println("insertando nuevo venta");
		ventaService.insertarVenta(new Venta(13, "papi", new Date()));
		
		//actualizando venta
		System.out.println("ACTUALIZANDO  nuevo venta");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date nuevaFecha = sdf.parse("2016-02-16 04:35:25");
		
		ventaService.actualizarVenta(new Venta(4, "mi tia", nuevaFecha));
		System.out.println(ventaService.listarVenta());
		
		//eliminar venta
		System.out.println("se elimina una venta");
		ventaService.eliminarVenta(12);
		System.out.println(ventaService.listarVenta());
		
		
	}
	

}

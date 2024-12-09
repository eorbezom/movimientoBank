package com.pe.certus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pe.certus.model.Producto;

public class ProductoDao {
	
	//omteber lista de todo los productos
	//se llama desde paquete model 
	//devuleve todo la lsita del producto
	public List<Producto> listarProductos() {
		
		List<Producto> listaProducto = new ArrayList(); // se guarda todo los datos que se llama la lista 
		try {
			//se obtiene todo los productos a nivel de query
			String sql ="SELECT * FROM producto"; //consulta
			Connection cn = ConexionDB.getConexion(); // en cn se guarda la conexion
			PreparedStatement ps = cn.prepareStatement(sql);//la conexion cn ejecuta la consulta
			ResultSet rs = ps.executeQuery(); // ps ejecuta las consultas y lo guarda en rs
			
			//recorre el objeto
			while (rs.next()) { //obtego el rs por el metodo next
				
				Producto p = new Producto();
				// se asigna nuevo valor
				p.setCodProducto(rs.getInt("codigoproducto"));
				p.setNombre(rs.getString("nombre"));
				p.setPrecio(rs.getDouble("precio"));
				listaProducto.add(p);
							
				
			}
			
			//cerramos la conexion 
			ConexionDB.cerrarConexion(cn);
			ConexionDB.cerrarPreparedStatement(ps);
			ConexionDB.cerrarResulset(rs);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return listaProducto; // mi metodo retorna todo  la lista de producto
		
	}
	
	
	//metodo para insertar  producto
	public void insertar(Producto producto) {
		try {
			//                            el query no debueble nada          ??? es una buena practica para seguridad
			String sql ="INSERT INTO producto(codigoproducto, nombre, precio)VALUE(?,?,?)";//? ES DINAMICO POR QUE LA INSERCION VIENE DE LA CLASE PRODUCTO
			Connection cn = ConexionDB.getConexion();
			PreparedStatement ps = cn.prepareStatement(sql);
			
			ps.setInt(1, producto.getCodProducto());// los campos de la tabla 
			ps.setString(2, producto.getNombre());
			ps.setDouble(3, producto.getPrecio());
			
			ps.executeUpdate();// aqui se ejecuta lo que se insertar 
			ConexionDB.cerrarConexion(cn);
			ConexionDB.cerrarPreparedStatement(ps); 
			// ya no se ejecuta el resulset por que no devuelve nada y no se esta usando
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//metodo para actualizar
	public void actualizar(Producto producto) {
		try {
			String sql ="UPDATE producto SET nombre=?, precio =? WHERE codigoproducto =? ";
			Connection cn =ConexionDB.getConexion();
			PreparedStatement ps =cn.prepareStatement(sql);
			
			ps.setNString(1, producto.getNombre());
			ps.setDouble(2, producto.getPrecio());
			ps.setInt(3, producto.getCodProducto());
			
			
			ps.executeUpdate();
			ConexionDB.cerrarConexion(cn);
			ConexionDB.cerrarPreparedStatement(ps);
			
		}catch (Exception e) {
			e.printStackTrace();// imprime la traza completa
		}
	}
	
	// metodo para eliminar
	public void eliminar(int codProducto) {
		try {
			String sql="delete from producto where codigoproducto = ?";
			Connection cn = ConexionDB.getConexion();
			PreparedStatement ps =cn.prepareStatement(sql);
			
			
			ps.setInt(1, codProducto);// LA HORA DE EJECUTAR LA LINEA 101 EN 103 TENGO QUE SETEAR  Y QUE SOLAMENETE ES PRIMER CAMPO
			ps.executeUpdate();// PARA EJECUTAR DELE INSERTA ES UN EXECURE QUERE
			
			ConexionDB.cerrarConexion(cn);
			ConexionDB.cerrarPreparedStatement(ps);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}

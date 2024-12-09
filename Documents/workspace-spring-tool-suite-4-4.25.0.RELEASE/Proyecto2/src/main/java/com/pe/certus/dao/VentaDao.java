package com.pe.certus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pe.certus.model.Venta;

public class VentaDao {
	
	//PARA LISTAR PRODCUTO
	public List<Venta> listarVenta(){
		List<Venta> listarVenta = new ArrayList<>();
		
		
		try {
			String sql="select * from  venta;";
			Connection cn = ConexionDB.getConexion();
			PreparedStatement ps = cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Venta v =new Venta();
				v.setCodigoventa(rs.getInt("codigoventa"));
				v.setCliente(rs.getString("cliente"));
				v.setFecha(rs.getTimestamp("fecha"));
				
				listarVenta.add(v);
			}
			
			ConexionDB.cerrarConexion(cn);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listarVenta;
	}
	
	//INSERTAR 
	public void insertar(Venta venta) {
		try {
			
			
			String sql ="INSERT INTO venta(codigoventa, cliente, fecha)VALUE(?, ?,?)";
			Connection cn = ConexionDB.getConexion();
			PreparedStatement ps = cn.prepareStatement(sql);
			
			ps.setInt(1, venta.getCodigoventa());
			ps.setString(2, venta.getCliente());
			ps.setTimestamp(3, new java.sql.Timestamp(venta.getFecha().getTime()));
			
			
			ps.executeUpdate();
			ConexionDB.cerrarConexion(cn);
			ConexionDB.cerrarPreparedStatement(ps);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	// actualizar venta
	public void actualizar(Venta venta) {
		
		try {
			String sql="UPDATE venta SET cliente = ?, fecha = ? WHERE codigoventa = ? ";
			Connection cn = ConexionDB.getConexion();
			PreparedStatement ps = cn.prepareStatement(sql);
			
			
			ps.setString(1, venta.getCliente());
			ps.setTimestamp(2, new java.sql.Timestamp(venta.getFecha().getTime()));
			ps.setInt(3, venta.getCodigoventa());
			
			
			
			
			
			ps.executeUpdate();
			ConexionDB.cerrarConexion(cn);
			ConexionDB.cerrarPreparedStatement(ps);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//metoo para eliminar la venta
	public void eliminar(int codigoventa) {
		
		try {
			String sql ="delete from venta where codigoventa = ?";
			Connection cn= ConexionDB.getConexion();
			PreparedStatement ps = cn.prepareStatement(sql);
			
			ps.setInt(1, codigoventa);
			ps.executeUpdate();
			
			ConexionDB.cerrarConexion(cn);
			ConexionDB.cerrarPreparedStatement(ps);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}

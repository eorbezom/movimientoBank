package com.pe.certus.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pe.certus.model.ApiResponse;
import com.pe.certus.model.MovimientoRequest;
import com.pe.certus.model.MovimientoResponse;

public class MovimientoDao {
	public List<MovimientoResponse> listarMovimientos(){
		List<MovimientoResponse> listaMovimiento = new ArrayList<MovimientoResponse>();
		try {
			String sql = "SELECT m.chr_cuencodigo,m.int_movinumero,m.dtt_movifecha, CONCAT(e.vch_emplnombre,'-',e.vch_emplpaterno)as empleado,tm.vch_tipodescripcion,m.dec_moviimporte "
					+ "FROM movimiento m "
					+ "INNER JOIN empleado e ON m.chr_emplcodigo = e.chr_emplcodigo "
					+ "INNER JOIN tipomovimiento tm ON m.chr_tipocodigo = tm.chr_tipocodigo;"
					+ "";
			Connection cn = ConexionDB.getConexion();
			PreparedStatement ps = cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				MovimientoResponse movimiento = new MovimientoResponse();
				movimiento.setCodigoMovimiento(rs.getString("chr_cuencodigo"));
				movimiento.setNumeroMovimiento(rs.getInt("int_movinumero"));
				movimiento.setFecha(rs.getString("dtt_movifecha"));
				movimiento.setEmpleado(rs.getString("empleado"));
				movimiento.setTipoCodigo(rs.getString("vch_tipodescripcion"));
				movimiento.setMovimientoImporte(rs.getDouble("dec_moviimporte"));
				listaMovimiento.add(movimiento);
			}
			ConexionDB.cerrarConexion(cn);
			ConexionDB.cerrarPreparedStatement(ps);
			ConexionDB.cerrarResultset(rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaMovimiento;//DEVULEVE LO QUE LISTa TODO EL DATO
	}
	
	
	public ApiResponse insertarMovimieto(MovimientoRequest movimientoRequest) {
		ApiResponse response = new ApiResponse(); 
		try {
			
			String sql = "CALL sp_insert_movimiento(?,?,?,?,?,?,?,?);";//6:INPUT,2:UOPUT
			Connection cn = ConexionDB.getConexion();
			CallableStatement cs = cn.prepareCall(sql);
			
			//entrada
			cs.setString(1, movimientoRequest.getCodigoMovimiento());
			cs.setInt(2, movimientoRequest.getCodigoNumeroMovimiento());
			cs.setString(3, movimientoRequest.getFecha());
			cs.setInt(4, movimientoRequest.getCodigoEmpleado());
			cs.setInt(5, movimientoRequest.getCodigoTipo());
			cs.setDouble(6, movimientoRequest.getCodigoMovimientoImporte());
			
			//salida						
			cs.registerOutParameter(7, java.sql.Types.INTEGER);
			cs.registerOutParameter(8, java.sql.Types.VARCHAR);
			cs.execute();
			
			response.setCodigo(String.valueOf(cs.getInt(7))); //llama al mensaje --string modifica el int a string
			response.setMensaje(cs.getString(8));
			
			ConexionDB.cerrarConexion(cn);
			ConexionDB.cerrarCallableStatement(cs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

}

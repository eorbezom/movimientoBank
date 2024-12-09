package com.pe.certus.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.pe.certus.model.DetalleVenta;

public class DetalleVentaDao {

    // Método para listar los detalles de venta
    public List<DetalleVenta> listarDetalleVentas() {
        List<DetalleVenta> listadatalles = new ArrayList<>();  // Lista que almacenará los detalles de venta

        try {
            String sql = "select * from  detalleventa";  // Consulta SQL para obtener todos los registros de la tabla detalleventa
            Connection cn = ConexionDB.getConexion();  // Obtiene la conexión a la base de datos
            PreparedStatement ps = cn.prepareStatement(sql);  // Prepara la consulta
            ResultSet rs = ps.executeQuery();  // Ejecuta la consulta y obtiene los resultados

            // Itera sobre los resultados obtenidos
            while (rs.next()) {
                DetalleVenta d = new DetalleVenta();  // Crea un objeto DetalleVenta
                d.setCodigoVenta(rs.getInt("codigoventa"));  // Asigna el valor del campo "codigoventa" al objeto
                d.setCodigoProducto(rs.getInt("codigoproducto"));  // Asigna el valor del campo "codigoproducto" al objeto
                d.setCantidad(rs.getDouble("cantidad"));  // Asigna el valor del campo "cantidad" al objeto
                d.setDescuento(rs.getDouble("descuento"));  // Asigna el valor del campo "descuento" al objeto

                listadatalles.add(d);  // Añade el objeto DetalleVenta a la lista
            }

            // Cierra las conexiones y el ResultSet
            ConexionDB.cerrarConexion(cn);
            ConexionDB.cerrarPreparedStatement(ps);
            ConexionDB.cerrarResulset(rs);

        } catch (Exception e) {
            e.printStackTrace();  // Imprime el error si ocurre alguna excepción
        }
        return listadatalles;  // Retorna la lista de detalles de venta
    }

    // Método para insertar un nuevo dato en la tabla
    public void insertarDato(DetalleVenta detalleVenta) {
        try {
            String sql = "INSERT INTO detalleventa(codigoventa, codigoproducto, cantidad, descuento)VALUES(?,?,?,?)";  // Consulta SQL para insertar un nuevo registro
            Connection cn = ConexionDB.getConexion();  // Obtiene la conexión a la base de datos
            PreparedStatement ps = cn.prepareStatement(sql);  // Prepara la consulta

            // Asigna los valores del objeto detalleVenta a los parámetros de la consulta
            ps.setInt(1, detalleVenta.getCodigoVenta());
            ps.setInt(2, detalleVenta.getCodigoProducto());
            ps.setDouble(3, detalleVenta.getCantidad());
            ps.setDouble(4, detalleVenta.getDescuento());

            ps.executeUpdate();  // Ejecuta la consulta de inserción
            ConexionDB.cerrarConexion(cn);  // Cierra la conexión
            ConexionDB.cerrarPreparedStatement(ps);  // Cierra el PreparedStatement

        } catch (Exception e) {
            e.printStackTrace();  // Imprime el error si ocurre alguna excepción
        }
    }

    // Método para actualizar un registro de la tabla
    public void actualizar(DetalleVenta dventa) {
        try {
            String sql = "UPDATE detalleventa SET codigoproducto=?, cantidad=?, descuento=? WHERE codigoventa=?";  // Consulta SQL para actualizar los registros de la tabla detalleventa
            Connection cn = ConexionDB.getConexion();  // Obtiene la conexión a la base de datos
            PreparedStatement ps = cn.prepareStatement(sql);  // Prepara la consulta

            // Asigna los valores del objeto dventa a los parámetros de la consulta
            ps.setInt(1, dventa.getCodigoProducto());
            ps.setDouble(2, dventa.getCantidad());
            ps.setDouble(3, dventa.getDescuento());
            ps.setInt(4, dventa.getCodigoVenta());

            ps.executeUpdate();  // Ejecuta la consulta de actualización
            ConexionDB.cerrarConexion(cn);  // Cierra la conexión
            ConexionDB.cerrarPreparedStatement(ps);  // Cierra el PreparedStatement

        } catch (Exception e) {
            e.printStackTrace();  // Imprime el error si ocurre alguna excepción
        }
    }

    // Método para eliminar un registro de la tabla detalleventa
    public void eliminarDatos(int codigoproducto, int codigoventa) {
        try {
            String sql = "DELETE FROM detalleventa WHERE codigoventa=? AND codigoproducto=?";  // Consulta SQL para eliminar un registro
            Connection cn = ConexionDB.getConexion();  // Obtiene la conexión a la base de datos
            PreparedStatement ps = cn.prepareStatement(sql);  // Prepara la consulta

            // Asigna los valores de los parámetros a la consulta
            ps.setInt(1, codigoventa);
            ps.setInt(2, codigoproducto);

            ps.executeUpdate();  // Ejecuta la consulta de eliminación

            ConexionDB.cerrarConexion(cn);  // Cierra la conexión
            ConexionDB.cerrarPreparedStatement(ps);  // Cierra el PreparedStatement

        } catch (Exception e) {
            e.printStackTrace();  // Imprime el error si ocurre alguna excepción
        }
    }
}

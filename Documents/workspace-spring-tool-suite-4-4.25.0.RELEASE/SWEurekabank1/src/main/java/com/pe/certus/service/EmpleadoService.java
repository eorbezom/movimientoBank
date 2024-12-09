package com.pe.certus.service;

import java.util.List;

import com.pe.certus.entity.Empleado;

public interface EmpleadoService {
	
	
	public List<Empleado> listarEmpleado();
	public Empleado getEmpleado(Long codigo);
	public void crearActualizarEmpleado(Empleado empleado);
	public void eliminarEmpleado(Long codigo);

}

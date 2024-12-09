package com.pe.certus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.certus.entity.Empleado;
import com.pe.certus.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	
	//CREANDO INSTANCIAS DE REPOSITORY
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public List<Empleado>listarEmpleado(){
		return empleadoRepository.findAll();		
	}
	
	
	@Override
	public Empleado getEmpleado(Long codigo) {
		
		return empleadoRepository.findById(codigo).orElse(null);
	}
	
	
	public void crearActualizarEmpleado(Empleado empleado ) {
		Empleado emp = new Empleado();
		emp.setCodigo(empleado.getCodigo());
		emp.setPaterno(empleado.getPaterno());
		emp.setMaterno(empleado.getMaterno());
		emp.setNombre(empleado.getNombre());
		emp.setUsuario(empleado.getUsuario());
		
		if(empleado.getEstado()== null) {
			emp.setEstado(true);
		}else {
			emp.setEstado(empleado.getEstado());
		}
		//emp.setEstado(empleado.getEstado());
		
		empleadoRepository.save(emp);
		
	}
	
	
	public void eliminarEmpleado(Long coLong) {
		empleadoRepository.deleteById(coLong);
	}

}

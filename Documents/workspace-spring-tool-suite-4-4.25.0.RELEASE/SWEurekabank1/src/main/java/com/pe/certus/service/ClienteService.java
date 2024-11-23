package com.pe.certus.service;

import java.util.List;

import com.pe.certus.entity.Cliente;




public interface ClienteService {
	
	//SE DEFINE LOS METODO
	public List<Cliente> listarclientes(); // LISTAR CLIENTE 
	public Cliente getIdCliente(Long id); //OBTENER CLIENTE POR SU ID
	public void crearActualizarCliente(Cliente cliente); //CREAR ACTUALIZAR UN CLIENTE
	public void eliminarCliente(Long id); // ELIMINAR UN CLIENTE
	

}

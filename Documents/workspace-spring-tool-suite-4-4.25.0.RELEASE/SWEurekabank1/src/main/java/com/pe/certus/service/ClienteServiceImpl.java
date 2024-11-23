package com.pe.certus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.certus.entity.Cliente;
import com.pe.certus.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	//INSTANCIA CLIENTEREPOSITORY
	//MINUTO 2:445
	@Autowired
	private ClienteRepository clienteRepository; //AQUI SE LLAMA AL REPOSITORIO

	@Override
	public List<Cliente> listarclientes() {
		//CON EL METODO DE JPM REPOSITORI FACILITANDO LA LISTA DE LOS CLIENTES
		return clienteRepository.findAll();
	}

	@Override
	public Cliente getIdCliente(Long id) {// PARA OBTENER UN CLIENTE POR ID
		
		return clienteRepository.findById(id).orElse(null);
	}

	@Override
	public void crearActualizarCliente(Cliente cliente) { //SETEAMOS AL NUEVO CLIENTE
		
		Cliente cli = new Cliente();
		cli.setId(cliente.getId());
		cli.setPaterno(cliente.getPaterno());
		cli.setMaterno(cliente.getMaterno());
		cli.setNombres(cliente.getNombres());
		cli.setDni(cliente.getDni());
		cli.setCiudad(cliente.getCiudad());
		cli.setEmail(cliente.getEmail());
		
		if(cliente.getEstado() == null) {
			cli.setEstado(true);
		}else {
			cli.setEstado(cliente.getEstado());
		}
		
		clienteRepository.save(cli);
		
		
	}

	@Override
	public void eliminarCliente(Long id) {// PARA ELIMINAR CON SU ID
		
		clienteRepository.deleteById(id);;
		
		
	}

}

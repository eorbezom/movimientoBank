package com.pe.certus.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pe.certus.entity.Cliente;
import com.pe.certus.service.ClienteService;

@Controller
@RequestMapping("/")//PARA DEFINIR LAS RUTAS
public class ClienteController {
	
	private final Logger log = LoggerFactory.getLogger(Cliente.class);//PARA QUE ME VISUALICE LA DATA EN CONSOLA (LOGG
	
	@Autowired //IYECTO A MI CLASE CLIENTE SERVICE
	private ClienteService clienteService;
	
	@GetMapping("views/cliente")
	public String litar(Model model) {
		
		
		List<Cliente>cliente = clienteService.listarclientes();
		log.info("Listar Objetos {}",cliente);  
		model.addAttribute("clientes", cliente);
		
		//clienteService.listarclientes();
		return"/views/cliente/listar"; //AQUI DEVUELVO LA VISTA
		
	}
	@GetMapping("views/cliente/create")
	public String crear() {
		return "/views/cliente/create";
	}
	//minuto 13
	
	@PostMapping("views/cliente/save")
	public String guardar(Cliente cliente) {
		
		log.info("Metodo guardar {}",cliente); // SOLO PARA MOSTAR EN CONSOLA
		clienteService.crearActualizarCliente(cliente);
		
		return"redirect:/views/cliente";
	}

}



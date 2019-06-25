package com.livros.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livros.api.models.Cliente;
import com.livros.api.models.Livro;
import com.livros.api.respository.ClienteRepository;


@RestController
@RequestMapping(value="/api")
public class ClienteResource {
	@Autowired
	ClienteRepository clienteRepository;
	
	@CrossOrigin
	@GetMapping("/clientes")
	public List<Cliente> listaClientes(){
		return clienteRepository.findAll();
	}
	
	@CrossOrigin
	@GetMapping("/clientes/{id}")
	public Cliente listaClienteUnico(@PathVariable(value="id") long id) {
		return clienteRepository.findById(id);
	}
	
	@CrossOrigin
	@PostMapping("/clientes")
	public Cliente salvaCliente(@RequestBody Cliente cliente) {
//		System.out.println("akjsdhjasg");
		return clienteRepository.save(cliente);
	}
	
	@CrossOrigin
	@DeleteMapping("/clientes")
	public void deletaCliente(@RequestBody Cliente cliente) {
		clienteRepository.delete(cliente);
	}
	
	@CrossOrigin
	@PutMapping("/clientes")
	public Cliente atualizaCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}

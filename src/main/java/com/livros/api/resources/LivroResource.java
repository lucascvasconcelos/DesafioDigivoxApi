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

import com.livros.api.respository.LivroRepository;
import com.livros.api.models.*;

//@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/api")
public class LivroResource {
	@Autowired
	LivroRepository livroRepository;
	
	@CrossOrigin
	@GetMapping("/livros")
	public List<Livro> listaLivros(){
		return livroRepository.findAll();
	}
	
	@CrossOrigin
	@GetMapping("/livros/{id}")
	public Livro listaLivroUnico(@PathVariable(value="id") long id) {
		return livroRepository.findById(id);
	}
	
	@CrossOrigin
	@PostMapping("/livros")
	public Livro salvaLivro(@RequestBody Livro livro) {
//		System.out.println("akjsdhjasg");
		return livroRepository.save(livro);
	}
	
	@CrossOrigin
	@DeleteMapping("/livros")
	public void deletaLivro(@RequestBody Livro livro) {
		livroRepository.delete(livro);
	}
	
	@CrossOrigin
	@PutMapping("/livros")
	public Livro atualizaLivro(@RequestBody Livro livro) {
		return livroRepository.save(livro);
	}
}

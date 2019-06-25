package com.livros.api.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livros.api.models.Cliente;
import com.livros.api.models.Livro;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	Cliente findById(long id);

}

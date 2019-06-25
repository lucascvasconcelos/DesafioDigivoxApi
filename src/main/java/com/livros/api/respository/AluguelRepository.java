package com.livros.api.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livros.api.models.Aluguel;

public interface AluguelRepository extends JpaRepository<Aluguel, Long> {

}

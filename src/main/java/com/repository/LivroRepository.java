package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	
	
	List<Livro> findByAutor(String autor);
	List<Livro> findByTitulo(String titulo);
	List findByIsbn(String isbn);
}

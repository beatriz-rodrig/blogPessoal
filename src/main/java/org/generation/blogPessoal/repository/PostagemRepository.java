package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	
	public List <Postagem> findAllByTituloContainingIgnoreCase (String titulo);

	
}

package br.com.padaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.padaria.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}

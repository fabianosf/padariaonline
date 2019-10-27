package br.com.padaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.padaria.domain.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{

}

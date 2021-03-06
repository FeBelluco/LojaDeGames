package com.generation.lojadegames.repository;

import java.math.BigDecimal;
import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.lojadegames.model.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long>{
	
	//public Optional<Produtos> findById(Long id);
	
	public List<Produtos> findAllByNomeContainingIgnoreCase(@Param ("nome")String nome);
	
	public List <Produtos> findByPrecoGreaterThanOrderByPreco(@Param ("preco")BigDecimal preco); //preço maior que...
	
	public List <Produtos> findAllByPrecoLessThanOrderByPrecoDesc(BigDecimal preco); //preco menor que...
	
	
	

}

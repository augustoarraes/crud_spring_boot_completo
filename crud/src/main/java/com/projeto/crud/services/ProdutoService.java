package com.projeto.crud.services;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import com.projeto.crud.models.ProdutoModel;
import com.projeto.crud.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	final ProdutoRepository produtoRepository;
	
	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	@Transactional
	public ProdutoModel save(ProdutoModel produtoModel) {
		return produtoRepository.save(produtoModel);
	}

	public List<ProdutoModel> findAll() {
		return produtoRepository.findAll();
	}
	
	public Page<ProdutoModel> findAll(Pageable pageable){
		return produtoRepository.findAll(pageable);
	}

	public Optional<ProdutoModel> findByid(UUID id) {
		return produtoRepository.findById(id);
	}

	@Transactional
	public void delete(ProdutoModel produtoModel) {
		produtoRepository.delete(produtoModel);
	}

}

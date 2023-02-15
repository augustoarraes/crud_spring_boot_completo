package com.projeto.crud.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

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

}

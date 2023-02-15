package com.projeto.crud.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.crud.dtos.ProdutoDto;
import com.projeto.crud.models.ProdutoModel;
import com.projeto.crud.services.ProdutoService;

@RestController
@CrossOrigin(origins="*", maxAge=3600)
@RequestMapping("/produto")
public class ProdutoController {
	
	final ProdutoService produtoService;

	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}
	
	@PostMapping
	public ResponseEntity<Object> salvarProduto( @RequestBody @Valid ProdutoDto produtoDto ){
		var produtoModel = new ProdutoModel();
		BeanUtils.copyProperties(produtoDto, produtoModel);
		produtoModel.setDataCriacao( LocalDateTime.now(ZoneId.of("UTC")) );
		return ResponseEntity.status(HttpStatus.CREATED).body( produtoService.save(produtoModel) );
	}
	

}

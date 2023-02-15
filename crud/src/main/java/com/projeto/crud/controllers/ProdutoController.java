package com.projeto.crud.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping
	public ResponseEntity<List<ProdutoModel>> getTodosProdutos(){
		return ResponseEntity.status(HttpStatus.OK).body(produtoService.findAll());
	}
	
	@GetMapping("/page")
	public ResponseEntity<Page<ProdutoModel>> getPaginaProdutos(@PageableDefault(page=0, size=10, sort="id", direction=Sort.Direction.ASC) Pageable pageable) {
		return ResponseEntity.status(HttpStatus.OK).body(produtoService.findAll(pageable));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getProdutoId(@PathVariable(value="id") UUID id){
		Optional<ProdutoModel> produtoModelOptional = produtoService.findByid(id);
		if (!produtoModelOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(produtoModelOptional.get());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteProduto(@PathVariable(value="id") UUID id){
		Optional<ProdutoModel> produtoModelOptional = produtoService.findByid(id);
		if (!produtoModelOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado!");
		}
		produtoService.delete(produtoModelOptional.get());
		return ResponseEntity.status(HttpStatus.OK).body("Produto excluído com suscesso!");
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateProduto(@PathVariable(value="id") UUID id, @RequestBody @Valid ProdutoDto produtoDto){
		Optional<ProdutoModel> produtoModelOptional = produtoService.findByid(id);
		if (!produtoModelOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado!");
		}
		var produtoModel = new ProdutoModel();
		BeanUtils.copyProperties(produtoDto, produtoModel);
		produtoModel.setId( produtoModelOptional.get().getId() );
		produtoModel.setDataCriacao( produtoModelOptional.get().getDataCriacao() );
		return ResponseEntity.status(HttpStatus.OK).body(produtoService.save(produtoModel));
	}

}

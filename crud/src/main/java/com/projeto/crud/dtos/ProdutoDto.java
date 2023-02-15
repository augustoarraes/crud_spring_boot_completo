package com.projeto.crud.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ProdutoDto {
	
	@NotBlank
	private String nomeProduto;
	
	@NotBlank
	@Size(max=10)
	private String categoria;
	
	
	private int quantidade;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}

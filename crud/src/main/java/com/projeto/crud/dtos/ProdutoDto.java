package com.projeto.crud.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.projeto.crud.models.ProdutoModel;

public class ProdutoDto {
	
	@NotBlank
	private String nomeProduto;
	
	@NotBlank
	@Size(max=10)
	private String categoria;
	
	private int quantidade;
	
	private double valor;
	
	public ProdutoDto(ProdutoModel produtoModel) {
		this.nomeProduto = produtoModel.getNomeProduto();
		this.categoria = produtoModel.getCategoria();
		this.quantidade = produtoModel.getQuantidade();
		this.valor = produtoModel.getValor();
	}
	
	

	public ProdutoDto() {
	}



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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}

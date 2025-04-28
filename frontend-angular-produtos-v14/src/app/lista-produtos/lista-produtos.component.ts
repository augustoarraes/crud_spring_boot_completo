import { Component, OnInit } from '@angular/core';
import { ProdutosService, Produto } from '../services/produtos.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-lista-produtos',
  templateUrl: './lista-produtos.component.html',
  styleUrls: ['./lista-produtos.component.css']
})

export class ListaProdutosComponent implements OnInit{

  produtos: Produto[] = [];

  constructor(private produtoService: ProdutosService, private router: Router) { }

  ngOnInit(): void {
    this.listarProdutos();
  }

  listarProdutos() {
    this.produtoService.listarProdutos().subscribe({
      next: (dados) => {
        this.produtos = dados;
      },
      error: (err) => {
        alert('Erro ao listar produtos!');
        console.error(err);
      }
    });
  }

  excluirProduto(id: string) {
    if (confirm('Tem certeza que deseja excluir este produto?')) {
      this.produtoService.excluirProduto(id).subscribe({
        next: () => {
          alert('Produto excluído com sucesso!');
          this.listarProdutos(); // Atualiza a lista após excluir
          //this.router.navigate(['/']);
        },
        error: (err) => {
          alert('Erro ao excluir o produto!');
          console.error(err);
        }
      });
    }
  }

}

import { Component } from '@angular/core';
import { ProdutosService } from '../services/produtos.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cadastra-produto',
  templateUrl: './cadastra-produto.component.html',
  styleUrls: ['./cadastra-produto.component.scss']
})

export class CadastraProdutoComponent {

  produto = {
    nomeProduto: '',
    categoria: '',
    quantidade: 0,
    valor: 0
  };

  constructor(private produtosService: ProdutosService, private router: Router) { }

  cadastraProduto() {
    this.produtosService.cadastraProduto(this.produto).subscribe({
      next: (res) => {
        alert('Produto '+ res.nomeProduto +'cadastrado com sucesso!');
        this.router.navigate(['/']); // Redireciona para a lista
      },
      error: (err) => {
        alert('Erro ao cadastrar produto: '+err);
        console.error('Erro ao cadastrar produto: ', err);
      }
    });
  }

  voltar() {
    this.router.navigate(['/']);
  }

}

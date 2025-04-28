import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProdutosService } from '../services/produtos.service';

@Component({
  selector: 'app-edita-produto',
  templateUrl: './edita-produto.component.html',
  styleUrls: ['./edita-produto.component.scss']
})

export class EditaProdutoComponent implements OnInit {

  produto = {
    nomeProduto: '',
    categoria: '',
    quantidade: 0,
    valor: 0
  };

  id!: string;

  constructor(
    private route: ActivatedRoute,
    private produtosService: ProdutosService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.paramMap.get('id')!;
    this.produtosService.buscarProdutoPorId(this.id).subscribe({
      next: (dados) => {
        this.produto = dados;
      },
      error: (err) => {
        alert('Erro ao carregar produto!');
        console.error(err);
      }
    });
  }

  salvarAlteracoes() {
    this.produtosService.atualizarProduto(this.id, this.produto).subscribe({
      next: () => {
        alert('Produto atualizado com sucesso!');
        this.router.navigate(['/']);
      },
      error: (err) => {
        alert('Erro ao atualizar produto!');
        console.error(err);
      }
    });
  }

  voltar() {
    this.router.navigate(['/']);
  }

}

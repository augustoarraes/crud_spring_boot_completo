import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProdutosService, Produto } from '../services/produtos.service';

@Component({
  selector: 'app-detalhe-produto',
  templateUrl: './detalhe-produto.component.html',
  styleUrls: ['./detalhe-produto.component.scss']
})
export class DetalheProdutoComponent implements OnInit {

  produto?: Produto;

  constructor(
    private route: ActivatedRoute,
    private produtosService: ProdutosService,
    private router: Router
  ) { }

  ngOnInit(): void {
    const id = String(this.route.snapshot.paramMap.get('id'));
    this.produtosService.buscarProdutoPorId(id).subscribe({
      next: (dados) => {
        this.produto = dados;
      },
      error: (err) => {
        alert('Erro ao carregar produto!');
        console.error(err);
      }
    });
  }

  voltar() {
    this.router.navigate(['/']);
  }
}

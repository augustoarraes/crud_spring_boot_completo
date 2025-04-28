import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ListaProdutosComponent} from './lista-produtos/lista-produtos.component'
import { CadastraProdutoComponent } from './cadastra-produto/cadastra-produto.component';
import { DetalheProdutoComponent } from './detalhe-produto/detalhe-produto.component';
import { EditaProdutoComponent } from './edita-produto/edita-produto.component';

const routes: Routes = [
  { path: '', component: ListaProdutosComponent },
  { path: 'cadastra-produto', component: CadastraProdutoComponent },
  { path: 'detalhar-produto/:id', component: DetalheProdutoComponent },
  { path: 'editar-produto/:id', component: EditaProdutoComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }

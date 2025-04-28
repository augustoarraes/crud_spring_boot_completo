import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { ListaProdutosComponent } from './lista-produtos/lista-produtos.component';
import { CadastraProdutoComponent } from './cadastra-produto/cadastra-produto.component';
import { DetalheProdutoComponent } from './detalhe-produto/detalhe-produto.component';
import { EditaProdutoComponent } from './edita-produto/edita-produto.component';

@NgModule({
  declarations: [
    AppComponent,
    ListaProdutosComponent,
    CadastraProdutoComponent,
    DetalheProdutoComponent,
    EditaProdutoComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

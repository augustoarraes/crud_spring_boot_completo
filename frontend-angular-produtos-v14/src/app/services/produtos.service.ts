import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Produto {
  id: string;
  nomeProduto: string;
  categoria: string;
  quantidade: number;
  valor: number;
  dataCriacao: string;
}

@Injectable({
  providedIn: 'root'
})

export class ProdutosService {

  private apiUrl = 'http://localhost:8080/produto';

  constructor(private http: HttpClient) { }

  listarProdutos(): Observable<Produto[]> {
    return this.http.get<Produto[]>(this.apiUrl);
  }

  cadastraProduto(produto: any) {
    return this.http.post<any>(this.apiUrl, produto);
  }

  excluirProduto(id: string) {
    return this.http.delete(`${this.apiUrl}/${id}`);
  }
  
  buscarProdutoPorId(id: string): Observable<Produto> {
    return this.http.get<Produto>(`${this.apiUrl}/${id}`);
  }

  atualizarProduto(id: string, produto: any): Observable<any> {
    return this.http.put(`${this.apiUrl}/${id}`, produto);
  }  
  
}


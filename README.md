# APP CRUD FullStack Completo

Elaborando um APP CRUD FullStack com FrontEnd em Angular 14.x, Backend com Java Spring Boot 3.4.4 e banco de dados Postgres 13.8, com deploy em duas versões Docker Compose.

Estrutura do Projeto:
- crud: é o backend Java Spring Boot
- frontend-angular-produtos-v14: é frontend Angular

## Subindo aplicação

Antes de subir a aplicação, verificar as credenciais no Docker Compose e no application.properties no backend.

A primeira mais simples:
```bash
docker compose up -d
```

A outra é um docker compose para ambiente Dev principalmente no frontend, comando abaixo. Enquanto codifica o frontend, o container de desenvolvimento é atualizado imediato para testes, correções e etc. Há um segundo dockerfile na pasta do frontend.
```bash
docker compose -f docker-compose.dev.yml up --build -d
```

Pronto, acesse a aplicação: [http://localhost:4200](http://localhost:4200)

Ao subir a aplicação, consulte também as Chamadas REST do backend:
[Documentação Swagger da API](http://localhost:8080/swagger-ui/index.html)

Em um visualizador Postgres de sua preferência, acesse também a base de dados da aplicação do seu ambiente de desenvolvimento. Consulte as credenciais de acesso ao banco no arquivo docker-compose.

## Contato

Augusto Arraes
[site](http://linktr.ee/a.arraes)


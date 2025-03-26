# CRUD Spring Boot Completo
Elaborando um CRUD Spring Boot completo, com deploy Docker. Uma API Backend com uma entidade de dados com Postgres.

## Subindo aplicação com Docker Composer

`docker compose up -d`

[Documentação Swagger](http://localhost:8080/swagger-ui/index.html)

## Chamadas REST CRUD

Aqui você pode testar via Postman ou em outra IDE de API de sua preferencia.

- Cadastro: Requisição de Inserção de dados via Método **POST** do HTTP.

        POST http://localhost:8080/produto
        {
    		"nomeProduto": "Aspirador",
    		"categoria": "Eletronico",
    		"quantidade": 30
        }
         
- Recuperando todos os registros: via **GET**

        GET http://localhost:8080/produto
        {
           {
        	"id": "b715cfec-debf-4c13-b180-4ef51be75384",
        	"nomeProduto": "Camisa",
       	 "categoria": "Vestuário",
        	"quantidade": 40,
        	"dataCriacao": "2023-02-15T11:37:56.807497"
	       },
   	    {
        	"id": "41623b23-0152-4b02-831a-7fb643e59ec9",
        	"nomeProduto": "Aspirador",
        	"categoria": "Eletronico",
        	"quantidade": 30,
        	"dataCriacao": "2023-02-15T13:55:22.413295"
   	    }
        }
        
- Recuperando um Registro: via **GET** com atributo id

        GET http://localhost:8080/produto/41623b23-0152-4b02-831a-7fb643e59ec9
        {
            "id": "41623b23-0152-4b02-831a-7fb643e59ec9",
    		"nomeProduto": "Aspirador",
    		"categoria": "Eletronico",
    		"quantidade": 30,
    		"dataCriacao": "2023-02-15T13:55:22.413295"
        }
        
- Recuperando Registros com paginação: via **GET**

        GET http://localhost:8080/produto/page?page=1&size=1
        {
   		 "content": [
    	    {
   	         "id": "49aac68b-7dac-43d1-ae1b-b55f1a450d60",
   	         "nomeProduto": "TV",
   	         "categoria": "Eletronico",
       	     "quantidade": 30,
       	     "dataCriacao": "2023-02-15T13:55:22.413295"
      	  }
  	  ],
 	   "pageable": {
       	 "sort": {
            	"empty": false,
            	"sorted": true,
            	"unsorted": false
        	},
        	"offset": 1,
        	"pageNumber": 1,
       	 "pageSize": 1,
       	 "paged": true,
      	  "unpaged": false
   	 },
  	  "last": false,
  	  "totalPages": 3,
 	   "totalElements": 3,
 	   "size": 1,
 	   "number": 1,
	    "sort": {
        	"empty": false,
       	 "sorted": true,
       	 "unsorted": false
    	},
    	"first": false,
    	"numberOfElements": 1,
   	 "empty": false
		}

- Atualizando dados de um Registro: via **PUT**

        PUT http://localhost:8080/produto/49aac68b-7dac-43d1-ae1b-b55f1a450d60
        {
    		"nomeProduto": "TV",
    		"categoria": "Eletronico",
    		"quantidade": 30
        }
        
- Excluindo um Registro:

        DELETE http://localhost:8080/produto/ece460f2-7756-42cc-9759-af3bc4dd4f76
        

## Monitoração de um CRUD

[Em desenvolvimento]

## Teste Unitário no Crud app

[Em desenvolvimento]


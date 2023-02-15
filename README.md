# CRUD Spring Boot Completo
Elaborando um CRUD Spring Boot completo até a monitoração. Uma API Backend com uma entidade de dados com Postgres.

## Chamadas REST

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
        
- Excluindo um Registro:

        DELETE http://localhost:8080/produto/ece460f2-7756-42cc-9759-af3bc4dd4f76
        
- Atualizando dados de um Registro: via **PUT**

        PUT http://localhost:8080/produto/49aac68b-7dac-43d1-ae1b-b55f1a450d60
        {
    		"nomeProduto": "TV",
    		"categoria": "Eletronico",
    		"quantidade": 30
        }

## Monitoração de um CRUD

[Em desenvolvimento]

## Subindo aplicação com Docker Composer

[Em desenvolvimento]




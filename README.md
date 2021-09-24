# GraphQL Example

Projeto exemplo de GraphQL. Adaptado de: https://github.com/eugenp/tutorials.

## Exemplos de chamadas:

Busca de livros e autores:
```
curl --location --request POST 'http://localhost:8090/graphql' \
--header 'Content-Type: application/json' \
--data-raw '{
"query": "query { recentBooks(count:10, offset:0) { id title category author { id name } } }",
"variables": {}
}'
```
Adicionar um novo livro:
```
curl --location --request POST 'http://localhost:8090/graphql' \
--header 'Content-Type: application/json' \
--data-raw '{
"query": "mutation { writeBook(title: \"teste\", category: \"teste\", author: \"1\") { title } }",
"variables": {}
}'
```

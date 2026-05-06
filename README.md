# API de Tarefas

Esse projeto é uma API simples que eu desenvolvi usando Java com Spring Boot.  
A ideia foi criar um sistema básico para gerenciar tarefas, simulando algo que poderia ser usado em um app ou sistema real.

## O que a API faz

- Cria tarefas
- Lista todas as tarefas
- Atualiza informações de uma tarefa
- Remove tarefas
- Permite filtrar por prioridade
- Permite ver apenas tarefas concluídas

## Tecnologias

- Java
- Spring Boot
- Banco de dados H2

## Como rodar o projeto

1. Executar a aplicação
2. Testar as rotas usando REST Client ou Postman

## Rotas principais

POST /tasks  
GET /tasks  
GET /tasks/concluidas  
GET /tasks/prioridade/{nivel}  
PUT /tasks/{id}  
DELETE /tasks/{id}
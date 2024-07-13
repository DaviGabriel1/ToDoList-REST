# REST API de lista de tarefas - Back End

## Sobre o Projeto
projeto desenvolvido de forma totalmente autonôma usando os conhecimentos adquiridos sobre REST APIs, Spring Boot, JPA e etc. 
O objetivo desse projeto é desenvolver um sistema de organização de tarefas através do trafego HTTP, podendo ter opções de GET, POST,PUT e DELETE de uma determinada tarefa

### Entidade 'Task'
entidade única mapeada com JPA e representada em um banco de dados MySQL
#### campos
- id (long)
- title (String)
- description (String)
- status (Status - Enum)

## Camadas
- repository: implentação da interface JpaRepository
- service: aplicação das regras de negócio com operações do repository
- controller: manipulação das operações HTTP e aplicação dos endpoints determinados
- model: classe da entidade Task
- exceptions: tratamento das exceções e manutenção para garantia de status Http correto

  
## Tecnologias
- Spring Boot 3
- MySQL
- Postman
- Maven
- HeidiSQL

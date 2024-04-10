<h1 align="center">adm-azs-shipping</h1>


## ✨ Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- Linguagem de Programação: [Java 17](https://www.oracle.com/br/java/technologies/javase/javase-jdk17-downloads.html)
- Banco de dados: [PostgreSQL](https://www.postgresql.org/)
- Frameworks: [Spring Boot](https://spring.io/projects/spring-boot)
- Ferramentas : [Docker](https://www.docker.com/)
- Arquitetura de projeto: [Port And Adapters](https://medium.com/bemobi-tech/ports-adapters-architecture-ou-arquitetura-hexagonal-b4b9904dad1a)


## 💻 Projeto

Projeto criado com objetivo de fazer uma gestão de informações de fretes que consiste basicamente em um CRUD das informações do frete.

Projeto consiste em criar um CRUD de cadastro de fretes, utilizando Spring Boot Java e PostgreSql
utilizando principalmente arquitetura HEXAGONAL e os metodos de segurança com os DTO's e utilizando boas praticas do Java.

## 🛠 Pré-requisitos
 Para roda a aplicação bastar ter o docker instalado na sua máquina:
 [Docker](https://www.docker.com/)
 
 Caso queira gerenciar o banco, recomendo usar o [PgAdmin](https://www.pgadmin.org/download/pgagent-windows/)

## 🚀 Como executar

- Clone o repositório
- Acesse a pasta do projeto no terminal do docker
- Rode o comando `docker-compose build`
- Após finalizar o comando acima rode o comando `docker-compose up -d`
- Utilize o insomnia ou postman para fazer os testes

## Documentaçao
Documentaçao do projeto foi gerada pelo Swagger-ui Então depois de rodar a aplicação acesse http://localhost:8080/swagger-ui/ e o banco de dados estará acessivel na porta http://localhost:5430

### 👨‍💻Autor <a id="autor"> </a>

---
<a href="https://github.com/Jesriel-Rodrigues" style="text-decoration: none;">
<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/86634066?s=400&u=d77baf6318280386d7479c622d6db4d50ce0693a&v=4" width="100px;"  alt="Jesriel Rodrigues"/>

<br />
<span> Feito por Jesriel Rodrigues</span> 
</a> 
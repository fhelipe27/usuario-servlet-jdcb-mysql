# Gerenciamento de Usuários Web com Java Servlet e JDBC

Este é um projeto de exemplo que demonstra como criar uma aplicação web de gerenciamento de usuários usando Java Servlet e JDBC (Java Database Connectivity). A aplicação permite o cadastro e armazenamento seguro de informações de usuário em um banco de dados MySQL.

## Funcionalidades

- Formulário de registro de usuário com campos para nome de usuário e senha.
- Armazenamento seguro de senhas usando MD5.
- Integração com um banco de dados MySQL para persistência de dados.
- Tratamento de erros e exceções.

## Pré-requisitos

Antes de executar a aplicação, certifique-se de ter as seguintes ferramentas instaladas:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [MySQL](https://www.mysql.com/)
- [Apache Tomcat](http://tomcat.apache.org/)

## Configuração do Banco de Dados

1. Crie um banco de dados MySQL chamado `exercicio`.
2. Configure as informações de conexão com o banco de dados no arquivo `ConnectionFactory.java`.

```java
String url = "jdbc:mysql://localhost/exercicio?characterEncoding=utf8";
return DriverManager.getConnection(url, "seu_usuario", "sua_senha");

## Executando a Aplicação

1.Clone este repositório para o seu ambiente local.
2. Compile o projeto Java.
3. Implante o arquivo WAR gerado no seu servidor Apache Tomcat.
4. Acesse a aplicação no navegador através do endereço http://localhost:8080/seu-contexto.

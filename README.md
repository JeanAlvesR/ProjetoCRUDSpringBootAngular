# Projeto de Cadastro de Alunos em Spring Boot e Angular

Este é um projeto de cadastro de alunos desenvolvido utilizando o framework Spring Boot para o backend e Angular para o frontend. O projeto utiliza o banco de dados H2-Console, o Maven para gerenciar as dependências e implementa diversas tecnologias e conceitos para facilitar o desenvolvimento.

## Backend

O backend do projeto é desenvolvido em Java utilizando o framework Spring Boot. Algumas das tecnologias e conceitos utilizados são:

- Hibernate e JPA: Utilizados para mapear as entidades do banco de dados e realizar operações de persistência.
- Aplicação em camadas: O código é organizado em camadas, separando a lógica de negócio, acesso ao banco de dados e comunicação com o frontend.
- Inversão de controle e injeção de dependência: Utilizamos interfaces e anotações do Spring para facilitar a injeção de dependências e tornar o código mais flexível e modular.
- DTO (Data Transfer Object): Utilizamos classes DTO para encapsular os dados que são enviados e recebidos pelos controllers, separando a lógica das entidades da comunicação com o frontend.
- Lombok: Utilizamos o Lombok para reduzir a verbosidade do código, gerando getters, setters, construtores e outros métodos automaticamente.
- Classes record: Utilizamos o recurso de classes record do Java para criar classes imutáveis e mais concisas.

Itens faltantes devido à escassez de tempo:
- Mais telas no frontend: Atualmente, o frontend possui apenas uma página com um formulário simples e uma listagem. Seria interessante adicionar mais telas, incluindo cadastro e login de usuários.
- Autenticação de rotas: No backend, seria interessante implementar autenticação de rotas utilizando token JWT, para garantir a segurança das rotas e controlar o acesso aos recursos.
- Testes unitários e de integração: A falta de tempo não permitiu a implementação de testes automatizados, mas seria importante adicionar testes unitários e de integração para garantir a qualidade e o funcionamento correto do sistema.
- Relações com novas entidades: Caso seja necessário adicionar novas entidades ao sistema, seria necessário fazer as devidas relações com as entidades existentes e ajustar a lógica do backend.

## Frontend

O frontend do projeto é desenvolvido em Angular, utilizando HTML, CSS e TypeScript. Algumas das tecnologias e conceitos utilizados são:

- Única página: O frontend é uma única página que contém um formulário simples para cadastro de alunos e uma listagem dos alunos cadastrados.
- Bootstrap: Utilizamos o framework Bootstrap para facilitar a estilização do frontend.
- HTML, CSS e TypeScript: Utilizamos essas linguagens para criar a estrutura, o estilo e a interatividade da página.

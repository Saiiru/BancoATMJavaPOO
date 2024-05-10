# Projeto Banco ATM em Java

## Descrição do Desafio

Este projeto é um desafio prático para reforçar o conhecimento em Programação Orientada a Objetos (POO) em Java. O desafio envolve a implementação de um banco digital, explorando os pilares da orientação a objetos. O contexto bancário é usado para explorar os conceitos de POO, permitindo aos participantes desenvolverem sua capacidade de abstração.

## Objetivo

O objetivo deste projeto é reforçar o conhecimento em Programação Orientada a Objetos (POO) em Java, através da implementação de um banco digital. O projeto permite que os clientes realizem operações bancárias básicas, como depósitos, saques e transferências.

## Descrição

Neste projeto, é fornecido um projeto de referência que utiliza os conceitos de POO e Java para criar um banco digital. O contexto bancário é explorado para explorar os pilares da orientação a objetos, permitindo que os participantes reproduzam a solução e desenvolvam sua capacidade de abstração.

## Requisitos Técnicos

- Conhecimentos básicos de Programação Orientada a Objetos em Java;
- Ambiente de desenvolvimento Java configurado;
- Acesso à internet para acesso ao projeto de referência no GitHub;
- Familiaridade com o uso de repositórios Git (opcional, mas recomendado);
- Capacidade de abstração para reproduzir a solução proposta e implementar melhorias.

## Documentação

O projeto é composto pelas seguintes classes e interfaces:

- `Cliente`: Representa um cliente do banco. Contém informações pessoais do cliente e a senha para autenticação.

- `Banco`: Representa o banco. Mantém um registro de todas as contas correntes e poupanças. É responsável por criar contas e autenticar clientes.

- `IConta`: Interface que define os métodos que todas as contas devem implementar.

- `Conta`: Classe abstrata que implementa a interface `IConta` e define o comportamento comum a todas as contas.

- `ContaCorrente` e `ContaPoupanca`: Classes que estendem `Conta` e representam tipos específicos de contas.

- `Main`: Classe principal que contém o método `main`. Simula um ATM, permitindo que o cliente realize operações bancárias.

## Como Executar

Para executar o projeto, você precisa ter o Java e o Maven instalados em seu sistema. Depois de clonar o repositório, você pode compilar e executar o projeto usando o comando `mvn clean install` seguido de `java -cp target/myproject-1.0-SNAPSHOT.jar me.sairu.Main` no diretório raiz do projeto.

## Contribuições

Sinta-se à vontade para clonar o projeto, fazer suas próprias alterações e melhorias e enviar um pull request. Este é um projeto aberto e todas as contribuições são bem-vindas.
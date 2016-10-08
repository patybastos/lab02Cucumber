#Sample Feature Definition Template
@tag
Feature: Buscar Endereco

@tag1
Scenario Outline: Buscar Endereco atraves do CEP
Given o cep <cep>
When Nós buscamos o endereco
Then retorna o endereco <endereco>

Examples:
    | cep    | endereco              |
    |13083130| Rua Macedo Soares, 174|

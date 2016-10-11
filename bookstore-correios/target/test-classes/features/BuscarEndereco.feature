#Sample Feature Definition Template
@tag
Feature: Buscar Endereco

  @tag1
  Scenario Outline: Buscar Endereco atraves do CEP
    Given o servico de busca de endereco
    When buscamos o cep <cep>
    Then retorna o endereco <endereco>

    Examples: 
      | cep      | endereco               |
      | 13083130 | Rua Macedo Soares, 174 |

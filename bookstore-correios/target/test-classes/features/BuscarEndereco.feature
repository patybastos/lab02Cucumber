Feature: Buscar Endereco

  Scenario: Buscar Endereco atraves do CEP
    Given o servico de busca de endereco
    When buscamos o cep 01001000
    Then retorna o endereco
Feature: Buscar Endereco

  Scenario: Buscar Endereco atraves do CEP
    Given o servico de busca de endereco
    When buscamos o cep 01001000
    Then retorna o endereco {"cep": "01001-000","logradouro": "Praca da Se","complemento": "lado impar","bairro": "Se","localidade": "Sao Paulo","uf": "SP","unidade": "","ibge": "3550308","gia": "1004"}
    
	Scenario: Buscar Endereco com CEP errado
		Given o servico de busca de endereco
		When buscamos o cep alfanumerico ABC12345
		Then retorna a mensagem de erro {"erro":"true"}
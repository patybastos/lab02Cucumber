$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BuscarEndereco.feature");
formatter.feature({
  "line": 1,
  "name": "Buscar Endereco",
  "description": "",
  "id": "buscar-endereco",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2280253,
  "status": "passed"
});
formatter.before({
  "duration": 149173959,
  "status": "passed"
});
formatter.before({
  "duration": 67013,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Buscar Endereco atraves do CEP",
  "description": "",
  "id": "buscar-endereco;buscar-endereco-atraves-do-cep",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "o servico de busca de endereco",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "buscamos o cep 01001000",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "retorna o endereco {\"cep\": \"01001-000\",\"logradouro\": \"Praca da Se\",\"complemento\": \"lado impar\",\"bairro\": \"Se\",\"localidade\": \"Sao Paulo\",\"uf\": \"SP\",\"unidade\": \"\",\"ibge\": \"3550308\",\"gia\": \"1004\"}",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarEnderecoSteps.o_servico_de_busca_de_endereco()"
});
formatter.result({
  "duration": 119562061,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01001000",
      "offset": 15
    }
  ],
  "location": "BuscarEnderecoSteps.buscamos_o_cep(String)"
});
formatter.result({
  "duration": 548041379,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "{\"cep\": \"01001-000\",\"logradouro\": \"Praca da Se\",\"complemento\": \"lado impar\",\"bairro\": \"Se\",\"localidade\": \"Sao Paulo\",\"uf\": \"SP\",\"unidade\": \"\",\"ibge\": \"3550308\",\"gia\": \"1004\"}",
      "offset": 19
    }
  ],
  "location": "BuscarEnderecoSteps.then(String)"
});
formatter.result({
  "duration": 98407,
  "status": "passed"
});
});
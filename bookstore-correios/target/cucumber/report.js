$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BuscarEndereco.feature");
formatter.feature({
  "line": 1,
  "name": "Buscar Endereco",
  "description": "",
  "id": "buscar-endereco",
  "keyword": "Feature"
});
formatter.before({
  "duration": 533677052,
  "status": "passed"
});
formatter.before({
  "duration": 990102,
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
  "name": "retorna o endereco",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarEnderecoSteps.o_servico_de_busca_de_endereco()"
});
formatter.result({
  "duration": 390336846,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01001000",
      "offset": 15
    }
  ],
  "location": "BuscarEnderecoSteps.when(String)"
});

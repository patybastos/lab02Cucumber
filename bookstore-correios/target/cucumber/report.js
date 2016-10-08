$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BuscarEndereco.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 3,
  "name": "Buscar Endereco",
  "description": "",
  "id": "buscar-endereco",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Buscar Endereco atraves do CEP",
  "description": "",
  "id": "buscar-endereco;buscar-endereco-atraves-do-cep",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "o servico de busca de endereco",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "buscamos o cep \u003ccep\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "retorna o endereco \u003cendereco\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "buscar-endereco;buscar-endereco-atraves-do-cep;",
  "rows": [
    {
      "cells": [
        "cep",
        "endereco"
      ],
      "line": 12,
      "id": "buscar-endereco;buscar-endereco-atraves-do-cep;;1"
    },
    {
      "cells": [
        "13083130",
        "Rua Macedo Soares, 174"
      ],
      "line": 13,
      "id": "buscar-endereco;buscar-endereco-atraves-do-cep;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 159383,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Buscar Endereco atraves do CEP",
  "description": "",
  "id": "buscar-endereco;buscar-endereco-atraves-do-cep;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    },
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "o servico de busca de endereco",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "buscamos o cep 13083130",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "retorna o endereco Rua Macedo Soares, 174",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
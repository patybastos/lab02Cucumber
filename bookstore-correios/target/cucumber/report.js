$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CalcularFreteTempo.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 3,
  "name": "Calcular frete e tempo de entrega",
  "description": "",
  "id": "calcular-frete-e-tempo-de-entrega",
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
  "name": "Calcular frete e tempo de entrega",
  "description": "",
  "id": "calcular-frete-e-tempo-de-entrega;calcular-frete-e-tempo-de-entrega",
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
  "name": "os dados do produto como peso \u003cpeso\u003e altura \u003caltura\u003e largura \u003clargura\u003e comprimento \u003ccomprimento\u003e tipo de entrega \u003ctipoEntrega\u003e e cep \u003ccep\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "N�s buscamos o frete e tempo de entrega",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "retorna o \u003cfrete\u003e e \u003ctempo\u003e da entrega",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "calcular-frete-e-tempo-de-entrega;calcular-frete-e-tempo-de-entrega;",
  "rows": [
    {
      "cells": [
        "peso",
        "altura",
        "largura",
        "comprimento",
        "tipoEntrega",
        "cep",
        "frete",
        "tempo"
      ],
      "line": 12,
      "id": "calcular-frete-e-tempo-de-entrega;calcular-frete-e-tempo-de-entrega;;1"
    },
    {
      "cells": [
        "5",
        "1",
        "2",
        "5",
        "PAC",
        "13236080",
        "10",
        "3"
      ],
      "line": 13,
      "id": "calcular-frete-e-tempo-de-entrega;calcular-frete-e-tempo-de-entrega;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 30426921,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Calcular frete e tempo de entrega",
  "description": "",
  "id": "calcular-frete-e-tempo-de-entrega;calcular-frete-e-tempo-de-entrega;;2",
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
  "name": "os dados do produto como peso 5 altura 1 largura 2 comprimento 5 tipo de entrega PAC e cep 13236080",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "N�s buscamos o frete e tempo de entrega",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "retorna o 10 e 3 da entrega",
  "matchedColumns": [
    6,
    7
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
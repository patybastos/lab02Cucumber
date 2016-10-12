$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CalcularFreteTempo.feature");
formatter.feature({
  "line": 1,
  "name": "Calcular frete e tempo de entrega",
  "description": "",
  "id": "calcular-frete-e-tempo-de-entrega",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6486979,
  "status": "passed"
});
formatter.before({
  "duration": 179114885,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Calcular frete e tempo de entrega",
  "description": "",
  "id": "calcular-frete-e-tempo-de-entrega;calcular-frete-e-tempo-de-entrega",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "o servico de busca de frete e tempo de entrega",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "os dados do produto como peso 1 comprimento 20 altura 5 largura 12 tipo entrega 41106",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "o resultado foi salvo na base",
  "keyword": "Then "
});
formatter.match({
  "location": "CalcularFreteTempoSteps.given()"
});
formatter.result({
  "duration": 134038681,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 30
    },
    {
      "val": "20",
      "offset": 44
    },
    {
      "val": "5",
      "offset": 54
    },
    {
      "val": "12",
      "offset": 64
    },
    {
      "val": "41106",
      "offset": 80
    }
  ],
  "location": "CalcularFreteTempoSteps.when(Integer,Integer,Integer,Integer,Integer)"
});

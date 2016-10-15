$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CalcularFreteTempo.feature");
formatter.feature({
  "line": 1,
  "name": "Calcular frete e tempo de entrega",
  "description": "",
  "id": "calcular-frete-e-tempo-de-entrega",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2839299,
  "status": "passed"
});
formatter.before({
  "duration": 147345289,
  "status": "passed"
});
formatter.before({
  "duration": 92369,
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
  "name": "os dados do produto como peso 1 comprimento 20 altura 5 largura 12 tipo entrega 41106 cepDestino 13236080",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "retorna o valor de 13 e prazo de 2 dias",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "o resultado foi salvo no banco",
  "keyword": "And "
});
formatter.match({
  "location": "CalcularFreteTempoSteps.given()"
});
formatter.result({
  "duration": 114452772,
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
    },
    {
      "val": "13236080",
      "offset": 97
    }
  ],
  "location": "CalcularFreteTempoSteps.when(Integer,Integer,Integer,Integer,Integer,Integer)"
});
formatter.result({
  "duration": 690367334,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "13",
      "offset": 19
    },
    {
      "val": "2",
      "offset": 33
    }
  ],
  "location": "CalcularFreteTempoSteps.retorna_o_valor_e_prazo(Double,Integer)"
});
formatter.result({
  "duration": 186550,
  "status": "passed"
});
formatter.match({
  "location": "CalcularFreteTempoSteps.o_resultado_foi_salvo_no_banco()"
});
formatter.result({
  "duration": 7553151,
  "status": "passed"
});
formatter.before({
  "duration": 45883,
  "status": "passed"
});
formatter.before({
  "duration": 205869,
  "status": "passed"
});
formatter.before({
  "duration": 34412,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Calcular frete e tempo de entrega com peso excedido",
  "description": "",
  "id": "calcular-frete-e-tempo-de-entrega;calcular-frete-e-tempo-de-entrega-com-peso-excedido",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "o servico de busca de frete e tempo de entrega",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "os dados do produto como peso excedido 50 comprimento 20 altura 5 largura 12 tipo entrega 41106 cepDestino 13236080",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "retorna erro \u003c?xml version\u003d\"1.0\" encoding\u003d\"utf-8\"?\u003e\u003ccResultado xmlns\u003d\"http://tempuri.org/\"\u003e\u003cServicos\u003e\u003ccServico\u003e\u003cCodigo\u003e\u003c/Codigo\u003e\u003cValor\u003e\u003c/Valor\u003e\u003cPrazoEntrega\u003e\u003c/PrazoEntrega\u003e\u003cValorMaoPropria\u003e\u003c/ValorMaoPropria\u003e\u003cValorAvisoRecebimento\u003e\u003c/ValorAvisoRecebimento\u003e\u003cValorValorDeclarado\u003e\u003c/ValorValorDeclarado\u003e\u003cEntregaDomiciliar\u003e\u003c/EntregaDomiciliar\u003e\u003cEntregaSabado\u003e\u003c/EntregaSabado\u003e\u003cErro\u003e-4\u003c/Erro\u003e\u003cMsgErro\u003ePeso excedido\u003c/MsgErro\u003e\u003cValorSemAdicionais\u003e\u003c/ValorSemAdicionais\u003e\u003cobsFim\u003e\u003c/obsFim\u003e\u003c/cServico\u003e\u003c/Servicos\u003e\u003c/cResultado\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "o resultado nao e salvo no banco",
  "keyword": "And "
});
formatter.match({
  "location": "CalcularFreteTempoSteps.given()"
});
formatter.result({
  "duration": 30789,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 39
    },
    {
      "val": "20",
      "offset": 54
    },
    {
      "val": "5",
      "offset": 64
    },
    {
      "val": "12",
      "offset": 74
    },
    {
      "val": "41106",
      "offset": 90
    },
    {
      "val": "13236080",
      "offset": 107
    }
  ],
  "location": "CalcularFreteTempoSteps.when_com_peso_excedido(Integer,Integer,Integer,Integer,Integer,Integer)"
});
formatter.result({
  "duration": 32951681,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003c?xml version\u003d\"1.0\" encoding\u003d\"utf-8\"?\u003e\u003ccResultado xmlns\u003d\"http://tempuri.org/\"\u003e\u003cServicos\u003e\u003ccServico\u003e\u003cCodigo\u003e\u003c/Codigo\u003e\u003cValor\u003e\u003c/Valor\u003e\u003cPrazoEntrega\u003e\u003c/PrazoEntrega\u003e\u003cValorMaoPropria\u003e\u003c/ValorMaoPropria\u003e\u003cValorAvisoRecebimento\u003e\u003c/ValorAvisoRecebimento\u003e\u003cValorValorDeclarado\u003e\u003c/ValorValorDeclarado\u003e\u003cEntregaDomiciliar\u003e\u003c/EntregaDomiciliar\u003e\u003cEntregaSabado\u003e\u003c/EntregaSabado\u003e\u003cErro\u003e-4\u003c/Erro\u003e\u003cMsgErro\u003ePeso excedido\u003c/MsgErro\u003e\u003cValorSemAdicionais\u003e\u003c/ValorSemAdicionais\u003e\u003cobsFim\u003e\u003c/obsFim\u003e\u003c/cServico\u003e\u003c/Servicos\u003e\u003c/cResultado\u003e",
      "offset": 13
    }
  ],
  "location": "CalcularFreteTempoSteps.retorna_erro(String)"
});
formatter.result({
  "duration": 1229175,
  "status": "passed"
});
formatter.match({
  "location": "CalcularFreteTempoSteps.o_resultado_nao_salvo_no_banco()"
});
formatter.result({
  "duration": 150327,
  "status": "passed"
});
});
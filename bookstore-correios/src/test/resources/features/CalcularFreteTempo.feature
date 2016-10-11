#Sample Feature Definition Template
@tag
Feature: Calcular frete e tempo de entrega

@tag1
Scenario Outline: Calcular frete e tempo de entrega
Given o servico de busca de frete e tempo de entrega 
When os dados do produto como peso <peso> altura <altura> largura <largura> comprimento <comprimento> tipo de entrega <tipoEntrega> e cep <cep> retorna o <frete> e <tempo> da entrega
Then o resultado foi salvo na base

Examples:
    | peso  | altura | largura | comprimento | tipoEntrega |      cep | frete | tempo |
    |     5 |      1 |       2 |           5 |         PAC | 13236080 |    10 |     3 |

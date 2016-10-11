#Sample Feature Definition Template
@tag
Feature: Calcular frete e tempo de entrega

@tag1
Scenario Outline: Calcular frete e tempo de entrega
Given os dados do produto como peso <peso> altura <altura> largura <largura> comprimento <comprimento> tipo de entrega <tipoEntrega> e cep <cep>
When Nós buscamos o frete e tempo de entrega
Then retorna o <frete> e <tempo> da entrega
And o resultado foi salvo na base

Examples:
    | peso  | altura | largura | comprimento | tipoEntrega |      cep | frete | tempo |
    |     5 |      1 |       2 |           5 |         PAC | 13236080 |    10 |     3 |

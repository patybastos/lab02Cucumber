@tag
Feature: Buscar status da entrega

Scenario: Buscar status da entrega
Given o servico de consulta de status de entrega
When o usuario consulta o status
Then retorna o status


Feature: Calcular frete e tempo de entrega

Scenario: Calcular frete e tempo de entrega
Given o servico de busca de frete e tempo de entrega
When os dados do produto como peso 1 comprimento 20 altura 5 largura 12 tipo entrega 41106
Then retorna o valor de 13 e prazo de 2 dias
And o resultado foi salvo no banco

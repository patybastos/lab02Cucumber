@tag
Feature: Buscar status da entrega

Scenario: Buscar status da entrega
Given o servico de consulta de status de entrega
When o usuario consulta o status com o codigo de rastreio SQ458226057BR
Then retorna o status <?xml version="1.0" encoding="iso-8859-1" ?><sroxml><versao>1.0</versao><qtd>2</qtd><TipoPesquisa>Lista de Objetos</TipoPesquisa><TipoResultado>Todos os eventos</TipoResultado><objeto><numero>SQ458226057BR</numero><evento><tipo>BDE</tipo><status>01</status><data>05/07/2004</data><hora>11:56</hora><descricao>Entregue</descricao><local>CDD ALVORADA</local><codigo>94800971</codigo><cidade>ALVORADA</cidade><uf>RS</uf></evento><evento><tipo>OEC</tipo><status>01</status><data>05/07/2004</data><hora>09:04</hora><descricao>Saiu para entrega</descricao><local>CDD ALVORADA</local><codigo>94800971</codigo><cidade>ALVORADA</cidade><uf>RS</uf></evento></objeto></sroxml>


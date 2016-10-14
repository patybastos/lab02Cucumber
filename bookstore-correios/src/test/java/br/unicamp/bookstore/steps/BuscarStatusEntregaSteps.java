package br.unicamp.bookstore.steps;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import com.github.tomakehurst.wiremock.client.WireMock;

import br.unicamp.exemplo.Operacoes;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class BuscarStatusEntregaSteps {
	
	private Operacoes operacoes = null;
	
	@Before
	public void setUp(){
		operacoes = new Operacoes();
	}
	
	@Given("^o servico de consulta de status de entrega$")
	public void given() throws Throwable {
		assertNotNull(operacoes);
	}

	@When("^o usuario consulta o status com o codigo de rastreio (.*)$")
	public void o_usuario_consulta_o_status(String codigoRastreio) throws Throwable {
		stubFor(get(urlMatching("/websro.correios.com.br/sro_bin/sroii_xml.eventos.*"))
				.withQueryParam("usuario", WireMock.equalTo("ECT"))
				.withQueryParam("senha", WireMock.equalTo("SRO"))
				.withQueryParam("tipo", WireMock.equalTo("L"))
				.withQueryParam("resultado", WireMock.equalTo("T"))
				.withQueryParam("objetos", WireMock.equalTo(codigoRastreio))
				.willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/xml")
                .withBody("<?xml version=\"1.0\" encoding=\"iso-8859-1\" ?><sroxml><versao>1.0</versao><qtd>2</qtd><TipoPesquisa>Lista de Objetos</TipoPesquisa><TipoResultado>Todos os eventos</TipoResultado><objeto><numero>SQ458226057BR</numero><evento><tipo>BDE</tipo><status>01</status><data>05/07/2004</data><hora>11:56</hora><descricao>Entregue</descricao><local>CDD ALVORADA</local><codigo>94800971</codigo><cidade>ALVORADA</cidade><uf>RS</uf></evento><evento><tipo>OEC</tipo><status>01</status><data>05/07/2004</data><hora>09:04</hora><descricao>Saiu para entrega</descricao><local>CDD ALVORADA</local><codigo>94800971</codigo><cidade>ALVORADA</cidade><uf>RS</uf></evento></objeto></sroxml>")));
		
		operacoes.consultarStatusEntrega(codigoRastreio);
		
		//while(1==1);
	}

	@Then("^retorna o status (.*)$")
	public void retorna_o_status(String status) throws Throwable {
		assertEquals(status, operacoes.getResultadoStatusEntrega());
	}

}

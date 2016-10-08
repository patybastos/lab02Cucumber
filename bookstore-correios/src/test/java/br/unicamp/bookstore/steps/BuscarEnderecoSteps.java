package br.unicamp.bookstore.steps;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.matching;
import static com.github.tomakehurst.wiremock.client.WireMock.notMatching;
import static com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.apache.http.client.HttpClient;
import org.junit.Rule;
import org.junit.Test;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

import br.unicamp.exemplo.Calculadora;
import br.unicamp.exemplo.Operacoes;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class BuscarEnderecoSteps {

	@Rule
	public WireMockRule wireMockRule = new WireMockRule(8089);

	private HttpClient httpClient = null;
	
	private Operacoes operacoes = null;
	private Throwable throwable;
	
    @Before
    public void setUp() {
    	operacoes = new Operacoes();
    	throwable = null;
    	
    }
    
	@Test
	public void buscarEndereco(String cep) {
	    stubFor(get(urlEqualTo("viacep.com.br/ws" + cep + "/json/"))
	            .withHeader("Accept", equalTo("text/json"))
	            .willReturn(aResponse()
	                .withStatus(200)
	                .withHeader("Content-Type", "text/json")
	                .withBody("<response>Some content</response>")));

	    //Result result = myHttpServiceCallingObject.doSomething();

	    //assertTrue(result.wasSuccessFul());

	    verify(postRequestedFor(urlMatching("/my/resource/[a-z0-9]+"))
	            .withRequestBody(matching(".*<message>1234</message>.*"))
	            .withHeader("Content-Type", notMatching("application/json")));
	}

	
	@Given("^o servico de busca de endereco$")
	public void given() throws Throwable {
		assertNotNull(operacoes);
	}

	@When("^buscamos o cep (\\d+)$")
	public void when(String cep) throws Throwable {
		operacoes.buscarEndereco(cep);
	}

	/*
  @Then(^you are in Then annotation$)
  public void then() throws Throwable {
  }
	*/
}

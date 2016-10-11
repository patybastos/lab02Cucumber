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
import static org.mockito.Mockito.mock;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Rule;
import org.junit.Test;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

import br.unicamp.bookstore.dao.DadosDeEntregaDAO;
import br.unicamp.exemplo.Calculadora;
import br.unicamp.exemplo.Operacoes;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import gherkin.formatter.model.Result;
import cucumber.api.java.en.Then;

public class BuscarEnderecoSteps {

	private HttpClient httpClient = null;
	
	private Operacoes operacoes = null;
	private Throwable throwable;
	private DadosDeEntregaDAO mock;
	
	@Before
	public void setUp(){
		mock = mock(DadosDeEntregaDAO.class);
		operacoes = new Operacoes(mock);
		throwable = null;
	}	
    
	@Given("^o servico de busca de endereco$")
	public void o_servico_de_busca_de_endereco() throws Throwable {
		assertNotNull(operacoes);
	}

	@When("^buscamos o cep (\\d+)$")
	public void when(String cep) throws Throwable {

	    stubFor(get(urlEqualTo("/viacep/ws/01001000/json/"))
	            .willReturn(aResponse()
	                .withStatus(200)
	                .withHeader("Content-Type", "application/json")
	                .withBody("{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"complemento\": \"lado ímpar\",\"bairro\": \"Sé\",\"localidade\": \"São Paulo\",\"uf\": \"SP\",\"unidade\": \"\",\"ibge\": \"3550308\",\"gia\": \"1004\"}")));
	    
	    //HttpClient client = HttpClientBuilder.create().build();
        //HttpGet request = new HttpGet("http://localhost:8089/viacep/ws/01001000/json/");
        //HttpResponse response = client.execute(request);
        
	    //Result result = (Result) client.execute(request);

	    //assertTrue(result.wasSuccessFul());

	    //while(1==1);
	}

	
	@Then("^retorna o endereco$")
	public void then() throws Throwable {
	    verify(postRequestedFor(urlMatching("viacep/ws/01001000/json/"))
	            .withRequestBody(matching("{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"complemento\": \"lado ímpar\",\"bairro\": \"Sé\",\"localidade\": \"São Paulo\",\"uf\": \"SP\",\"unidade\": \"\",\"ibge\": \"3550308\",\"gia\": \"1004\"}"))
	            .withHeader("Content-Type", notMatching("application/json")));
		
	}

}

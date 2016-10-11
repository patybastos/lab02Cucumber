package br.unicamp.bookstore.steps;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.mockito.Mockito.atLeastOnce;

import javax.swing.plaf.SliderUI;

import static org.junit.Assert.assertNotNull;

//import com.github.tomakehurst.wiremock.client.WireMock;

import br.unicamp.exemplo.Operacoes;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class BuscarEnderecoSteps {

	private Operacoes operacoes = null;
	private Throwable throwable;
	
	@Before
	public void setUp(){
		operacoes = new Operacoes();
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
	    
	    while(1==1);
	}

	
	@Then("^retorna o endereco$")
	public void then() throws Throwable {
	    /*verify(1,postRequestedFor(urlMatching("/viacep/ws/01001000/json/"))
	            .withRequestBody(matching("{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"complemento\": \"lado ímpar\",\"bairro\": \"Sé\",\"localidade\": \"São Paulo\",\"uf\": \"SP\",\"unidade\": \"\",\"ibge\": \"3550308\",\"gia\": \"1004\"}"))
	            .withHeader("Content-Type", notMatching("application/json"))
	            );*/
		verify(1,getRequestedFor(urlEqualTo("/viacep/ws/01001000/json/"))
	            //.withRequestBody(matching("{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"complemento\": \"lado ímpar\",\"bairro\": \"Sé\",\"localidade\": \"São Paulo\",\"uf\": \"SP\",\"unidade\": \"\",\"ibge\": \"3550308\",\"gia\": \"1004\"}"))
	            //.withHeader("Content-Type", notMatching("application/json"))
	            );
	}

}

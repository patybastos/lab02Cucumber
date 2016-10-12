package br.unicamp.bookstore.steps;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.mockito.Mockito.atLeastOnce;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
	public void buscamos_o_cep(String cep) throws Throwable {

	    stubFor(get(urlEqualTo("/viacep/ws/" + cep + "/json/"))
	            .willReturn(aResponse()
	                .withStatus(200)
	                .withHeader("Content-Type", "application/json")
	                .withBody("{\"cep\": \"01001-000\",\"logradouro\": \"Praca da Se\",\"complemento\": \"lado impar\",\"bairro\": \"Se\",\"localidade\": \"Sao Paulo\",\"uf\": \"SP\",\"unidade\": \"\",\"ibge\": \"3550308\",\"gia\": \"1004\"}")));
	    
	    operacoes.buscarEndereco(cep);
	    //while(1==1);
	}

/*	@When("^buscamos o cep alfanumero (\\d+)$")
	public void buscamos_o_cep_alfanumero(String cep) throws Throwable {

	    stubFor(get(urlEqualTo("/viacep/ws/" + cep + "/json/"))
	            .willReturn(aResponse()
	                .withStatus(400)
	                .withHeader("Content-Type", "application/json")
	                .withBody("{\"erro\":\"true\"")));
	    
	    operacoes.buscarEndereco(cep);
	    //while(1==1);
	}*/
	
	@Then("^retorna o endereco (.*)$")
	public void then(String endereco) throws Throwable {
		/*verify(1,postRequestedFor(urlMatching("/viacep/ws/01001000/json/"))
	            .withRequestBody(matching("{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"complemento\": \"lado ímpar\",\"bairro\": \"Sé\",\"localidade\": \"São Paulo\",\"uf\": \"SP\",\"unidade\": \"\",\"ibge\": \"3550308\",\"gia\": \"1004\"}"))
	            .withHeader("Content-Type", notMatching("application/json"))
	            );*/
		//verify(1,getRequestedFor(urlEqualTo("/viacep/ws/01001000/json/"))
	            //.withRequestBody(matching("{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"complemento\": \"lado ímpar\",\"bairro\": \"Sé\",\"localidade\": \"São Paulo\",\"uf\": \"SP\",\"unidade\": \"\",\"ibge\": \"3550308\",\"gia\": \"1004\"}"))
	            //.withHeader("Content-Type", notMatching("application/json"))
	      //      );
		assertEquals(endereco, operacoes.getResultadoEndereco());
		
	}

}

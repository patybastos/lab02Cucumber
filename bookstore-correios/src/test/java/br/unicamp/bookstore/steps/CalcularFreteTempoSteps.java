package br.unicamp.bookstore.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

import org.mockito.Mockito;

import com.github.tomakehurst.wiremock.client.WireMock;

import br.unicamp.bookstore.dao.DadosDeEntregaDAO;
import br.unicamp.exemplo.Operacoes;

public class CalcularFreteTempoSteps {
  
	private Operacoes operacoes = null;
	private DadosDeEntregaDAO mock;
	
	@Before
	public void setUp(){
		mock = mock(DadosDeEntregaDAO.class);
		operacoes = new Operacoes(mock);
	}
	
	@Given("^o servico de busca de frete e tempo de entrega$")
	public void given() throws Throwable {
		assertNotNull(operacoes);
	}

  @When("^os dados do produto como peso (\\d+) altura (\\d+) largura (\\d+) comprimento (\\d+) tipo de entrega (\\d+) e cep (\\d+) retorna o (\\d+) e (\\d+) da entrega$")
  public void when() throws Throwable {
		//urlMatching
	    stubFor(get(urlEqualTo("http://ws.correios.com.br/calculador/CalcPrecoPrazo.asmx"))
	            .willReturn(aResponse()
	                .withStatus(200)
	                .withHeader("Content-Type", "application/xml")
	                .withBody("")));
	    WireMock.verify(1, getRequestedFor(urlEqualTo("http://ws.correios.com.br/calculador/CalcPrecoPrazo.asmx")));
	    
	    while(1==1);
  }

  @Then("^o resultado foi salvo na base$")
  public void then() throws Throwable {
	  Mockito.verify(mock, times(1)).saveDadosDeEntrega(10.0, 5);
  }

}

package br.unicamp.bookstore.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import org.junit.Rule;
import org.junit.Test;
import static org.mockito.Mockito.mock;

import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.matchers.Any;

import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.junit.WireMockRule;

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
	
	@Given("^os dados do produto como peso (\\d+) altura (\\d+) largura (\\d+) comprimento (\\d+) tipo de entrega (\\d+) e cep (\\d+)$")
	public void given() throws Throwable {
	}

  @When("^Nós buscamos o frete e tempo de entrega$")
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

  /*
  @Then(^you are in Then annotation$)
  public void then() throws Throwable {
	  Mockito.verify(mock, times(1)).saveDadosDeEntrega(10.0, 5);
  }
  */

}

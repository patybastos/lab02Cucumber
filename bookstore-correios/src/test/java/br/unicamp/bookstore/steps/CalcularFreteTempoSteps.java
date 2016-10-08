package br.unicamp.bookstore.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import org.apache.http.client.HttpClient;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

import br.unicamp.bookstore.dao.DadosDeEntregaDAO;

public class CalcularFreteTempoSteps {
  
	@Mock
	private DadosDeEntregaDAO dao;
	
	private HttpClient httpClient = null;
	
	@Rule
	public WireMockRule wireMockRule = new WireMockRule(8089);
	
	@Test
	public void buscarEndereco(String cep) {
	    stubFor(get(urlEqualTo("viacep.com.br/ws" + cep))
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
	
	@Given("^os dados do produto como peso (\\d+) altura (\\d+) largura (\\d+) comprimento (\\d+) tipo de entrega (\\d+) e cep (\\d+)$")
	public void given() throws Throwable {
		MockitoAnnotations.initMocks(this);
		
		dao.saveDadosDeEntrega(10.0, 5);
	}

  /*
  @When(^you are in When annotation$)
  public void when() throws Throwable {
  }

  @Then(^you are in Then annotation$)
  public void then() throws Throwable {
  }
*/
}

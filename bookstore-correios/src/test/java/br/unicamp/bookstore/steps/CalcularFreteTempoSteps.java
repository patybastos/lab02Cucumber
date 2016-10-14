package br.unicamp.bookstore.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Matchers.anyInt;

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

  @When("^os dados do produto como peso (\\d+) comprimento (\\d+) altura (\\d+) largura (\\d+) tipo entrega (\\d+)$")
  public void when(Integer peso, Integer comprimento, Integer altura, Integer largura, Integer tipoEntrega) throws Throwable {
	  	stubFor(get(urlMatching("/calculador/CalcPrecoPrazo.asmx/CalcPrecoPrazo.*"))
	    		.withQueryParam("nVlPeso", WireMock.equalTo(peso.toString()))
	    		.withQueryParam("nVlComprimento", WireMock.equalTo(comprimento.toString()))
	    		.withQueryParam("nVlAltura", WireMock.equalTo(altura.toString()))
	    		.withQueryParam("nVlLargura", WireMock.equalTo(largura.toString()))	    		
	    		.withQueryParam("nCdServico", WireMock.equalTo("41106"))
	    		
	            .willReturn(aResponse()
	                .withStatus(200)
	                .withHeader("Content-Type", "application/xml")
	                .withBody("<?xml version=\"1.0\" encoding=\"utf-8\"?><cResultado xmlns=\"http://tempuri.org/\"><Servicos><cServico><Codigo>41106</Codigo><Valor>13,00</Valor><PrazoEntrega>2</PrazoEntrega><ValorMaoPropria>1</ValorMaoPropria><ValorAvisoRecebimento>1</ValorAvisoRecebimento><ValorValorDeclarado>13,00</ValorValorDeclarado><EntregaDomiciliar>true</EntregaDomiciliar><EntregaSabado>true</EntregaSabado><Erro>0</Erro><MsgErro></MsgErro><ValorSemAdicionais>13,00</ValorSemAdicionais><obsFim>teste</obsFim></cServico></Servicos></cResultado>")));
	    
	  	operacoes.calcularFreteTempo(peso, altura, largura, comprimento, tipoEntrega, 123);
	    
	    //while(1==1);
  }
  
  @Then("^retorna o valor de (\\d+) e prazo de (\\d+) dias$")
  public void retorna_o_valor_e_prazo(){
	  //assertEquals();
  }

  @And("^o resultado foi salvo no banco$")
  public void o_resultado_foi_salvo_no_banco() throws Throwable {
	  Mockito.verify(mock, times(1)).saveDadosDeEntrega(anyDouble(), anyInt());
  }

}

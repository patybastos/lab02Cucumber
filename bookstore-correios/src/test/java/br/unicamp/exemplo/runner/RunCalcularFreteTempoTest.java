package br.unicamp.exemplo.runner;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.github.tomakehurst.wiremock.WireMockServer;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:target/cucumber" },
        glue = "br.unicamp.exemplo.steps",
        features = "classpath:features/CalcularFreteTempo.feature"
)

public class RunCalcularFreteTempoTest {
	private static WireMockServer wireMockServer;

	@BeforeClass
	public static void runBeforeClass(){
		wireMockServer = new WireMockServer(8089);
		wireMockServer.start();
	}
	
	@AfterClass
	public static void runAfterClass(){
		wireMockServer.stop();
	}
}

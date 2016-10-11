package br.unicamp.exemplo.runner;

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
        features = "classpath:features/BuscarEndereco.feature"
)

public class RunBuscarEndereco {
	
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

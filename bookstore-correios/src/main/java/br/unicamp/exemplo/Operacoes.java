package br.unicamp.exemplo;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

import br.unicamp.bookstore.dao.DadosDeEntregaDAO;

public class Operacoes {
	
	public DadosDeEntregaDAO dao;
	
	private String resultadoEndereco = "";
	
	public Operacoes(){
		
	}
	
	public Operacoes(DadosDeEntregaDAO dao){
		this.dao = dao;
	}
	
	public void calcularFreteTempo(int peso, int altura, int largura, int comprimento, int tipoEntrega, int cep)throws Throwable
	{
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet("http://localhost:8089/calculador/CalcPrecoPrazo.asmx/CalcPrecoPrazo?nVlPeso=1");

		request.addHeader("Content-Type", "application/xml");

		HttpResponse response = client.execute(request);

		String responseAsString = EntityUtils.toString(response.getEntity());
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		Document document = builder.parse(new InputSource(new StringReader(responseAsString)));
		
		Element rootElement = document.getDocumentElement();
		
		String a = rootElement.getAttribute("Valor");
		
		//String preco = response.getFirstHeader("Valor").getValue();
		//String prazo = response.getFirstHeader("PrazoEntrega").getValue();
		
		//dao.saveDadosDeEntrega(10.0, 5);
	}
	
	public void consultarStatusEntrega(String codigoRasteio)
	{
		
	}
	
	public void buscarEndereco(String cep) throws Throwable
	{
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet("http://localhost:8089/viacep/ws/" + cep + "/json/");
		
		request.addHeader("Content-Type", "application/json");

		HttpResponse response = client.execute(request);
		
		resultadoEndereco = EntityUtils.toString(response.getEntity());
	}

	public String getResultadoEndereco() {
		return resultadoEndereco;
	}

}

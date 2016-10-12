package br.unicamp.exemplo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

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
		
		/*BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
	
		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		
		resultadoEndereco = result.toString();*/
		
		resultadoEndereco = EntityUtils.toString(response.getEntity());
	}

	public String getResultadoEndereco() {
		return resultadoEndereco;
	}

}

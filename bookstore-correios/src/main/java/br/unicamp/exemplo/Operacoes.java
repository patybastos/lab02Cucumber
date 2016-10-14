package br.unicamp.exemplo;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import br.unicamp.bookstore.dao.DadosDeEntregaDAO;

public class Operacoes {
	
	public DadosDeEntregaDAO dao;
	
	private String resultadoEndereco = "";
	private String resultadoStatusEntrega = "";
	private static List<String> listaTags;
	private Double preco = 0.0;
	private Integer prazo = 0;
	
	public Operacoes(){
		
	}
	
	public Operacoes(DadosDeEntregaDAO dao){
		this.dao = dao;
	}
	
	public void calcularFreteTempo(int peso, int altura, int largura, int comprimento, int tipoEntrega, int cep)throws Throwable
	{
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet("http://localhost:8089/calculador/CalcPrecoPrazo.asmx/CalcPrecoPrazo?nVlPeso=1&nVlComprimento=20&nVlAltura=5&nVlLargura=12&nCdServico=41106");

		request.addHeader("Content-Type", "application/xml");

		HttpResponse response = client.execute(request);

		String responseAsString = EntityUtils.toString(response.getEntity());
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document;
		
		document =  builder.parse(new InputSource(new StringReader(responseAsString)));
		
		org.w3c.dom.Element rootElement = document.getDocumentElement();
		
		this.listaTags = new ArrayList<String>();
		
		iteraTags(rootElement);
		
		preco = Double.parseDouble(listaTags.get(3));
		prazo = Integer.parseInt(listaTags.get(4));
		
		dao.saveDadosDeEntrega(preco, prazo);
	}
	
	public void consultarStatusEntrega(String codigoRastreio) throws Throwable
	{
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet("http://localhost:8089/websro.correios.com.br/sro_bin/sroii_xml.eventos?usuario=ECT&senha=SRO&tipo=L&resultado=T&objetos=SQ458226057BR");
		
		request.addHeader("Content-Type", "application/xml");

		HttpResponse response = client.execute(request);
		
		resultadoStatusEntrega = EntityUtils.toString(response.getEntity());
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
	
	public String getResultadoStatusEntrega(){
		return resultadoStatusEntrega;
	}
	
	public Double getPreco(){
		return preco;
	}
	
	public Integer getPrazo(){
		return prazo;
	}
	
	public static void iteraTags(Node currentNode2) {
	    //System.out.println(currentNode2.getNodeName());

	    NodeList nodeList = currentNode2.getChildNodes();
	    
	    for (int i = 0; i < nodeList.getLength(); i++) {
	    	Node currentNode = nodeList.item(i);
	    	
	        if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
	        	
	        	listaTags.add(currentNode.getTextContent());
	        	//System.out.println(currentNode.getTextContent());	
	        	
	        	iteraTags(currentNode);
	        }
	    }
	}

}

package br.unicamp.exemplo;

import br.unicamp.bookstore.dao.DadosDeEntregaDAO;

public class Operacoes {
	
	public DadosDeEntregaDAO dao;
	
	public Operacoes(DadosDeEntregaDAO dao){
		this.dao = dao;
	}
	
	public void calcularFreteTempo(int peso, int altura, int largura, int comprimento, int tipoEntrega, int cep)
	{
		dao.saveDadosDeEntrega(10.0, 5);
	}
	
	public void consultarStatusEntrega(String codigoRasteio)
	{
		
	}
	
	public String buscarEndereco(String cep)
	{
		return "";
	}
}

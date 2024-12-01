package br.com.Alura.SoundsON.Classes;

public class Audio {
	
	private String titulo;
	private double duracao,classificacao,visualizacaoCompleta;
	private int curtidas,totalDeReproducoes;
	
	
	//Getters e Setters--------------------------------------------------
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public double getDuracao() {
		return duracao;
	}
	
	public void setDuracao(double duracao) {
		this.duracao=duracao;
	}
	
	public double getClassificacao() {
		return classificacao;
	}
	
	public void setClassificacao(double classificacao) {
		if(classificacao<0) {
			throw new IllegalArgumentException("A duração não pode ser negativa.");
		}
		this.classificacao+=classificacao;
	}
	
	
	public int getCurtidas() {
		return curtidas;
	}
	
	public void setCurtidas(int curtidas) {
		if(curtidas<0) {
			throw new IllegalArgumentException("O número de curtidas não pode ser negativo.");
		}
		this.curtidas+=curtidas;
	}
	
	public int getTotalDeReproducoes() {
		return totalDeReproducoes;
	}
	
	public void setTotalDeReproducoes(int totalDeReproducoes) {
		this.totalDeReproducoes=totalDeReproducoes;
	}
	
	public void setVisualizacaoCompleta(double visualizacaoCompleta) {
		this.visualizacaoCompleta=visualizacaoCompleta;
	}
	public double porcentagemAssitiuTudo() {
		return visualizacaoCompleta/this.getTotalDeReproducoes();
	}
	
	//METODOS-------------------------------------------------------------
	public double totalEmMinutos() {
		double minutosEscutados=0;
		minutosEscutados = totalDeReproducoes * duracao;
		return minutosEscutados;
	}
	
}

package br.com.jogo.entidade;

public class Jogo {

	private Character jogador;
	
	private int linha;
	
	private int coluna;
	
	public Jogo() {

	}

	public Jogo(Character jogador, int linha, int coluna) {
		this.jogador = jogador;
		this.linha = linha;
		this.coluna = coluna;
	}

	public Character getJogador() {
		return jogador;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	@Override
	public String toString() {
		return jogador + linha + coluna +"";
	}

	
	
}
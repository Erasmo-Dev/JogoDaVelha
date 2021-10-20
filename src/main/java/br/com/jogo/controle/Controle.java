package br.com.jogo.controle;

import br.com.jogo.entidade.Jogo;

public class Controle {
	public static Character tabuleiro[][] = new Character[3][3];

	public static  int numeroJogada = 0;
	
	public static  int vez = 2;
	
	
	public Character[][] getTabuleiro() {
		return tabuleiro;
	}
	
	public static Character jogador() {
		if(vez % 2 == 0) {
			return 'X';
		}
		
		return 'O';
	}
	
	// Deu velha
	public static boolean velha() {

		if(numeroJogada == 8) {
			return true;
		}
		System.out.println(numeroJogada);
		return false;
		
	}
	
	public static boolean vencedor(Jogo jogo) {
		vez++;
		numeroJogada ++;
		
		// Adicionar
		tabuleiro[jogo.getLinha()][jogo.getColuna()] = jogo.getJogador();

		// Checar vencedor por linha
		for (int linha = 0; linha < tabuleiro.length; linha++) {
			int contagem = 0;
			for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
				if (jogo.getJogador() == tabuleiro[linha][coluna]) {
					contagem++;
				}
				if (contagem == 3) {
					return true;
				}
			}
		}

		// Checar vencedor por coluna
		for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
			int contagem = 0;
			for (int linha = 0; linha < tabuleiro.length; linha++) {
				if (jogo.getJogador() == tabuleiro[linha][coluna]) {
					contagem++;
				}
				if (contagem == 3) {
					return true;
				}
			}
		}

		// Checar vencedor diagonal da esquerda para direita
		int coluna = 0;
		int contagem = 0;
		for (int linha = 0; linha < tabuleiro.length; linha++) {
			if (jogo.getJogador() == tabuleiro[linha][coluna]) {
				contagem++;
			}
			if (contagem == 3) {
				return true;
			}
			coluna++;
		}

		// Checar vencedor diagonal da direita para esquerda
		coluna = 2;
		contagem = 0;
		for (int linha = 0; linha < tabuleiro.length; linha++) {
			if (jogo.getJogador() == tabuleiro[linha][coluna]) {
				contagem++;
			}
			if (contagem == 3) {
				return true;
			}
			coluna--;
		}
		return false;
	}
}

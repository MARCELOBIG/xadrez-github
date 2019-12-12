package xadrex;

import pecasXadrez.Rei;
import pecasXadrez.Torre;
import tabuleiroJogo.Posicao;
import tabuleiroJogo.Tabuleiro;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		inicioJogo();
	}
	
	public PecaXadrez[][] obterPecas(){
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int  i=0; i <tabuleiro.getLinhas(); i++) {
			for (int j=0; j <tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez)tabuleiro.peca(i,j);
			}
			
		}
		return mat;
	}
	private void inicioJogo() {
		tabuleiro.lugarPeca(new Torre(tabuleiro,Cores.BRANCO), new Posicao(2, 1));
		tabuleiro.lugarPeca(new Rei(tabuleiro,Cores.PRETO), new Posicao(0, 4));
		tabuleiro.lugarPeca(new Rei(tabuleiro,Cores.BRANCO), new Posicao(7, 4));
		
	}
}

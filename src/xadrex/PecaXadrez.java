package xadrex;

import tabuleiroJogo.Peca;
import tabuleiroJogo.Tabuleiro;

public class PecaXadrez extends Peca{
	
	private Cores cores;

	public PecaXadrez(Tabuleiro tabuleiro, Cores cores) {
		super(tabuleiro);
		this.cores = cores;
	}

	public Cores getCores() {
		return cores;
	}

}

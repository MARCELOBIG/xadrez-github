package xadrex.pecas;

import tabuleiroJogo.Tabuleiro;
import xadrex.Cores;
import xadrex.PecaXadrez;

public class Rei extends PecaXadrez {

	public Rei(Tabuleiro tabuleiro, Cores cores) {
		super(tabuleiro, cores);
	}
	
	@Override
	public String toString() {
		return "R";
	}

}

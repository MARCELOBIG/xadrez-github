package xadrex.pecas;

import tabuleiroJogo.Tabuleiro;
import xadrex.Cores;
import xadrex.PecaXadrez;

public class Torre extends PecaXadrez {

	public Torre(Tabuleiro tabuleiro, Cores cores) {
		super(tabuleiro, cores);
	}
	
	@Override
	public String toString() {
		return "T";
	}

}

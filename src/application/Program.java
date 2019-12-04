package application;

import xadrex.PartidaXadrez;

public class Program {

	public static void main(String[] args) {
		
		PartidaXadrez partidaXadrex = new PartidaXadrez();
		UI.printTabuleiro(partidaXadrex.obterPecas());

	}

}

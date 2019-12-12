package tabuleiroJogo;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new ExecaoTabuleiro("Erro criando TABULEIRO: � necessario que aja pelo menos 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca [linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	public Peca peca(int linha, int coluna) {
		if (!existePosicao(linha,coluna)) {
			throw new ExecaoTabuleiro("Posicao nao encontrada no tabuleiro");	
		}
		return pecas [linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if (!existePosicao(posicao)) {
			throw new ExecaoTabuleiro("Posicao nao encontrada no tabuleiro");	
		}
		return pecas [posicao.getLinha()][posicao.getColuna()];
	}
	
	public void lugarPeca(Peca peca, Posicao posicao) {
		if (temUmaPeca(posicao)) {
			throw new ExecaoTabuleiro("Alerta! Existe uma pe�a nessa Posi��o "+ posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao; 	
	}
	private boolean existePosicao(int linha, int coluna) {
		return linha >=0 && linha < linhas && coluna >=0 && coluna < colunas ;
	}
	public boolean existePosicao(Posicao posicao) {
		return existePosicao(posicao.getLinha(),posicao.getColuna());
	}
	public boolean temUmaPeca(Posicao posicao) {
		if (!existePosicao(posicao)) {
			throw new ExecaoTabuleiro("Posicao nao encontrada no tabuleiro");	
		}
		return peca(posicao) != null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

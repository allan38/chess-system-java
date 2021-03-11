package boardgame;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if(linhas < 0 || colunas < 0) {
			throw new TabuleiroException("Erro na criação do tabuleiro");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}
	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if(!posicaoExite(posicao)) {
			throw new TabuleiroException("Posição não existe");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca (Peca peca, Posicao pos) {
		if(pecaExiste(pos)) {
			throw new TabuleiroException("Existe uma peça nessa posição!");
		}
		pecas[pos.getLinha()][pos.getColuna()] = peca;
		peca.posicao = pos;
	}
	
	public boolean posicaoExite(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoExite(Posicao pos) {
		return posicaoExite(pos.getLinha(), pos.getColuna());
	}
	
	public boolean pecaExiste(Posicao pos) {
		if(!posicaoExite(pos)) {
			throw new TabuleiroException("Posição não existe");
		}
		return peca(pos) != null;
	}
}

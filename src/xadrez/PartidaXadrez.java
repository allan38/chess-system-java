package xadrez;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import pecasXadrez.Rei;
import pecasXadrez.Torre;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		iniciaSetup();
	}
	
	public PecaXadrez[][] getPecas(){
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
			for(int i=0; i<tabuleiro.getLinhas(); i++) {
				for(int j=0; j<tabuleiro.getColunas(); j++) {
					mat[i][j] =  (PecaXadrez) tabuleiro.peca(i,j);
				}
			}
		
		return mat;
	}
	
	private void iniciaSetup() {
		tabuleiro.colocarPeca(new Torre(Cor.BRANCO, tabuleiro), new Posicao(0,0));
		tabuleiro.colocarPeca(new Torre(Cor.BRANCO, tabuleiro), new Posicao(2,2));
		tabuleiro.colocarPeca(new Rei(Cor.PRETO, tabuleiro), new Posicao(3,2));
	}
			
}

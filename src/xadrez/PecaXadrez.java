package xadrez;

import boardgame.Peca;
import boardgame.Tabuleiro;

public class PecaXadrez extends Peca {

	private Cor cor;
	
	public PecaXadrez(Cor cor, Tabuleiro tabuleiro) {
		super(tabuleiro);
		this.cor=cor;
		// TODO Auto-generated constructor stub
	}

	public Cor getCor() {
		return cor;
	}

}

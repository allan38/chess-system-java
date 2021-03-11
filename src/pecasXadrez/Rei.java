package pecasXadrez;

import boardgame.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Rei extends PecaXadrez {

	public Rei(Cor cor, Tabuleiro tabuleiro) {
		super(cor, tabuleiro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "R";
	}
	
}

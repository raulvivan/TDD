package solitario;

import java.util.ArrayList;
import java.util.Stack;

public class MoveCardController {
	
	private Stack<Card> cardsDeckStack;
	private Stack<Card> cardsWasteStack;

	public MoveCardController(Stack<Card> baraja, Stack<Card> descartes) {
		this.cardsDeckStack = baraja;
		this.cardsWasteStack = descartes;
	}

	public ArrayList<Card> getWasteCards() {
		return null;
	}

}

package solitario;

import java.util.Stack;

public class MoveCardController {
	
	private Stack<Card> cardsDeckStack;
	private Stack<Card> cardsWasteStack;

	public MoveCardController(Stack<Card> baraja, Stack<Card> descartes) {
		this.cardsDeckStack = baraja;
		this.cardsWasteStack = descartes;
	}

	public Stack<Card> getWasteCards() {
		return cardsWasteStack;
	}

	public void moverBarajaADescarte() {
		// TODO Auto-generated method stub
		
	}

	public Stack<Card> getDeckCards() {
		// TODO Auto-generated method stub
		return null;
	}

}

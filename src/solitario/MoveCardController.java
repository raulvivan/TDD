package solitario;

import java.util.ArrayList;

public class MoveCardController {
	
	private int cardsDeckStack;
	private int cardsWasteStack;
	
	public MoveCardController(int cardsDeckStack, int cardsWasteStack){
		this.cardsDeckStack = cardsDeckStack;
		this.cardsWasteStack = cardsWasteStack;
	}

	public ArrayList<Card> getWasteCards() {
		return null;
	}

}

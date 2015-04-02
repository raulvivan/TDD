package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import solitario.Card;
import solitario.MoveCardController;
import solitario.StartController;

public class MoveCardControllerTest {
	
	MoveCardController moveCardController;
	
	@Before
	public void before() {
		moveCardController = new MoveCardController(int cardsDeckStack, int cardsWasteStack);
	}


	@Test
	public void test() {
		ArrayList<Card> wasteCards = moveCardController.getWasteCards();

		assertEquals(3, wasteCards.size());
		
		for (Card card : wasteCards) {
			assertNotNull(card);
			assertTrue(card.uncovered());
		}
	}

}

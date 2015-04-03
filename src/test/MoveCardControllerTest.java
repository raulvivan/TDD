package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

import solitario.Card;
import solitario.MoveCardController;
import solitario.StartController;

public class MoveCardControllerTest {
	
	MoveCardController moveCardController;
	StartController startController;
	
	@Before
	public void before() {
		startController = new StartController();
		moveCardController = new MoveCardController(startController.getBaraja(), startController.getDescartes());
	}


	@Test
	public void moverBarajaADescarteTest() {
		Stack<Card> wasteCards = moveCardController.getWasteCards();

		assertEquals(3, wasteCards.size());
		
		for (Card card : wasteCards) {
			assertNotNull(card);
			assertTrue(card.uncovered());
		}
	}

}

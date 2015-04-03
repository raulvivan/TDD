package test;

import static org.junit.Assert.*;

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
		int cartasBaraja = moveCardController.getDeckCards().size();
		int cartasDescartes = moveCardController.getWasteCards().size();
		moveCardController.moverBarajaADescarte();
		Stack<Card> wasteCards = moveCardController.getWasteCards();

		assertEquals(3, wasteCards.size());
		if(cartasBaraja>=3){
			assertTrue(moveCardController.getDeckCards().size() == cartasBaraja-3);
			assertTrue(moveCardController.getWasteCards().size() == cartasDescartes+3);
		}else{
			assertTrue(moveCardController.getDeckCards().size() == 0);
			assertTrue(moveCardController.getWasteCards().size() == cartasDescartes+cartasBaraja);
		}
		for (Card card : wasteCards) {
			assertNotNull(card);
			assertTrue(card.uncovered());
			assertTrue(wasteCards.indexOf(card) == wasteCards.lastIndexOf(card));
		}
	}
}

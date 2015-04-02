package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

import solitario.Card;
import solitario.StartController;

public class StartControllerTest {

	StartController startController;

	@Before
	public void before() {
		startController = new StartController();
	}

	@Test
	public void isEmptyAllFoundationsTest() {

		assertTrue(startController.isEmptyAllFoundations());

	}

	@Test
	public void peeksEachTableauTest() {

		ArrayList<Card> peeksEachTableau = startController.peeksEachTableau();

		assertEquals(7, peeksEachTableau.size());

		for (Card card : peeksEachTableau) {
			assertNotNull(card);
			assertTrue(card.uncovered());
			assertTrue(peeksEachTableau.indexOf(card) == peeksEachTableau.lastIndexOf(card));
		}
	}
	
	@Test
	public void getPilasTapadasTest(){
		ArrayList<Stack<Card>> pilas = startController.getPilasTapadas();
	}

}

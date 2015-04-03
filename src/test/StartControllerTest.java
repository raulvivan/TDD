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
		
		assertEquals(7, pilas.size());
		int i = 0;
		for(Stack<Card> cartas: pilas){
			assertEquals(i, cartas.size());
			for(Card carta: cartas){
				assertNotNull(carta);
				assertFalse(carta.uncovered());
				assertTrue(cartas.indexOf(carta) == cartas.lastIndexOf(carta));
			}
			i++;
		}
	}
	
	@Test
	public void getPilasPalosTest(){
		ArrayList<Stack<Card>> pilas = startController.getPilasPalos();
		
		assertEquals(4, pilas.size());
		for(Stack<Card> cartas: pilas){
			assertTrue(cartas.isEmpty());
		}
	}
	
	@Test
	public void getBarajaTest(){
		Stack<Card> baraja = startController.getBaraja();
		
		assertEquals(24, baraja.size());
		for(Card carta: baraja){
			assertNotNull(carta);
			assertFalse(carta.uncovered());
			assertTrue(baraja.indexOf(carta) == baraja.lastIndexOf(carta));
		}
	}
	
	@Test
	public void getDescartesTest(){
		Stack<Card> descartes = startController.getDescartes();
	}

}

package solitario;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;



public class StartController {

	public boolean isEmptyAllFoundations() {
		
		return true;
	}

	public ArrayList<Card> peeksEachTableau() {
		ArrayList<Card> peeksEachTableau = new ArrayList<Card>();
		for(int i = 0; i<7 ; i++){
			Card card;
			do{
				Random r = new Random();
				card = new Card(r.nextInt(3), r.nextInt(11), true);
				
			}while(peeksEachTableau.contains(card));
			{
				peeksEachTableau.add(card);
			}
		}
		return peeksEachTableau;
	}

	public ArrayList<Stack<Card>> getPilasTapadas() {
		ArrayList<Stack<Card>> pilas = new ArrayList<Stack<Card>>();
		int numCartas = 0;
		for(int i = 0; i<7 ; i++){
			Card card;
			Stack<Card> cartas = new Stack<Card>();
			for(int j = 0; j<numCartas; j++){
				do{
					Random r = new Random();
					card = new Card(r.nextInt(3), r.nextInt(11), false);
					
				}while(cartas.contains(card));
				{
					cartas.push(card);
				}
			}
			numCartas++;
			pilas.add(cartas);
		}
		return pilas;
	}

	public ArrayList<Stack<Card>> getPilasPalos() {
		// TODO Auto-generated method stub
		return null;
	}

}

package es.upm.TFD.clase.pruebas;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import es.upm.TFD.clase.src.Card;
import es.upm.TFD.clase.src.Pile;

public class PileBuilder {
	
	private List<Card> cards;
	private int number;
	private int numberOfFaceUpCards;
	
	public PileBuilder(){
		cards = new ArrayList<Card>();
	}
	
	public Pile build() {
		Pile pile =  new Pile(number, cards);
		for(int i = 0; i < number; i++) {
			pile.push(cards.get(i));
		}
		return pile;
	}
	
	public PileBuilder number(int number) {
		this.number = number;
		return this;
	}
	
	public PileBuilder numberOfFaceUpCards(int number) {
		this.numberOfFaceUpCards = number;
		return this;
	}
	
	public PileBuilder card(Card card) {
		this.cards.add(card);
		return this;
	}
	
}

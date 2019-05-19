package es.upm.TFD.clase.pruebas;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import es.upm.TFD.clase.src.Card;
import es.upm.TFD.clase.src.Foundation;
import es.upm.TFD.clase.src.Suit;
import es.upm.TFD.clase.src.Number;


public class FoundationBuilder {
	
	private Queue<Card> stack;
	private Suit suit;
	
	public FoundationBuilder(){
		suit = Suit.CLOVERS;
		stack = new ArrayDeque<Card>();
	}
	
	public Foundation build() {
		Foundation foundation =  new Foundation(suit);
		while (!stack.isEmpty()) {
			foundation.push(stack.poll());
		}
		return foundation;
	}
	
	public FoundationBuilder card(Card card) {
		stack.add(card);
		return this;
	}

	public FoundationBuilder suit(Suit suit) {
		this.suit = suit;
		return this;
	}
	
}

package es.upm.TFD.clase.src;

import java.util.Stack;

public class Foundation {
	
	private Stack<Card> stack;
	private Suit suit;
	
	public Foundation(Suit suit) {
		this.suit = suit;
		stack = new	Stack<Card>();
	}
	
	public Card peek() {
		return stack.peek();
	}
	
	public void push(Card card) {
		stack.push(card);
	}
	
	public boolean isComplete() {
		return (this.peek().getNumber().getValue() == Number.KING.getValue());
	}
	
	public boolean fitsIn(Card card) {
		if((card.getSuit() != this.suit) || !(card.isNextTo(stack.peek()))) {
			return false;
		}
		return true;
}

}

package es.upm.TFD.clase.src;

import java.util.Stack;

public class Foundation extends CardStack{
		
	public Foundation(Suit suit) {
		this.suit = suit;
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
	
	public Suit getSuit() {
		return this.suit;
	}

}

package es.upm.TFD.clase.src;

import java.util.Stack;

public abstract class CardStack {
	
	protected Stack<Card> stack;
	protected Suit suit;

	protected CardStack() {
		stack = new	Stack<Card>();
	}
	
	public boolean empty() {
		if(stack.empty()) {
			return true;
		}
		return false;
		
	}

	public Card peek() {
		return stack.peek();
	}
	
	public Card pop() {
		return stack.pop();
	}
	
	public void push(Card card) {
		stack.push(card);
	}
}

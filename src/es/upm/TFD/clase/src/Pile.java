package es.upm.TFD.clase.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Pile extends CardStack{
	
	private int number;
	private int numberOfFaceUpCards;
	
	public Pile(int number, List<Card> cards) {
		for(int i = 0; i < number; i ++) {
			stack.push(cards.get(i));
		}
	}
	
	private void flipFirstCard() {
		
	}
	
	public boolean fitsIn(Card card) {
		if((card.getSuit().getColor() != stack.peek().getSuit().getColor()) && !(card.isNextTo(stack.peek()))){
			return true;	
		}
			
			return false;
	}
	public List<Card> getTop(int numberOfCards){
		List<Card> cardList = new ArrayList<Card>();
		if(numberOfCards > stack.size()) {
			return null;
		}
		if(numberOfCards == 0) {
			return cardList;
		}
		for(int i = 0; i < numberOfCards; i++){
			cardList.add(stack.pop());

		}
		return cardList;
	}
	
	public void addToTop(List<Card> cards) {
		
	}
	
	public void removeTop(int numberOfCards) {
		
	}
	
	public boolean empty() {
		return false;
	}
	
	public Stack<Card> getCards(){
		return this.stack;
	}
	
	public int getNumber() {
		return this.number;
	}

}

package es.upm.TFD.clase.src;

import java.util.ArrayList;
import java.util.List;

public class Stock extends CardStack{

	public Stock() {
	}
	
	public List<Card> takeTop(int quantity){
		System.out.println(stack.size());
		System.out.println(quantity);
		if(stack.size() >= quantity) {
			List<Card> cardList = new ArrayList<Card>();
			for(int i = 0; i<quantity; i++) {
				cardList.add(stack.pop());
			}
			return cardList;
		}
		return null;
	}
	
}

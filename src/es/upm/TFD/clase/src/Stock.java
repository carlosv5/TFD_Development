package es.upm.TFD.clase.src;

import java.util.List;

public class Stock extends CardStack{

	public Stock() {
	}
	
	public List<Card> takeTop(int quantity){
		return stack;
	}
	
}

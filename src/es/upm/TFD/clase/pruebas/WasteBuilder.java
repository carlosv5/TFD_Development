package es.upm.TFD.clase.pruebas;

import java.util.ArrayDeque;
import java.util.Queue;

import es.upm.TFD.clase.src.Card;
import es.upm.TFD.clase.src.Waste;

public class WasteBuilder {
	
	private Queue<Card> waste;
	
	public WasteBuilder(){
		waste = new ArrayDeque<Card>();
	}
	
	public Waste build() {
		Waste waste =  new Waste();
		while (!waste.empty()) {
			waste.push(waste.pop());
		}
		return waste;
	}
	
	public WasteBuilder card(Card card) {
		waste.add(card);
		return this;
	}
	
}

package es.upm.TFD.clase.pruebas;

import java.util.ArrayDeque;
import java.util.Queue;

import es.upm.TFD.clase.src.Card;
import es.upm.TFD.clase.src.Stock;

public class StockBuilder {
	
	private Queue<Card> stack;
	
	public StockBuilder(){
		stack = new ArrayDeque<Card>();
	}
	
	public Stock build() {
		Stock stock =  new Stock();
		while (!stack.isEmpty()) {
			stock.push(stack.poll());
		}
		return stock;
	}
	
	public StockBuilder card(Card card) {
		stack.add(card);
		return this;
	}
	
}

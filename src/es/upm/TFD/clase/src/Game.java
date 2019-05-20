package es.upm.TFD.clase.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Game {
	
	public static int NUMBER_OF_PILES = 4;
	private Map<Suit, Foundation> foundations;
	private Stock stock;
	private Waste waste;
	private List<Pile> piles;
	
	public Game() {	
		this.clear();
	}
	
	public void clear() {
		
		Stack<Card> cardList = new Stack<Card>();
		for(Suit suit : Suit.values()) {
			for(Number number : Number.values()) {
				Card card = new Card(number, suit);
				cardList.push(card);
			}
		}
		
		Collections.shuffle(cardList);
		piles =  new ArrayList<Pile>();
		
		List<Card> pileCards = new ArrayList<Card>();
		foundations = new HashMap<Suit, Foundation>();
		
		for(int i = 0; i<NUMBER_OF_PILES; i++) {
			for(int j = 0; j < i; j++) {
				pileCards.add(cardList.pop());
			}
			Pile pile = new Pile(i, pileCards);
			pileCards.clear();
			piles.add(pile);
		}
		
		this.stock = new Stock();
		while(cardList.size() > 0) {
			stock.push(cardList.pop());
		}
		this.waste = new Waste();
		for(Suit suit : Suit.values()) {
			Foundation foundation = new Foundation(suit);
			foundations.put(suit, foundation);	
		}	
	}
	
	public boolean isFinished() {
		return false;
		
	}
	
	public Error moveFromStockToWaste() {
		int quantity = 3;
		for(int i = 0; i < quantity; i ++) {
			List<Card> cardList = stock.takeTop(1);
			if(cardList != null) {
				waste.push(cardList.get(0));
			} else {
				return Error.EMPTY_STOCK;
			}
		}		
		return null;
		
	}
	
	public Error moveFromWasteToFoundations(Suit suit) {
		return null;
		
	}
	
	public Error moveFromWasteToStock() {
		if(waste.empty()) {
			return Error.EMPTY_WASTE;
		}
		while(!waste.empty()) {
			stock.push(waste.pop());
		}
		return null;
		
	}
	
	public Error moveFromWasteToPile(int pileIndex) {
		return null;
		
	}
	
	public Error moveFromFoundationsToPile(Suit suit, int pileIndex) {
		return null;
		
	}
	
	public Error moveFromPileToFoundation(int pileIndex, Suit suit) {
		return null;
		
	}
	
	public Error moveFromPileToPile(int originIndex, int destinationIndex, int numberOfCards) {
		return null;
		
	}
	
	public Stock getStock() {
		return stock;
		
	}
	
	public Waste getWaste() {
		return waste;
		
	}
	
	public Map<Suit, Foundation> getFoundations(){
		return this.foundations;
	}
	
	public List<Pile> getPiles(){
		return piles;
	}

}

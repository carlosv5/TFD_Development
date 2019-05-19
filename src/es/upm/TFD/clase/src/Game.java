package es.upm.TFD.clase.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Game {
	
	public static int NUMBER_OF_PILES = 7;
	private Map<Suit, Foundation> foundations;
	private Stock stock;
	private Waste waste;
	private List<Pile> piles;
	
	public Game() {	
		this.clear();
	}
	
	public void clear() {
		this.stock = new Stock();
		this.waste = new Waste();
		for(int i = 0; i<NUMBER_OF_PILES; i++) {
			Pile pile = new Pile(i, new ArrayList<Card>());
			piles.add(pile);
		}
		for(Suit suit : Suit.values()) {
			Foundation foundation = new Foundation(suit);
			foundations.put(suit, foundation);	
		}	
	}
	
	public boolean isFinished() {
		return false;
		
	}
	
	public Error moveFromStockToWaste() {
		return null;
		
	}
	
	public Error moveFromWasteToFoundations(Suit suit) {
		return null;
		
	}
	
	public Error moveFromWasteToStock() {
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

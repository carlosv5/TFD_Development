package es.upm.TFD.clase.src;

import java.util.List;
import java.util.Map;

public class Game {
	
	public static int NUMBER_OF_PILES = 4;
	private Map<Suit, Foundation> foundations;
	
	public Game() {
		
	}
	
	public void clear() {
		
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
		return null;
		
	}
	
	public Waste getWaste() {
		return null;
		
	}
	
	public Map<Suit, Foundation> getFoundations(){
		return this.foundations;
	}
	
	public List<Pile> getPiles(){
		
	}

}

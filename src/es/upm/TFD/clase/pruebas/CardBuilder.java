package es.upm.TFD.clase.pruebas;

import es.upm.TFD.clase.src.Suit;
import es.upm.TFD.clase.src.Card;
import es.upm.TFD.clase.src.Number;


public class CardBuilder {
	
	private Number number;
	private Suit suit;
	private boolean faceUp;
	
	public CardBuilder(){
		number = Number.AS;
		suit = Suit.CLOVERS;
		faceUp = false;
	}
	
	public Card build() {
		Card card = new Card(number,suit);
		if(faceUp) {
			card.flip();
		}
		return card;
		
	}
	
	public CardBuilder number(Number number) {
		this.number = number;
		return this;
	}

	public CardBuilder suit(Suit suit) {
		this.suit = suit;
		return this;
	}
	

}

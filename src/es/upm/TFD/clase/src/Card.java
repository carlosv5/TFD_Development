package es.upm.TFD.clase.src;

public class Card {
	
	private Number number;
	private Suit suit;
	private boolean faceUp;
	
	
	public Card(Number number, Suit suit){
		this.number = number;
		this.suit = suit;
	}
	
	public boolean isNextTo(Card card) {
		return(this.number.getValue()-1 == (card.getNumber().getValue()));
	}
	
	public Card flip() {
		this.faceUp = !faceUp;
		return this;
	}

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public boolean isFaceUp() {
		return faceUp;
	}

	public void setFaceUp(boolean faceUp) {
		this.faceUp = faceUp;
	}

	@Override
	public String toString() {
		return "Card [number=" + number + ", suit=" + suit + ", faceUp=" + faceUp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (faceUp ? 1231 : 1237);
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (faceUp != other.faceUp)
			return false;
		if (number != other.number)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}
	
	

}

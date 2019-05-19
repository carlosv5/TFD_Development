package es.upm.TFD.clase.src;

public enum Suit {
	HEARTS(Color.RED, 'H'), DIAMONDS(Color.RED,'D'), CLOVERS(Color.BLACK, 'C'), PIKES(Color.BLACK,'P');
	
	private char initial;
	private Color color;
	
	Suit(Color color, char initial){
		this.color = color;
		this.initial = initial;
	}
	
	public static char[] initials() {
		char[] initials = new char[]{HEARTS.initial, DIAMONDS.initial, CLOVERS.initial, PIKES.initial};
		java.util.Arrays.sort(initials);
		return initials;	
	}
	
	public static Suit find(char initial) {
		switch(initial) {
		case 'H':
			return HEARTS;
		case 'D':
			return DIAMONDS;
		case 'C':
			return CLOVERS;
		case 'P':
			return PIKES;
		default:
			return null;
		}
	}
	
	public Color getColor() {
		return this.color;
	}

}

package es.upm.TFD.clase.pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import es.upm.TFD.clase.src.Card;
import es.upm.TFD.clase.src.Suit;
import es.upm.TFD.clase.src.Number;

public class CardTest {

	@Test
	public void givenACard_WhenWetestIsNextToCorrectly_ThenItIsTrue() {
		Card card1 = new CardBuilder().number(Number.TWO).build();
		Card card2 = new CardBuilder().number(Number.AS).build();
		assertTrue(card1.isNextTo(card2));
	}
	
	@Test
	public void givenACard_WhenWetestIsNextToIsNotCorrect_ThenItIsFalse() {
		Card card1 = new CardBuilder().number(Number.TWO).build();
		Card card2 = new CardBuilder().number(Number.THREE).build();
		assertFalse(card1.isNextTo(card2));
	}
	
	
	@Test
	public void givenACardNoFaceUp_WhenFlip_ThenIsFaceUp() {
		Card card = new CardBuilder().build();
		assertTrue(card.flip().isFaceUp());
	}
	
}

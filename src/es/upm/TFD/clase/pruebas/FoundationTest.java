package es.upm.TFD.clase.pruebas;

import es.upm.TFD.clase.src.Card;
import es.upm.TFD.clase.src.Number;
import es.upm.TFD.clase.src.Suit;
import es.upm.TFD.clase.src.Foundation;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class FoundationTest {

	@Test
	public void givenACompleteFoundation_WhenCheckingIfItsComplete_ThenIsTrue() {
		Foundation foundation = new CompleteFoundationBuilder().build();
		Card card = new CardBuilder().number(Number.KING).build();
		assertTrue(foundation.isComplete());
	}
	
	@Test
	public void givenAnIncompleteFoundation_WhenCheckingIfItsComplete_ThenIsFalse() {
		Card card = new CardBuilder().number(Number.AS).build();
		Foundation foundation = new FoundationBuilder().card(card).build();
		assertFalse(foundation.isComplete());
	}
	
	@Test
	public void givenAFoundatio_whenWeAddACardThatFitsIn_ThenTheResultIsTrue() {
		Card card1 = new CardBuilder().number(Number.AS).suit(Suit.CLOVERS).build();
		Card card2 = new CardBuilder().number(Number.TWO).suit(Suit.CLOVERS).build();
		Card card3 = new CardBuilder().number(Number.THREE).suit(Suit.CLOVERS).build();
		Foundation foundation = new FoundationBuilder().card(card1).card(card2).suit(Suit.CLOVERS).build();
		assertTrue(foundation.fitsIn(card3));		
	}
	
	@Test
	public void givenAFoundatio_whenWeAddACardThatDoesNotFitInBySuit_ThenTheResultIsFalse() {
		Card card1 = new CardBuilder().number(Number.AS).suit(Suit.CLOVERS).build();
		Card card2 = new CardBuilder().number(Number.TWO).suit(Suit.CLOVERS).build();
		Card card3 = new CardBuilder().number(Number.THREE).suit(Suit.DIAMONDS).build();
		Foundation foundation = new FoundationBuilder().card(card1).card(card2).suit(Suit.CLOVERS).build();
		assertFalse(foundation.fitsIn(card3));		
	}
	
	@Test
	public void givenAFoundatio_whenWeAddACardThatDoesNotFitInByNumber_ThenTheResultIsFalse() {
		Card card1 = new CardBuilder().number(Number.AS).suit(Suit.CLOVERS).build();
		Card card2 = new CardBuilder().number(Number.TWO).suit(Suit.CLOVERS).build();
		Card card3 = new CardBuilder().number(Number.FIVE).suit(Suit.CLOVERS).build();
		Foundation foundation = new FoundationBuilder().card(card1).card(card2).suit(Suit.CLOVERS).build();
		assertFalse(foundation.fitsIn(card3));		
	}	
}

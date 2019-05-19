package es.upm.TFD.clase.pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import es.upm.TFD.clase.src.Card;
import es.upm.TFD.clase.src.Foundation;
import es.upm.TFD.clase.src.Number;
import es.upm.TFD.clase.src.Pile;
import es.upm.TFD.clase.src.Stock;
import es.upm.TFD.clase.src.Suit;

public class PileTest {
	
//	@Test
//	public void givenAPile_whenAddACardThatDoesNotFitInByColorSuit_ThenTheResultIsFalse() {
//		Card card1 = new CardBuilder().number(Number.KING).suit(Suit.CLOVERS).build();
//		Card card2 = new CardBuilder().number(Number.QUEEN).suit(Suit.CLOVERS).build();
//		Pile pile = new PileBuilder().card(card1).build();
//		assertFalse(pile.fitsIn(card2));		
//	}
//	
//	@Test
//	public void givenAPile_whenAddACardThatDoesNotFitInByNumber_ThenTheResultIsFalse() {
//		Card card1 = new CardBuilder().number(Number.KING).suit(Suit.CLOVERS).build();
//		Card card2 = new CardBuilder().number(Number.TWO).suit(Suit.CLOVERS).build();
//		Pile pile = new PileBuilder().card(card1).build();
//		assertFalse(pile.fitsIn(card2));		
//	}
//	
//	@Test
//	public void givenAPile_whenAddACardThatFitsIn_ThenTheResultIsTrue() {
//		Card card1 = new CardBuilder().number(Number.SEVEN).suit(Suit.CLOVERS).build();
//		Card card2 = new CardBuilder().number(Number.SIX).suit(Suit.HEARTS).build();
//		Pile pile = new PileBuilder().card(card1).build();
//		assertTrue(pile.fitsIn(card2));		
//	}
//	
//	@Test
//	public void givenAPile_whenAddACardThatDoesNotFitInByCloseUpperNumber_ThenTheResultIsFalse() {
//		Card card1 = new CardBuilder().number(Number.SEVEN).suit(Suit.CLOVERS).build();
//		Card card2 = new CardBuilder().number(Number.EIGHT).suit(Suit.HEARTS).build();
//		Pile pile = new PileBuilder().card(card1).build();
//		assertFalse(pile.fitsIn(card2));		
//	}

	@Test
	public void givenAPileWith2Cards_whenGetTop2Cards_ThenTheResultIsTheThreeCorrectCards() {
		int quantity = 2;
		Card card1 = new CardBuilder().number(Number.SEVEN).suit(Suit.CLOVERS).build();
		Card card2 = new CardBuilder().number(Number.EIGHT).suit(Suit.HEARTS).build();
		Pile pile = new PileBuilder().card(card1).card(card2).build();
		List<Card> cardList = new ArrayList<Card>();
		cardList.add(card2);
		cardList.add(card1);
		assertEquals(cardList, pile.getTop(quantity));		
	}
	
	@Test
	public void givenAPileWith3Cards_whenGetTop2Cards_ThenTheResultIsTheThreeCorrectCards() {
		int quantity = 2;
		Card card1 = new CardBuilder().number(Number.SEVEN).suit(Suit.CLOVERS).build();
		Card card2 = new CardBuilder().number(Number.EIGHT).suit(Suit.HEARTS).build();
		Card card3 = new CardBuilder().number(Number.NINE).suit(Suit.CLOVERS).build();
		Pile pile = new PileBuilder().card(card1).card(card2).card(card3).build();
		List<Card> cardList = new ArrayList<Card>();
		cardList.add(card3);
		cardList.add(card2);
		assertEquals(cardList, pile.getTop(quantity));		
	}

	@Test
	public void givenAPileWith1Cards_whenGetTop0Cards_ThenTheResultIsEmptyList() {
		int quantity = 0;
		Card card1 = new CardBuilder().number(Number.SEVEN).suit(Suit.CLOVERS).build();
		Pile pile = new PileBuilder().card(card1).build();
		assertEquals(new ArrayList<Card>(), pile.getTop(quantity));		
	}
	
	@Test
	public void givenAPileWith2Cards_whenGetTop3Cards_ThenTheResultIsNull() {
		int quantity = 3;
		Card card1 = new CardBuilder().number(Number.SEVEN).suit(Suit.CLOVERS).build();
		Card card2 = new CardBuilder().number(Number.EIGHT).suit(Suit.HEARTS).build();
		Pile pile = new PileBuilder().card(card1).card(card2).build();
		assertEquals(null, pile.getTop(quantity));		
	}
	
	
	@Test
	public void givenAPileWith1Card_whenAddToTop1Card_ThenTheResultIsTheListWithThese2Cards() {
		Card card1 = new CardBuilder().number(Number.EIGHT).suit(Suit.CLOVERS).build();
		Card card2 = new CardBuilder().number(Number.SEVEN).suit(Suit.HEARTS).build();
		Pile pile = new PileBuilder().card(card1).build();
		List<Card> cardList = new ArrayList<Card>();
		cardList.add(card1);
		cardList.add(card2);
		
		List<Card> cardsToAdd = new ArrayList<Card>();
		cardsToAdd.add(card2);
		pile.addToTop(cardsToAdd);
		assertEquals(cardList, pile.getCards());		
	}
	
	@Test
	public void givenAPileWith0Cards_whenAddToTop1Card_ThenTheResultIsTheListWithThisCard() {
		Card card1 = new CardBuilder().number(Number.KING).suit(Suit.CLOVERS).build();
		Pile pile = new PileBuilder().build();
		
		List<Card> cardsToAdd = new ArrayList<Card>();
		cardsToAdd.add(card1);
		pile.addToTop(cardsToAdd);
		assertEquals(cardsToAdd, pile.getCards());		
	}
	
	@Test
	public void givenAPileWith0Cards_whenAddToTop0Card_ThenTheResultIsTheSameCards() {
		Card card1 = new CardBuilder().number(Number.SEVEN).suit(Suit.CLOVERS).build();
		Pile pile = new PileBuilder().card(card1).build();
		List<Card> cardList = new ArrayList<Card>();
		cardList.add(card1);

		List<Card> cardsToAdd = new ArrayList<Card>();
		pile.addToTop(cardsToAdd);
		assertEquals(cardList, pile.getCards());		
	}

}

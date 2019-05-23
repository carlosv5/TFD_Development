package es.upm.TFD.clase.pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import es.upm.TFD.clase.src.Card;
import es.upm.TFD.clase.src.Foundation;
import es.upm.TFD.clase.src.Number;
import es.upm.TFD.clase.src.Stock;
import es.upm.TFD.clase.src.Suit;

public class StockTest {
	
	@Test
	public void givenAStockAnd4Cards_whenTakingTop3CardsAndOneIsWrong_ThenTheCardsAreNotTheSame() {
		int quantity = 3;
		Card card1 = new CardBuilder().number(Number.AS).build();
		Card card2 = new CardBuilder().number(Number.TWO).build();
		Card card3 = new CardBuilder().number(Number.THREE).build();
		Card card4 = new CardBuilder().number(Number.FIVE).build();
		Stock stock = new StockBuilder().card(card1).card(card2).card(card3).build();
		List<Card> cardList = new ArrayList<Card>();
		cardList.add(card4);
		cardList.add(card2);
		cardList.add(card1);
		assertNotEquals(stock.takeTop(quantity), cardList);
	}
	
	@Test
	public void givenAStockAnd3Cards_whenTakingTop2Cards_ThenTheCardsAreTheSame() {
		int quantity = 2;
		Card card1 = new CardBuilder().number(Number.AS).build();
		Card card2 = new CardBuilder().number(Number.TWO).build();
		Card card3 = new CardBuilder().number(Number.THREE).build();
		Stock stock = new StockBuilder().card(card1).card(card2).card(card3).build();
		List<Card> cardList = new ArrayList<Card>();
		cardList.add(card3);
		cardList.add(card2);
		assertEquals(stock.takeTop(quantity), cardList);
	}
	
	
	@Test
	public void givenAStockAnd3Cards_whenTakingTop3Cards_ThenTheCardsAreTheSame() {
		int quantity = 3;
		Card card1 = new CardBuilder().number(Number.AS).build();
		Card card2 = new CardBuilder().number(Number.TWO).build();
		Card card3 = new CardBuilder().number(Number.THREE).build();
		Stock stock = new StockBuilder().card(card1).card(card2).card(card3).build();
		List<Card> cardList = new ArrayList<Card>();
		cardList.add(card3);
		cardList.add(card2);		
		cardList.add(card1);
		assertEquals(stock.takeTop(quantity), cardList);
	}
	
	@Test
	public void givenAStockAnd3Cards_whenTakingTop4Cards_ThenTheResultIsNull() {
		int quantity = 4;
		Card card1 = new CardBuilder().number(Number.AS).build();
		Card card2 = new CardBuilder().number(Number.TWO).build();
		Card card3 = new CardBuilder().number(Number.THREE).build();
		Stock stock = new StockBuilder().card(card1).card(card2).card(card3).build();
		assertEquals(stock.takeTop(quantity), null);
	}
	
	@Test
	public void givenAStockAnd3Cards_whenTakingTop0Cards_ThenTheResultIsEmptyList() {
		int quantity = 0;
		Card card1 = new CardBuilder().number(Number.AS).build();
		Card card2 = new CardBuilder().number(Number.TWO).build();
		Card card3 = new CardBuilder().number(Number.THREE).build();
		Stock stock = new StockBuilder().card(card1).card(card2).card(card3).build();
		List<Card> cardList = new ArrayList<Card>();
		assertEquals(stock.takeTop(quantity), cardList);
	}

	@Test
	public void testPush() {
		Card card = new CardBuilder().number(Number.AS).build();
		Stock stock = new Stock();
		stock.push(card);
		assertEquals(stock.peek(), card);
	}

	@Test
	public void testPop() {
		Card card = new CardBuilder().number(Number.AS).build();
		Stock stock = new StockBuilder().card(card).build();
		assertEquals(stock.pop(), card);
	}
}

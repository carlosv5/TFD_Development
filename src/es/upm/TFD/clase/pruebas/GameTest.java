package es.upm.TFD.clase.pruebas;

import es.upm.TFD.clase.src.Game;
import es.upm.TFD.clase.src.Stock;
import es.upm.TFD.clase.src.Suit;
import es.upm.TFD.clase.src.Waste;
import es.upm.TFD.clase.src.Error;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;



public class GameTest {
	
	@Test
	public void givenAInitialGame_WhenMovingFromStockToWaste_theResultIsCorrect() {
		Game game = new Game();
		Error error = game.moveFromStockToWaste();
		assertNull(error);
	}
	
	@Test
	public void givenAInitialGameWithEmptyStock_WhenMovingFromStockToWaste_theResultIsErrorEmptyStock() {
		Game game = new Game();
		Stock stock = game.getStock();
		while(!stock.empty()) {
			stock.pop();
		}
		Error error = game.moveFromStockToWaste();
		assertEquals(error, Error.EMPTY_STOCK);
	}
	
	@Test
	public void givenAInitialGame_WhenMovingFromWasteToStock_theResultIsCorrect() {
		Game game = new Game();
		Stock stock = game.getStock();
		Waste waste = game.getWaste();
		while(!stock.empty()) {
			waste.push(stock.pop());
		}
		Error error = game.moveFromWasteToStock();
		assertNull(error);
	}
	
	@Test
	public void givenAInitialGameWithEmptyWaste_WhenMovingFromWasteToStock_theResultIsErrorEmptyWaste() {
		Game game = new Game();
		Waste waste = game.getWaste();
		while(!waste.empty()) {
			waste.pop();
		}
		Error error = game.moveFromWasteToStock();
		assertEquals(error, Error.EMPTY_WASTE);
	}
	
	@Test
	public void givenAInitialGameWithEmptyWaste_WhenMovingFromWasteToPile_theResultIsErrorEmptyWaste() {
		Game game = new Game();
		Error error = game.moveFromWasteToPile(1);
		assertEquals(error, Error.EMPTY_WASTE);
	}
	
	@Test
	public void givenAInitialGame_WhenMovingFromWasteToPile_theResultIsCorrect() {
		Game game = new Game();
		Stock stock = game.getStock();
		Waste waste = game.getWaste();
		waste.push(stock.pop());
		Error error = game.moveFromWasteToPile(1);
		assertNull(error);
	}
	
	@Test
	public void givenAInitialGameWithEmptyWaste_WhenMovingFromWasteToFoundations_theResultIsErrorEmptyWaste() {
		Game game = new Game();
		Error error = game.moveFromWasteToFoundations(Suit.HEARTS);
		assertEquals(error, Error.EMPTY_WASTE);
	}
	
	@Test
	public void givenAInitialGame_WhenMovingFromWasteToFoundations_theResultIsCorrect() {
		Game game = new Game();
		Stock stock = game.getStock();
		Waste waste = game.getWaste();
		waste.push(stock.pop());
		Error error = game.moveFromWasteToFoundations(Suit.HEARTS);
		assertNull(error);
	}

}

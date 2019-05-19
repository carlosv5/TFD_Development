package es.upm.TFD.clase.pruebas;

import es.upm.TFD.clase.src.Game;
import es.upm.TFD.clase.src.Error;
import static org.junit.Assert.assertNull;



public class GameTest {
	
	public void testMoveFromStockToWaste() {
		Game game = new Game();
		Error error = game.moveFromStockToWaste();
		assertNull(error);
	}

}

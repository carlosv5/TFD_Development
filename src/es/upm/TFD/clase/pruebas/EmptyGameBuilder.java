package es.upm.TFD.clase.pruebas;

import es.upm.TFD.clase.src.Game;
import es.upm.TFD.clase.src.Stock;
import es.upm.TFD.clase.src.Waste;

public class EmptyGameBuilder {

	private Game game;
	private Stock stock;
	private Waste waste;

	public EmptyGameBuilder() {
		this.game = new Game();
	}

	public Game build() {
		return this.game;
	}

	public EmptyGameBuilder updateStock(Stock stock) {
		this.stock = this.game.getStock();
		while (!this.stock.empty()) {
			this.stock.pop();
		}
		while (!stock.empty()) {
			this.stock.push(stock.pop());
		}
		return this;
	}
	
	public EmptyGameBuilder updateWaste(Waste waste) {
		this.waste = this.game.getWaste();
		while (!this.waste.empty()) {
			this.waste.pop();
		}
		while (!waste.empty()) {
			this.waste.push(waste.pop());
		}
		return this;
	}

}

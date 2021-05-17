package gameProject01.entities.concretes;

import gameProject01.core.Entity;

public class Order implements Entity{
	
	private int orderId;
	private int gameId;
	private int gamerId;
	
	public Order() {}

	public Order(int orderId, int gameId, int gamerId) {
		super();
		this.orderId = orderId;
		this.gameId = gameId;
		this.gamerId = gamerId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
	
	
	
	


}

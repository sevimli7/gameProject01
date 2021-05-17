package gameProject01.entities.concretes;

import gameProject01.core.Dto;

public class OrderDto implements Dto{
	
	private int orderId;
	private int gamerId;
	private int gameId;
	private int discountRate;
	private double price;
	private double priceOfDiscount;
	
	public OrderDto() {}

	public OrderDto(int orderId, int gamerId, int gameId, int discountRate, double price) {
		super();
		this.orderId = orderId;
		this.gamerId = gamerId;
		this.gameId = gameId;
		this.discountRate = discountRate;
		this.price = price;
		
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPriceOfDiscount() {
		return priceOfDiscount;
	}

	public double setPriceOfDiscount(double priceOfDiscount) {

		return this.price-(this.price*this.discountRate / 100);
	}
	

}

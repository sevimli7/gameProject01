package gameProject01.dataAccess.concretes;

import gameProject01.dataAccess.abstracts.OrderDao;
import gameProject01.entities.concretes.Order;

public class HibernateOrderDao implements OrderDao {

	@Override
	public void add(Order order) {
		System.out.println("sipariþ eklendi : "+order.getOrderId());
		
	}

	@Override
	public void delete(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Order order) {
		// TODO Auto-generated method stub
		
	}

}

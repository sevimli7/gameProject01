package gameProject01.dataAccess.abstracts;

import gameProject01.entities.concretes.Order;

public interface OrderDao {
	
	void add(Order order);
	void delete(Order order);
	void update(Order order);

}

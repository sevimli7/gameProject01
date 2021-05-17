package gameProject01.dataAccess.concretes;

import gameProject01.dataAccess.abstracts.GameDao;
import gameProject01.entities.concretes.Game;

public class HibernateGameDao implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println("hibernate ile oyun eklendi : "+game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		
	}

}

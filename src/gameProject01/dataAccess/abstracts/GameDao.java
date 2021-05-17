package gameProject01.dataAccess.abstracts;

import gameProject01.entities.concretes.Game;

public interface GameDao {
	
	void add(Game game);
	void delete(Game game);
	void update(Game game);

}

package gameProject01.business.abstracts;

import gameProject01.entities.concretes.Game;
import gameProject01.entities.concretes.Gamer;

public interface GameService {
	
	void add(Game game);
	void delete(Game game);
	void sell(Game game, Gamer gamer);
	

}

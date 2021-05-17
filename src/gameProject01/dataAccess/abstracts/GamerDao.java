package gameProject01.dataAccess.abstracts;

import gameProject01.entities.concretes.Gamer;

public interface GamerDao {
	
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);

}

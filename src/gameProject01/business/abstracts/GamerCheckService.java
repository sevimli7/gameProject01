package gameProject01.business.abstracts;

import gameProject01.entities.concretes.Gamer;

public interface GamerCheckService {
	
	boolean checkIfRealPerson(Gamer gamer);

}

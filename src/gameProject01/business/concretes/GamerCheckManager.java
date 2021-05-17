package gameProject01.business.concretes;

import gameProject01.business.abstracts.GamerCheckService;
import gameProject01.entities.concretes.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		return true;
	}

}

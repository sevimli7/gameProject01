package gameProject01.dataAccess.concretes;

import gameProject01.dataAccess.abstracts.GamerDao;
import gameProject01.entities.concretes.Gamer;

public class HibernateGamerDao implements GamerDao{

	@Override
	public void add(Gamer gamer) {
		System.out.println("oyuncu eklendi : "+gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

}

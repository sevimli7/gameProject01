package gameProject01.business.concretes;

import gameProject01.business.abstracts.GameService;
import gameProject01.business.abstracts.GamerCheckService;
import gameProject01.entities.concretes.Game;
import gameProject01.entities.concretes.Gamer;

public class GameManager implements GameService {
	private GamerCheckService gamerCheckService;

	public GameManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}
	

	@Override
	public void add(Game game) {
		
		
		System.out.println("oyun eklendi : "+game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sell(Game game, Gamer gamer) {
		
		if(gamerCheckService.checkIfRealPerson(gamer)) {
		
		System.out.println(game.getGameName()+" oyunu "+gamer.getFirstName()+" müsteriye satýldý");
		}else {
			System.out.println("kiþi doðrulanamadý");
		}
		
	}

}

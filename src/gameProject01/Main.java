package gameProject01;

import java.time.LocalDate;

import gameProject01.business.concretes.GameManager;
import gameProject01.core.MernisAdapter;
import gameProject01.entities.concretes.Game;
import gameProject01.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		
		//yeni oyun eklendi 
		GameManager manager=new GameManager(new MernisAdapter());
		//manager.add(new Game(1,"hitman", 150));
		Game hitman=new Game(1,"hitman", 150);
		Gamer sevgi=new Gamer(1,"sevgül","taþ",LocalDate.of(1987, 01, 01),"00000000");
		
		manager.sell(hitman,sevgi);
		
		
		
		

	}

}

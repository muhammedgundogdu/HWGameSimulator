package business.concrete;

import business.abstarct.GameService;
import entities.concrete.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		if(game.getPrice()<0 && game.getGameName().length()<2) {
			System.out.println("Eksik oyun bilgisi girdiniz.\n");
			System.out.println("Lütfen isteðinizi tekrarlayýnýz.");
		}
		else {
			System.out.println(game.getGameName()+" sisteme baþarýyla eklendi.");
		}
		
	}

	@Override
	public void delete(Game game) {
		
		if(game.getPrice()<0 && game.getGameName().length()<2) {
			System.out.println("Eksik oyun bilgisi girdiniz.\n");
			System.out.println("Lütfen isteðinizi tekrarlayýnýz.");
		}
		else {
			System.out.println(game.getGameName()+" sistemden baþarýyla silindi.");
		}
	}

	@Override
	public void update(Game game) {
		if(game.getPrice()<0 && game.getGameName().length()<2) {
			System.out.println("Eksik oyun bilgisi girdiniz.\n");
			System.out.println("Lütfen isteðinizi tekrarlayýnýz.");
		}
		else {
			System.out.println(game.getGameName()+" sistemde baþarýyla güncellendi.");
		}
		
	}

}

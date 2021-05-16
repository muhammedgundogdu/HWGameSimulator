package business.concrete;

import business.abstarct.GameService;
import entities.concrete.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		if(game.getPrice()<0 && game.getGameName().length()<2) {
			System.out.println("Eksik oyun bilgisi girdiniz.\n");
			System.out.println("L�tfen iste�inizi tekrarlay�n�z.");
		}
		else {
			System.out.println(game.getGameName()+" sisteme ba�ar�yla eklendi.");
		}
		
	}

	@Override
	public void delete(Game game) {
		
		if(game.getPrice()<0 && game.getGameName().length()<2) {
			System.out.println("Eksik oyun bilgisi girdiniz.\n");
			System.out.println("L�tfen iste�inizi tekrarlay�n�z.");
		}
		else {
			System.out.println(game.getGameName()+" sistemden ba�ar�yla silindi.");
		}
	}

	@Override
	public void update(Game game) {
		if(game.getPrice()<0 && game.getGameName().length()<2) {
			System.out.println("Eksik oyun bilgisi girdiniz.\n");
			System.out.println("L�tfen iste�inizi tekrarlay�n�z.");
		}
		else {
			System.out.println(game.getGameName()+" sistemde ba�ar�yla g�ncellendi.");
		}
		
	}

}

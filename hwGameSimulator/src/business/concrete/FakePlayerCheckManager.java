package business.concrete;

import business.abstarct.PlayerCheckService;
import entities.concrete.Player;

public class FakePlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		return true;
	}

}

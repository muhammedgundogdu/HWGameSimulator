package business.abstarct;

import entities.concrete.Player;

public interface PlayerCheckService {

	boolean checkIfRealPerson(Player player);
}

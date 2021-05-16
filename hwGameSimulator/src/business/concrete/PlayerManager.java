package business.concrete;

import business.abstarct.PlayerCheckService;
import business.abstarct.PlayerService;
import entities.concrete.Player;




public class PlayerManager implements PlayerService{
	
	PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) 
	{
		this.playerCheckService = playerCheckService;
	}


	
	@Override
	public void add(Player player) {
		if(playerCheckService.checkIfRealPerson(player)) 
		{
			System.out.println("�ye Eklendi: " + player.getFirstName() + " " + player.getLastName());
		}
		else {
			System.out.println("�ye Bilgileri Hatal�");
		}		
		
	}

	@Override
	public void update(Player player) {
		if(playerCheckService.checkIfRealPerson(player))
		{
			System.out.println("�ye Bilgileri G�ncellendi: " + player.getFirstName() + " " + player.getLastName() );
		}
		else {
			System.out.println("�ye Bilgileri Hatal�");
		}
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("�ye Silindi");
		
	}

}

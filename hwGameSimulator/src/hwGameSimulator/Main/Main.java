package hwGameSimulator.Main;

import java.time.LocalDate;

import adapter.RealPlayerCheckService;
import business.abstarct.PlayerCheckService;
import business.concrete.PlayerManager;
import business.concrete.CampaignManager;
import business.concrete.GameManager;
import business.concrete.SaleManager;
import entities.concrete.Player;
import entities.concrete.Sale;
import entities.concrete.Campaign;
import entities.concrete.Game;

public class Main {

	public static void main(String[] args) {
		
		Player player1=new Player();
		player1.setFirstName("Muhammed");
		player1.setLastName("Gündoðdu");
		player1.setNationalityId("26756630858");
		player1.setBirthDate(LocalDate.of(1999, 4, 7));
		player1.setId(1);
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Valorant");
		game1.setPrice(145);
		game1.setDescription("Farklý ajanlarla dolu yenilikçi FPS oyununu þimdi keþfedin.");
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("Bahar Kampanyasý");
		campaign1.setDiscountPercentage(15);
		
		Sale sale1=new Sale();
		sale1.setGame(game1);
		sale1.setId(1);
		sale1.setPlayer(player1);
		
		PlayerManager playerManager=new PlayerManager(new RealPlayerCheckService());
		playerManager.add(player1);
		
		business.concrete.GameManager gameManager=new business.concrete.GameManager();
		gameManager.add(game1);
		
		business.concrete.CampaignManager campaignManager=new business.concrete.CampaignManager();
		campaignManager.add(campaign1);
		
		business.concrete.SaleManager saleManager1=new business.concrete.SaleManager();
		saleManager1.sale(sale1);
		
		business.concrete.SaleManager saleManager2=new business.concrete.SaleManager();
		saleManager2.add(sale1, campaign1);
		
	}

}

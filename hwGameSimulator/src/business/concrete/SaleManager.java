package business.concrete;

import business.abstarct.SaleService;
import entities.concrete.Campaign;
import entities.concrete.Sale;

public class SaleManager implements SaleService{

	@Override
	public void sale(Sale sale) {
		System.out.println("Sayýn " +sale.getPlayer().getFirstName()+" "+sale.getPlayer().getLastName()
				+" "+sale.getGame().getGameName()+" adlý oyunu "+sale.getGame().getPrice()+
				" TL karþýlýðýnda satýn aldýnýz.");
		
	}
	
	public void add(Sale sale,Campaign campaign) {
		System.out.println("Sayýn "+sale.getPlayer().getFirstName()+" "+sale.getPlayer().getLastName()
				+" "+sale.getGame().getGameName()+" oyununu"+" "+campaign.getDiscountPercentage()+
				" indirim oranýyla "+(sale.getGame().getPrice()-(sale.getGame().getPrice()*campaign.getDiscountPercentage()/100))
				+" TL karþýlýðýnda satýn aldýnýz."+"\n"+
				" Bu indirimden kazancýnýz: "+sale.getGame().getPrice()*campaign.getDiscountPercentage()/100+"TL");
		
	}

}

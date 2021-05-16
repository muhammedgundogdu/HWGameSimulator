package business.concrete;

import business.abstarct.SaleService;
import entities.concrete.Campaign;
import entities.concrete.Sale;

public class SaleManager implements SaleService{

	@Override
	public void sale(Sale sale) {
		System.out.println("Say�n " +sale.getPlayer().getFirstName()+" "+sale.getPlayer().getLastName()
				+" "+sale.getGame().getGameName()+" adl� oyunu "+sale.getGame().getPrice()+
				" TL kar��l���nda sat�n ald�n�z.");
		
	}
	
	public void add(Sale sale,Campaign campaign) {
		System.out.println("Say�n "+sale.getPlayer().getFirstName()+" "+sale.getPlayer().getLastName()
				+" "+sale.getGame().getGameName()+" oyununu"+" "+campaign.getDiscountPercentage()+
				" indirim oran�yla "+(sale.getGame().getPrice()-(sale.getGame().getPrice()*campaign.getDiscountPercentage()/100))
				+" TL kar��l���nda sat�n ald�n�z."+"\n"+
				" Bu indirimden kazanc�n�z: "+sale.getGame().getPrice()*campaign.getDiscountPercentage()/100+"TL");
		
	}

}

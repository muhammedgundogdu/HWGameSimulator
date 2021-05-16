package business.concrete;

import business.abstarct.CampaignService;
import entities.concrete.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		if(campaign.getName().length()<2 && campaign.getDiscountPercentage()<0) {
		System.out.println("Girdi�iniz bilgiler eksik veya yanl�� l�tfen tekrar deneyin.");
		}
		else {
			System.out.println(campaign.getName()+" isimli kampanya "+campaign.getDiscountPercentage()+
					" indirim oran�yla sisteme eklendi.");
		}
		
	}

	@Override
	public void update(Campaign campaign) {
		if(campaign.getName().length()<2 && campaign.getDiscountPercentage()<0) {
			System.out.println("Girdi�iniz bilgiler eksik veya yanl�� l�tfen tekrar deneyin.");
			}
			else {
				System.out.println(campaign.getName()+" isimli kampanya "+campaign.getDiscountPercentage()+
						" indirim oran�yla sistemde ba�ar�yla g�ncellendi.");
			}
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" isimli kampanya "+campaign.getDiscountPercentage()+
				" indirim oran�yla sistemden ba�ar�yla silindi.");
		
	}


}

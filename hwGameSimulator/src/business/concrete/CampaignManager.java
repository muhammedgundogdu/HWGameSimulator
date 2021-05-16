package business.concrete;

import business.abstarct.CampaignService;
import entities.concrete.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		if(campaign.getName().length()<2 && campaign.getDiscountPercentage()<0) {
		System.out.println("Girdiðiniz bilgiler eksik veya yanlýþ lütfen tekrar deneyin.");
		}
		else {
			System.out.println(campaign.getName()+" isimli kampanya "+campaign.getDiscountPercentage()+
					" indirim oranýyla sisteme eklendi.");
		}
		
	}

	@Override
	public void update(Campaign campaign) {
		if(campaign.getName().length()<2 && campaign.getDiscountPercentage()<0) {
			System.out.println("Girdiðiniz bilgiler eksik veya yanlýþ lütfen tekrar deneyin.");
			}
			else {
				System.out.println(campaign.getName()+" isimli kampanya "+campaign.getDiscountPercentage()+
						" indirim oranýyla sistemde baþarýyla güncellendi.");
			}
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" isimli kampanya "+campaign.getDiscountPercentage()+
				" indirim oranýyla sistemden baþarýyla silindi.");
		
	}


}

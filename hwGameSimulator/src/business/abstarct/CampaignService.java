package business.abstarct;

import entities.concrete.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);

}

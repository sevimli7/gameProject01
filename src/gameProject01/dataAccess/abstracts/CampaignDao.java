package gameProject01.dataAccess.abstracts;

import gameProject01.entities.concretes.Campaign;

public interface CampaignDao {
	
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);

}

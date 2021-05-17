package gameProject01.dataAccess.concretes;

import gameProject01.dataAccess.abstracts.CampaignDao;
import gameProject01.entities.concretes.Campaign;

public class HibernateCampaignDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		System.out.println("kampanya eklendi : "+campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

}

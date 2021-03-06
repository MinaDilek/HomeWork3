package Concrete;
import Abstract.CampaignService;
import Property.Campaign;

public class CampaignManager implements CampaignService {
	
	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + ", Adlı kampanyamız başlamıştır.");
	}
	
	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getTime() +"süreli" +campaign.getCampaignName()+"isimli kampanyamızın süresi bitmiştir.");
	}
	
	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getDiscount() + "indirim olarak güncellenmiştir.");
	}
	

}

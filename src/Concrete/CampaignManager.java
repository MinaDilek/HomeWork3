package Concrete;
import Abstract.CampaignService;
import Property.Campaign;

public class CampaignManager implements CampaignService {
	
	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + ", Adlý kampanyamýz baþlamýþtýr.");
	}
	
	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getTime() +"süreli" +campaign.getCampaignName()+"isimli kampanyamýzýn süresi bitmiþtir.");
	}
	
	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getDiscount() + "indirim olarak güncellenmiþtir.");
	}
	

}

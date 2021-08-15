package Concrete;
import Abstract.CampaignService;
import Property.Campaign;

public class CampaignManager implements CampaignService {
	
	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + ", Adl� kampanyam�z ba�lam��t�r.");
	}
	
	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getTime() +"s�reli" +campaign.getCampaignName()+"isimli kampanyam�z�n s�resi bitmi�tir.");
	}
	
	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getDiscount() + "indirim olarak g�ncellenmi�tir.");
	}
	

}

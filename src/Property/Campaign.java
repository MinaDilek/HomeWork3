package Property;

public class Campaign {
	
	String campaignName;
	int time;
	int discount;
	public Campaign(String campaignName, int time, int discount) {
		super();
		this.campaignName = campaignName;
		this.time = time;
		this.discount = discount;
	}

	public Campaign() {};
	
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	

}

package basic_SpringBoot;

public class Platinum implements CreditCard {

	@Override
	public String getCardType() {
		// TODO Auto-generated method stub
		return "Platinum";
	}

	@Override
	public int getCardLimit() {
		// TODO Auto-generated method stub
		return 125000;
	}

	@Override
	public int ngetAnnualFee() {
		// TODO Auto-generated method stub
		return 2500;
	}

}

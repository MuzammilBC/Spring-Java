package basic_SpringBoot;

public class CardFactory {
	public static CreditCard getCreditCard(String cardtype) {
		CreditCard c= null;
		switch(cardtype) {
		case "MoneyBack":
			return new MoneyBank();
		case "Platinum":
		return new Platinum();
		case "Titanium":
		return new Titanium();
		default:
			return c;
		}
	}

}

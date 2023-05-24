package basic_SpringBoot2;

public class MoneyBackFactory extends CardFactory {

	@Override
	public CreditCard CreateProduct() {
		// TODO Auto-generated method stub
		return new MoneyBank();
	}

}

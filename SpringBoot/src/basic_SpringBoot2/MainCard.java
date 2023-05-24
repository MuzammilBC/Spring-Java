package basic_SpringBoot2;

import java.util.Scanner;

public class MainCard  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CreditCard ccard=null;
		System.out.println("Enter the Card Type");
		String ctype=sc.next();
		if (ctype.equals("Platinum")) {
			CardFactory cf=new Platinumfactory();
			ccard=cf.createdProduct();
		}
		else if(ctype.equals("MoneyBnak")) {
			ccard =new MoneyBackFactory().CreateProduct();
		}
		else if(ctype.equals("Titanium")) {
			ccard= new titaniumFactory().createproduct();
		}
		if(ccard!=null) {
			System.out.println("card Type:"+ccard.getCardType());
			System.out.println("card limit:"+ccard.getCardLimit());
			System.out.println("card annualFee:"+ccard.ngetAnnualFee());
		}
		else {
			System.out.println("Invalid Card Type");
		}
	}

}

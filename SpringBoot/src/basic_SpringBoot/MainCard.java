package basic_SpringBoot;

import java.util.Scanner;

public class MainCard  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Card Type");
		String cardType=sc.next();
		CreditCard c= CardFactory.getCreditCard(cardType);
		if (c!=null) {
			System.out.println("card Type :"+c.getCardType());
			System.out.println("card Limit :"+c.getCardLimit());
			System.out.println("card fee :"+c.ngetAnnualFee());
		}
	}

}

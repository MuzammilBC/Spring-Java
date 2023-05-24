package basic_SpringBoot2;

import java.util.Scanner;

public class Kia {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Model Type");
		String s=sc.next();
		
		Cars c= null;
		if(s.equals("Seltos")) {
			c=new Seltos();
		}
		else if(s.equals("Carnivel")) {
			c=new Carnivel();
		}
		else if(s.equals("Carel")) {
			c=new Carel();
		}
		if(c!=null) {
			System.out.println(c.capacity());
			System.out.println(c.Mileage());
			System.out.println(c.type());
			;
		}
		else {
			System.out.println("Bad Car");
		}
	}
}


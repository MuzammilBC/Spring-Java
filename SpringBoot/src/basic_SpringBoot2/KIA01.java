package basic_SpringBoot2;

import java.util.Scanner;

public class KIA01 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Cars c=null;
		do {
			System.out.println("Chose a Car Type");
			System.out.println("1.Sedan\n2.HatchBack\n3.SUV\n4.Exit");
			System.out.println("Enter Your Choice :[1-4]");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				c= CarFactory.getCar("sedan");
				System.out.println("Car name :"+c.getClass().getName());
				System.out.println("Car Capacity:"+c.capacity());
				System.out.println("Car Mileage :"+c.Mileage());
				System.out.println("car Type :"+c.type());
				break;
			case 2:
				c= CarFactory.getCar("HactcBack");
				System.out.println("Car name :"+c.getClass().getName());
				System.out.println("Car Capacity:"+c.capacity());
				System.out.println("Car Mileage :"+c.Mileage());
				System.out.println("car Type :"+c.type());
				break;
			case 3:
				c= CarFactory.getCar("SUV");
				System.out.println("Car name :"+c.getClass().getName());
				System.out.println("Car Capacity:"+c.capacity());
				System.out.println("Car Mileage :"+c.Mileage());
				System.out.println("car Type :"+c.type());
				break;
			case 4:
				default:
					System.out.println("Invalid Chice");
				
			}
		
		}while(true);
	}
}

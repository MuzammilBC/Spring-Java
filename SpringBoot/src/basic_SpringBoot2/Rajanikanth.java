package basic_SpringBoot2;

public class Rajanikanth {
	private static Rajanikanth r= null;
	static int count=0;
	private Rajanikanth() {
		count++;
	}

	public static Rajanikanth getInstance() {
		if(r==null) {
			r=new Rajanikanth();
			return r;
			
		}
		else {
			return r;
		}
	}
	void eat() {
		System.out.println("Rajanikanth eat");
	}
	void act() {
		System.out.println("Rajanikanth act");
	}
	void sleep() {
		System.out.println("sleep");
	}
	void run() {
		System.out.println("Rajanikanth run");
	}
	
}

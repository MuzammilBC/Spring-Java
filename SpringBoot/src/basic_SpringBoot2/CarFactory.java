package basic_SpringBoot2;

public class CarFactory {
static Cars c=null;
public static Cars getCar(String cartype) {
	
	if(cartype.equals("sedan")) {
		c=new Carnivel();
		Carnivel ca=(Carnivel)c;
		return ca;
	}
	else if(cartype.equals("HactcBack")) {
		c=new Seltos();
		Seltos ca=(Seltos)c;
		return ca;
		
	}
	else if(cartype.equals("SUV")) {
		c=new Carel();
		Carel ca=(Carel)c;
		return ca;
		
	}
	else {
		return c;
	}
	
}
}

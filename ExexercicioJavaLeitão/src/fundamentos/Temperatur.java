package src.fundamentos;

public class Temperatur {

	public static void main(String[] args) {
		// ( °F - 32) x 5/9 = °C
		
		final double fator = 5.0 / 9.0;
		final double ajuste = 32;
		 
		double fahrenheit = 86;
		double celsius = (fahrenheit - ajuste) * fator;
		System.out.println("O resultado é " + celsius + " ° C." );
		
				
		double fahrenheit1 = 0;
		double celsius1 = (fahrenheit1 - ajuste) * fator;
		System.out.println("O resultado é " + celsius1 + " ° C." );
	}
	
}

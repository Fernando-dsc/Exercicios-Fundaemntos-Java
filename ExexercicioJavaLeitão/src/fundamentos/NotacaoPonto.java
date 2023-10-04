package src.fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X";
		s = s.replace ("X", "Senhora"); // outra maneira de fazer 
		s = s.toUpperCase (); // deixa tudo com letra maíuscula
		s = s.concat ("!!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia x"
				.replace ("X", "Gui");
		s = s.toUpperCase (); 
		s = s.concat ("!!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador " . "
		int c = 3;
		System.out.println(c);
		
	}
}

package n2exercici1;

public class Principal {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(Entrada.introduirInt("Introdueix el teu nom"));
			
		}catch(Exception e) {
			
			System.err.println(e + ". Error de format");
			
		}
		
	}
	
}

package n1exercici1;

public class VendaBuidaException extends Exception{
	
	private String missatge;
	
	public VendaBuidaException(){
		
		missatge = "Per fer una venda, primer has d'afegir productes.";
		
	}
	
	public String getMessage(){
		
		return missatge;
		
	}

}

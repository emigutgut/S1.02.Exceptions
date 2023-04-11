package n1exercici1;

public class Venda {
	
	Producte productes[] = new Producte[4];
	double preuTotal = 0;
	
	Venda(Producte productes[]) {
		
		this.productes = productes;
		
	}
	
	void calcularTotal() throws VendaBuidaException{
			
		for (int i=0; i<productes.length; i++) {
			
			if(this.productes[i] == null) {
				
				throw new VendaBuidaException();
				
			}else {
				
				preuTotal += productes[i].preu;
				
			}
			
		}
		
		System.out.println("El preu total es de " + preuTotal + "€.");
			
	}		
		
}
	


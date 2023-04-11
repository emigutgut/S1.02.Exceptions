 package n1exercici1;

public class Principal {
	
	public static void main(String[] args) {
		
		try {
			
			Producte productes[] = new Producte[4];
			
			Producte balon = new Producte("balon", 50.0);
			Producte camiseta = new Producte("camiseta", 50.0);
			Producte pantalon = new Producte("pantalón", 50.0);
			Producte guantes = new Producte("guantes", 50.0);
			Producte porteria = new Producte("porteria", 500.0);
			
			/*productes[0] = balon;
			productes[1] = camiseta;
			productes[2] = pantalon;
			productes[3] = guantes;
			productes[4] = porteria;*/
			
			Venda novaVenda = new Venda(productes);
			novaVenda.calcularTotal();
			
			
		}catch(VendaBuidaException e) {
			
			System.err.println(e.getMessage());
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.err.println("Error en el nombre de elements.");
			
		}

	}

}

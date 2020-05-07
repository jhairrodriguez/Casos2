package casos2;
import java.util.Scanner;

public class caso15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cliente: ");
		String cliente = sc.nextLine();
		
		System.out.print("Producto <TB,LT;MN,IM: ");
		String producto = sc.nextLine();
		
		System.out.print("Cantida : ");
		String cantidad = sc.nextLine();
		
		System.out.print("Pago <C1/C2>: ");
		String forma = sc.nextLine();
		
		sc.nextLine();
		
		// Continuar con las otras lecturas
		
		// Procesar
		
		String producto_mayuscula = "", forma_mayuscula = "";
		float valor = 0, dscto = 0;

		switch (producto) {
			case "TB":
				producto_mayuscula = "Tableta";
				valor = 350;
				break;
		}
				
		switch (forma) {
			case "C1":
				forma_mayuscula = "Al contado";
				dscto = 0.05f; 
				break;
		}
	
		
		System.out.println(">>> RESULTADOS <<<");
		System.out.println("Cliente   :........" + cliente);
		System.out.println("Producto  :........" + producto_mayuscula);
		System.out.println("Presio   :........" + valor);
		System.out.println("Cantidad   :........" + cantidad);
		System.out.println("Forma de Pago    :........" + forma_mayuscula);
		System.out.println("Descuento   :........" );
		System.out.println("Total a pagar   :........" );
						}
					}

				

		
		
	

	
		
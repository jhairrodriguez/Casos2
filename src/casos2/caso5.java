package casos2;
import java.util.Scanner;

public class caso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out.print("Ingrese precio: ");
		float precio = sc.nextFloat();
		
		float total = cantidad * precio;
		float dscto = 0;
		
		if (cantidad > 8)
			dscto = (float) 0.1 * total;
		
		System.out.println("<<< RESULTADOS >>>");
		System.out.println("Importe......: " + total);
		System.out.println("Descuento....: " + dscto);
		System.out.println("Total........: " + (total - dscto));
	}

}

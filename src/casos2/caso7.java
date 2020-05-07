package casos2;
import java.util.Scanner;
public class caso7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese sueldo: ");
		float sueldo = sc.nextFloat();
		
		float impuesto = 0;
		
		if (sueldo <= 1500)
			impuesto = (float) 0.03 * sueldo;
		else if (sueldo <= 3000)
			impuesto = (float) 0.08 * sueldo;
		else
			impuesto = (float) 0.12 * sueldo;
		
		System.out.println("Impuesto: " + impuesto);
	}

}

package casos2;
import java.util.Scanner;

public class caso11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		String dia = "";
		
		switch (n) {
			case 1:
				dia = "Domingo"; break;
			case 2:
				dia = "Lunes"; break;
			case 3:
				dia = "Martes"; break;
			default:
				dia = "Día desconocido";
		}
		System.out.println("Día: " + dia);
	}
}
	

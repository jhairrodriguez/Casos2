package casos2;
import java.util.Scanner;

public class caso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número 1: ");
		int n1 = sc.nextInt();
		System.out.print("Ingrese número 2: ");
		int n2 = sc.nextInt();
		
		if (n1 == n2) { // ALT + 123
			System.out.println("Los números son iguales");
		} // ALT + 125
		else {
			if (n1 > n2) {
				System.out.println("El primer número es mayor");
			}
			else {
				System.out.println("El segundo número es mayor");
			}
		}
	}
}

package casos2;
import java.util.Scanner;
public class caso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int edad = 0;
		
		System.out.print("Ingrese edad: ");
		edad = sc.nextInt();
		
		if (edad >= 18)
			System.out.print("Mayor de edad");
		else 
			System.out.print("Menor de edad");
	}

}

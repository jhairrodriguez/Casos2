package casos2;
import java.util.Scanner;

public class caso12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Empleado: ");
		String empleado = sc.nextLine();
		
		System.out.print("Nivel [1-4]: ");
		int nivel = sc.nextInt();
		
		System.out.print("Sueldo: ");
		float sueldo = sc.nextFloat();
		
		float inc = 0;
		switch (nivel) {
			case 1:
				inc = 0.045f; break;
			case 2:
				inc = 0.06f; break;
		}
		
		float nuevosueldo = sueldo * (1 + inc);

	}

}

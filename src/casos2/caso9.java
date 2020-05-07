package casos2;
import java.util.Scanner;
public class caso9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Mark = new Scanner(System.in);
		
		String alumno = "";
		int nota1 = 0, nota2 = 0;
		float asistencia = 0;
		
		System.out.println("INGRESE NOMBRE DE ALUMNO:  ");
		alumno = Mark.nextLine();
		
		System.out.println("INGRESE PRIMERA NOTA :  ");
		nota1 = Mark.nextInt();
		
		System.out.println("INGRESE SEGUNDA NOTA  : ");
		nota2 = Mark.nextInt();
		
		System.out.println("INGRESE NUMEROS DE ASISTENCIAS ");
		asistencia =  Mark.nextFloat();
		
		float PROMEDIO = 0;
 		
		 if ( nota1 <= 13) 
			 PROMEDIO = nota1 + nota2;
		 else 
			if (nota1 >= 12)
		 	PROMEDIO = nota1 + nota2;
			if ( nota2 <= 13)
				PROMEDIO = nota1 + nota2;
			else
				if (nota2 >= 12)
					PROMEDIO = nota1+ nota2;
	
			System.out.println("PROMEDIO ES: " + PROMEDIO / 2);

	}

}

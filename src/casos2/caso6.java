package casos2;

import java.util.Scanner;

public class caso6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Mark1 = new Scanner(System.in);

		System.out.print("INGRESE SUELDO:  ");
		float SUE = Mark1.nextFloat();
		
		float imp1 =  (float) (SUE * 0.05);
		float imp2 = (float) (SUE * 0.02);
		
		
		if (SUE > 2800)
			SUE = imp1;
			else
				SUE= imp2;
		
		System.out.println("***RESULTADOS***");
		System.out.println("RESULTADO CALCULADO::" + SUE);

	}

}

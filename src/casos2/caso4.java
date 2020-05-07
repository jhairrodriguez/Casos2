package casos2;

import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Mark1 = new Scanner(System.in);
		
		System.out.print("INGRESE PRIMER NÙMERO :  ");
		int N1 = Mark1.nextInt();
		System.out.print("INGRESE SEGUNDO NÙMERO:  ");
		int N2 = Mark1.nextInt();

		if (N1 <= N2 )
			System.out.println("EL PRIMER NUMERO ES MENOR");
		else
			System.out.println("EL SEGUNDO NUMERO ES MENOR");
	}

}

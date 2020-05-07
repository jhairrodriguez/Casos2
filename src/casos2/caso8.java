package casos2;

import java.util.Scanner;

public class caso8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Mark1 = new Scanner(System.in);
		
		System.out.println("INGRESE NOTA: ");
		int NOTE = Mark1.nextInt();
		
		if (NOTE <= 7) 
			System.out.println("*SIN PALABRAS*");
		else
			if (NOTE <= 10) 
				System.out.println("**MALO**");
			else
				if ( NOTE <= 14)
					System.out.println("***REGULAR***");
				else
					if (NOTE <= 17)
						System.out.println("*****NOTABLE****");
					else
						if (NOTE <= 20) 
							System.out.println("*****EXCELENTE*****");

	}

}

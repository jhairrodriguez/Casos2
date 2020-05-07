package casos2;
import java.util.Scanner;
public class caso14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Alumno: ");
		String alumno = sc.nextLine();
		
		System.out.print("Carrera <DS/RC/DG>: ");
		String carrera = sc.nextLine();

		System.out.print("Turno <M/T/N>: ");
		String turno = sc.nextLine();
		
		sc.nextLine();
		
		// Continuar con las otras lecturas
		
		// Procesar
		String nombre_carrera = "", nombre_turno = "";
		float monto = 0, dscto = 0, total = 0;
		
		switch (carrera) {
			case "DS":
				nombre_carrera = "Desarrollo de Software";
				monto = 1500;
				break;
		}
		
		switch (turno) {
			case "M":
				nombre_turno = "Mañana";
				dscto = 0.1f;
				break;
		}
		
		System.out.println(">>> RESULTADOS <<<");
		System.out.println("Alumno   :........" + alumno);
		System.out.println("Carrera  :........" + nombre_carrera);
		System.out.println("Turno    :........" + nombre_turno);
	}

}

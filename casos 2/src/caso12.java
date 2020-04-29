import java.util.Scanner;
public class caso12 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int nivel;
		float sueldo, incremento = 0 ,nuevosueldo;
		System.out.println("Ingrese su nombre: ");
		String empleado = obj.next();
		System.out.println("Ingrese el nivel entre 1 - 4 :");
		nivel = obj.nextInt();
		System.out.println("ingrese su sueldo:");
		sueldo = obj.nextFloat();
		
		
		switch (nivel) {
		case 1:
			incremento = 0.045f;
			break;
		case 2:
			incremento = 0.06f;
			break;
		case 3:
			incremento = 0.085f;
			break;
		case 4:
			incremento = 0.11f;
			break; 
			default: 
				incremento = 0;
		}
		 nuevosueldo = sueldo*(1 + incremento);
		 System.out.println("Sueldo final: "+ nuevosueldo);

	}

}

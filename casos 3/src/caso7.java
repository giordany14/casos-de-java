import java.util.Scanner;
public class caso7 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Ingrese un nombre: ");
		String nombre = obj.next();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("Bienvenido "+ nombre+ " al curso" );
		}
			

	}

}

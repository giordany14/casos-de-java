import java.util.Scanner;
public class caso2 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n;
		String rpta = "Numero impar";
		System.out.println("introduce un numero: ");
		n = obj.nextInt();
		if (n%2 == 0) {
			rpta = "Numero par";
		}
		System.out.println("Respuesta: "+rpta);

	}

}

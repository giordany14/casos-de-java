import java.util.Scanner;
public class caso2 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int c = 1, num, suma = 0 ;
		System.out.println("Ingrese un numero:");
		num = obj.nextInt();
		
		while (c <= num) {
		suma += c;
		
		c++;
		}
		System.out.println("La sumatoria de: "+num+" es: "+ suma);
	}

}

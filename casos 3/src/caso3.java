import java.util.Scanner; // Mauricio Bobadilla Alfredo Giordany
public class caso3 {

	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		int c = 1, num, factorial = 1;
		System.out.print("ingrese un numero: ");
		num = obj.nextInt();
		
		if (num <= 7) {
			while (num <= 7 && c <= num) {
				factorial = factorial * c;
				
				c ++;
			}
			System.out.println("El factorial de "+num+" es: "+ factorial);
		}
		else {
			System.out.println("numero fuera de rango");
		}
		

	}

}

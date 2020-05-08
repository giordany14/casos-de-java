import java.util.Scanner; // Mauricio Bobadilla Alfredo Giordany
public class caso4 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num, num_mayor, c;
		c = 1;
		num_mayor = 0;
		while (c <= 4) {
			System.out.println("Ingrese numero "+ c+ ": ");
			num = obj.nextInt();
			if (num>num_mayor) {
				num_mayor = num;
			}
			c++;
		}
		System.out.println("El numero mayor es: "+ num_mayor);

	}

}

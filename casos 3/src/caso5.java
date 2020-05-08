import java.util.Scanner; // Mauricio Bobadilla Alfredo Giordany
public class caso5 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num, num_menor, c;
		c = 1;
		num_menor = 999;
		while (c <= 5) {
			System.out.println("Ingrese numero "+ c+ ": ");
			num = obj.nextInt();
			if (num<num_menor) {
				num_menor = num;
			}
			c++;
		}
		System.out.println("El numero menor es: "+ num_menor);

	}

}

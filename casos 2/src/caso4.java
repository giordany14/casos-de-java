import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		int n1, n2;
		System.out.println("primer numero:");
		n1 = obj.nextInt();
		System.out.println("segundo numero:");
		n2=obj.nextInt();
		if (n1 == n2) {
			System.out.println("los numeros son iguales.");
		}
		else {
			if(n1<n2) {
				System.out.println("el primer numero es menor.");
			}
			else {
				System.out.println("el segundo numero es menor.");
			}
		}

	}

	}



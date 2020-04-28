import java.util.Scanner;
public class caso1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int edad;
		System.out.println("introduce su edad: ");
		edad = obj.nextInt();
		
		if (edad >= 18) {
			System.out.println("mayor de edad");
		}
		else {
			System.out.println("menor de edad");
		}
			
		

	}

}

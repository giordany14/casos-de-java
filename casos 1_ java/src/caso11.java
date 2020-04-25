import java.util.Scanner;
public class caso11 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("ingresa un nombre:");
		String nombre = obj.nextLine();
		
		System.out.println("---RESULTADO---");
		System.out.println("nombre: "+ nombre);
		System.out.println("nomero de caracteres: "+ nombre.length());

	}

}

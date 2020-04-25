import java.util.Scanner;
public class caso13 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = obj.next();
		System.out.print("Introduce tu apellido: ");
		String apellido = obj.next();
		
		System.out.println("---RESULTADOS---");
		
		System.out.println("alumno: "+nombre+" "+apellido);

	}

}

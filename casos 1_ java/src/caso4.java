import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		// instancia
		Scanner sc = new Scanner(System.in);
		// Definir variables
		float n1 = 0;
		float n2 = 0;
		System.out.println("primer numero" );
		n1 = sc.nextFloat();
		System.out.println("segundo numero" );
		n2 = sc.nextFloat();
		
		float suma, resta, producto, division, resto;
		suma = n1+ n2;
		resta=  n1-n2;
		producto = n1 * n2;
		division = n1/ n2;
		resto = n1%n2;
		
		System.out.println("---Resultados---");
		System.out.println("suma: "+suma);
		System.out.println("resta: "+resta);
		System.out.println("producto: "+producto);
		System.out.println("division: "+division);
		System.out.println("resto: "+resto);
		}
	
}

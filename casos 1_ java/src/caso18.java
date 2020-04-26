import java.util.Scanner;

public class caso18 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		int base, altura, area;
		System.out.println("Escribe la base del triangulo:");
		base = obj.nextInt();
		System.out.println( "EScribe la altura del triangulo: ");
		altura = obj.nextInt();
		
		area = (base* altura)/2;
		
		System.out.println("---RESULTADOS---");
		System.out.println("El area del triangulo es: "+ area);

	}

}

import java.util.Scanner;

public class caso19 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a, b, c, perimetro;
		System.out.println("Introduce los lados de tu triangulo.");
		System.out.println("Introduce el Primer lado:");
		a = obj.nextInt();
		System.out.println("Introduce el Segundo lado:");
		b = obj.nextInt();
		System.out.println("Introduce el Tercer lado:");
		c = obj.nextInt();
		
		perimetro = a + b + c;
		System.out.println("---RESULTADOS---");
		System.out.println("El perimetro de tu triangulo es: "+ perimetro);

	}

}

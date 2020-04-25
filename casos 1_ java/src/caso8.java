import java.util.Scanner;
public class caso8 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int lado;
		System.out.println("ingrese lado del cuadrado: ");
		lado = obj.nextInt();
		
		int area, perimetro;
		area = lado * lado;
		perimetro = lado * 4;
		
		System.out.println("---RESULTADO---");
		System.out.println("area: "+ area);
		System.out.println("perimetro: "+ perimetro);

	}

}

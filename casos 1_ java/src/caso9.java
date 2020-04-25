import java.util.Scanner;
public class caso9 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int base, altura, area, perimetro;
		
		System.out.println("introduce los siguientes valores: ");
		System.out.println("introduce la base: ");
		base = obj.nextInt();
		System.out.println("introduce la altura: ");
		altura = obj.nextInt();
		
		area = base * altura;
		perimetro = (base*2)+(altura*2);
		
		System.out.println("---RESULTADOS---");
		
		System.out.println("El area fue de: "+ area);
		System.out.println("El perimetro fue de: "+ perimetro);
		
	}

}

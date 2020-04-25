import java.util.Scanner;
public class caso10 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		float radio,dato,area,perimetro;
		System.out.println("Introduce el radio del circulo: ");
		radio = obj.nextFloat();
		dato = (float) 3.1416;
		
		area = (float) (dato*(Math.pow(radio, 2)));
		perimetro = (float) 2*dato*radio;
		
		System.out.println("----RESULTADOS----");
		System.out.println("El area del circulo es: "+ area);
		System.out.println("El perimetro del circulo es: "+ perimetro);
		
		

	}

}

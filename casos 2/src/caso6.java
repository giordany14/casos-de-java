import java.util.Scanner;
public class caso6 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		float sueldo, impuesto, total ;
		System.out.print("Introduce tu sueldo : ");
		sueldo = obj.nextFloat();
		if (sueldo > 2800) {
			impuesto = (float)(sueldo * 0.05);
		}
		else {
			impuesto = (float)(sueldo * 0.02);
		}
		total = sueldo - impuesto ;
		System.out.println("---RESULTADOS---");
		System.out.println("Impuesto: "+ impuesto);
		System.out.println("Sueldo final: "+ total);

	}

}

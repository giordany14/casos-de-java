import java.util.Scanner;
public class caso7 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		float sueldo, impuesto , total;
		System.out.print("Introduce su sueldo: ");
		sueldo = obj.nextFloat();
		impuesto = 0;
		if (1500 > sueldo) {
			impuesto = (float)(sueldo * 0.03);
		}
		else {
			if (3000 > sueldo && sueldo > 1500) {
				impuesto = (float)(sueldo * 0.08);
			}
			else {
				if (sueldo > 3000) {
					impuesto = (float)(sueldo * 0.12);
				}
			}
		}
		total = sueldo - impuesto;
		System.out.println("---RESULTADOS---");
		System.out.println("Impuestos: "+ impuesto);
		System.out.println("Sueldo Final: "+ total);

	}

}

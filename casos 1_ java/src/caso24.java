import java.util.Scanner;
import java.text.DecimalFormat;
public class caso24 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		DecimalFormat T= new DecimalFormat("#.00");
		float m1,m2,m3,rpt1,rpt2,rpt3, total, reduccion;
		System.out.println("introduzca 3 montos.");
		System.out.println("Primer monto: ");
		m1 = obj.nextInt();
		System.out.println("Segundo monto: ");
		m2 = obj.nextInt();
		System.out.println("Tercer monto: ");
		m3 = obj.nextInt();
		
		rpt1 = (float)((m1 / 5)+ (m2 * 0.2));
		rpt2 = (float)( (m3 * 1.60)/ 2);
		total = m1 + m2 + m3;
		reduccion = (float)(total * 0.08);
		rpt3 = (float)( total - reduccion);
		
		System.out.println("---RESULTADOS---");
		System.out.println("La prta 1 es: " + T.format(rpt1));
		System.out.println("La prta 2 es: " + T.format(rpt2));
		System.out.println("La prta 3 es: " + T.format(rpt3));

	}

}

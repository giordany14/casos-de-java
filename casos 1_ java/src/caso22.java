import java.util.Scanner;
import java.text.DecimalFormat;
public class caso22 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		DecimalFormat T= new DecimalFormat("#.00");
		float n1,n2,n3, promedio; 
		System.out.println("Introduce tu nombre:");
		String nombre = obj.next();
		System.out.println("introduce las notas.");
		System.out.println("Nota 1:");
		n1 = obj.nextFloat();
		System.out.println("Nota 2:");
		n2 = obj.nextFloat();
		System.out.println("Nota 3:");
		n3 = obj.nextFloat();
		
		promedio = (float)((n1 * 0.20)+ (n2 * 0.30)+ (n3*0.50));
		System.out.println("---RESULTADOS---");
		System.out.println("El alumno: "+nombre+ " obtuvo el siguiente promedio.");
		System.out.println("Promedio obtenido es: "+ T.format(promedio));

	}

}

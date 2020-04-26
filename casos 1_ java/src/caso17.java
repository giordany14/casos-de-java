import java.util.Scanner;
import java.text.DecimalFormat;
public class caso17 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		DecimalFormat T= new DecimalFormat("#.00");
		float aprobados,desaprobados,retirados;
		System.out.println("Numero de aprobados: ");
		aprobados = obj.nextFloat();
		System.out.println("Numero de desaprobados: ");
		desaprobados = obj.nextFloat();
		System.out.println("Numero de retirados: ");
		retirados = obj.nextFloat();
		
		float total,porcentaje_A,porcentaje_B,porcentaje_C;
		total = aprobados+desaprobados+retirados;
		
		porcentaje_A = (aprobados/total)*100;
		porcentaje_B = (desaprobados/total)*100;
		porcentaje_C = (retirados/total)*100;
		
		System.out.println("---RESULTADOS---");
		
		System.out.println("Aprobados: "+ T.format(porcentaje_A)+"%");
		System.out.println("Desaprobados: "+ T.format(porcentaje_B)+"%");
		System.out.println("Retirados: "+ T.format(porcentaje_C)+"%");

	}

}

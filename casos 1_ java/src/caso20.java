import java.util.Scanner;
import java.text.DecimalFormat;
public class caso20 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		DecimalFormat T= new DecimalFormat("#.00");
		float venta, incremento,resultado;
		System.out.println("introduza el valor de la venta:");
		venta = obj.nextFloat();
		incremento = (float)(venta * 0.42);
		resultado = incremento + venta;
		System.out.println("--RESULTADO--");
		System.out.println("El incremento de tu venta es: "+ T.format(resultado));
		

	}

}

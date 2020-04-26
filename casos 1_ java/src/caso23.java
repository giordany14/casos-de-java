import java.util.Scanner;
import java.text.DecimalFormat;
public class caso23 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		DecimalFormat T= new DecimalFormat("#.00");
		float precio,cantidad, IGV , descuento, total;
		System.out.println("Ingrese el nombre del producto:");
		String nombre_P = obj.next();
		System.out.println("Introduce el Precio ");
		precio = obj.nextFloat();
		System.out.println("Introduzca la cantidad:");
		cantidad = obj.nextFloat();
		IGV = (float)(precio * 0.18);
		descuento = (float)(precio * 0.03);
		total = precio -(descuento + IGV);
		
		System.out.println("--RESULTADOS--");
		System.out.println("El IGV fue de: "+ T.format(IGV));
		System.out.println("El descuento fue de: "+ T.format(descuento));
		System.out.println("El total del producto '"+ nombre_P+ "' es de: "+ T.format(total));

	}

}

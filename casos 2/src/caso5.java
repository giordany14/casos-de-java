import java.util.Scanner;

public class caso5 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		float precio, cantidad, descuento, total , neto;
		System.out.print("Introduce el precio: ");
		precio = obj.nextFloat();
		System.out.print("Introduce la cantidad: ");
		cantidad = obj.nextFloat();
		total = precio * cantidad;
		if (cantidad > 8) {
			descuento = (float)(total * 0.1);
		}
		else {
			descuento = 0;
		}
		neto = (float)(total - descuento);
		System.out.println("---RESULTADOS---");
		System.out.println("Total: " +total);
		System.out.println("Descuento: "+ descuento);
		System.out.println("Neto: "+ neto);
		
	
	}

}

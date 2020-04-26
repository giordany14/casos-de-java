import java.util.Scanner;
import java.text.DecimalFormat;
public class caso15 {

	public static void main(String[] args) {
		DecimalFormat text= new DecimalFormat("#.00");
		Scanner obj = new Scanner(System.in);
		float cantidad,precio,importe,dolar, euro;
		System.out.println("Introduce una cantidad: ");
		cantidad = obj.nextFloat();
		System.out.println("Introduce el precio: ");
		precio = obj.nextFloat();
		
		importe = cantidad * precio;
		
		dolar = (float)(importe/3.24);
		euro = (float)(importe/3.75);
		System.out.println("---Resultado---");
		
		System.out.println("El importe fue de: "+ text.format(importe));
		System.out.println("En dolares: "+ text.format(dolar));
		System.out.println("En euros: "+ text.format(euro)) ;
		
		
		
		

	}

}

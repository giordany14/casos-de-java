import java.util.Scanner;
public class caso15 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		float cantidad,precio,importe,dolar, euro;
		System.out.println("Introduce una cantidad: ");
		cantidad = obj.nextFloat();
		System.out.println("Introduce el precio: ");
		precio = obj.nextFloat();
		
		importe = (float)(cantidad * precio);
		
		

	}

}

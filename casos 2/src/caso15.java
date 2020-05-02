import java.util.Scanner;

public class caso15 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String cliente, producto, forma_p, nombre_p, nombre_pago = " ";
		String boleta = null;
		int cantidad, precio, importe;
		float descuento = 0, incremento = 0 , des_in = 0, total = 0;
		System.out.print("Ingrese cliente: ");
		cliente = obj.next();
		System.out.print("Ingrese producto(TB/LT/MN/IM): ");
		producto = obj.next();
		System.out.print("Ingrese cantidad: ");
		cantidad = obj.nextInt();
		System.out.print("Ingrese forma de pago (C1/C2): ");
		forma_p = obj.next();
		
		switch (producto){
		case "TB":
			precio = 350;
			nombre_p = "tablet";
			break;
		case "LT":
			precio = 2300 ;
			nombre_p = "laptop";
			break;
		case "MN":
			precio = 850;
			nombre_p = "monitor";
			break;
		case "IM":
			precio = 680;
			nombre_p = "tablet";
			break;
			default:
				precio = 0;
				nombre_p = "nulo";
		}
		importe = precio * cantidad;
		
		switch (forma_p) { 
		case "C1":
			descuento = (float)(importe * 0.05);
			nombre_pago = "contado";
			des_in = descuento;
			boleta = "Descuento";
			total = importe - descuento;
			break;
		case "C2":
			incremento = (float)(importe * 0.12);
			nombre_pago = "credito";
			des_in = incremento;
			boleta = "Incremento";
			total = importe + incremento;
			break;
			default:
				descuento = 0;
				incremento = 0;
		}
		System.out.println("---RESULTADOS---");
		System.out.println("Cliente: "+ cliente);
		System.out.println("Producto: "+ nombre_p);
		System.out.println("Precio: "+ precio);
		System.out.println("Cantidad: "+ cantidad);
		System.out.println("importe: "+ importe);
		System.out.println("Forma de pago: "+ nombre_pago);
		System.out.println(boleta+": "+des_in);
		System.out.println("total a pagar: "+ total);


	}

}

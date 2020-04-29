import java.util.Scanner;
public class caso11 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int numero_dia;
		System.out.println("Ingrese un numero  entre 1 - 7 :");
		numero_dia = obj.nextInt();
		
		String nombre_dia = "";
		
		switch (numero_dia) {
		case 1:
			nombre_dia = "Domingo";
			break;
		case 2:
			nombre_dia = "Lunes";
			break;
		case 3:
			nombre_dia = "martes";
			break;
		case 4:
			nombre_dia = "miercoles";
			break; 
		case 5:
			nombre_dia = "jueves";
			break;
		case 6:
			nombre_dia = "viernes";
			break;
		case 7:
			nombre_dia = "sabado";
			break;
			default:
				nombre_dia = "dia desconocido";
				
		}
		System.out.println("Dia: "+ nombre_dia);

	}

}

import java.util.Scanner; // Mauricio Bobadilla Alfredo Giordany
public class caso6 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int edad= 0, c, botan;
		String continuar ="S", nombre= " ", estado= " ";
		botan = 0;
		c = 0;
		
		while (continuar.equals("S")  ||  continuar.equals("s")) {
			c++;
			System.out.println("Reguistro numero "+ c);
			System.out.println("=====================");
			System.out.print("Nombre del participante: ");
			nombre = obj.next();
			System.out.print("Edad: ");
			edad = obj.nextInt();
			if (edad < 18) {
				estado = "menor de edad";
			}
			else {
				estado = "Apto a botar";
				botan++;
			}
			System.out.println("Estado del participante: "+ estado);
			obj.nextLine();
			System.out.println("Desea continuar <N/S>?: ");
			continuar = obj.next();
			
		}
		
		System.out.println("RESUMEN");
		System.out.println("========");
		System.out.println("Numero de Registrados: "+ c);
		System.out.println("Aptos a botar: "+ botan);
		

	}

}

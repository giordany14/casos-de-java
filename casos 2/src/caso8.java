import java.util.Scanner;
public class caso8 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int nota;
		System.out.print("Ingrese un numero: ");
		nota = obj.nextInt();
		String mensaje = " ";
		if (7 >= nota && nota >= 0) {
			mensaje = "Sin palabras";
		}
		else {
			if (10 >= nota && nota >= 8) {
				 mensaje = "Malo";
			}
			else {
				if (14 >= nota && nota>=11) {
					 mensaje = "Regular";
				}
				else {
					if (17 >= nota && nota >= 15) {
						 mensaje = "Notable";
					}
					else {
						if(20 >= nota && nota >= 18) {
							 mensaje = "Excelente";
						}
						else { 
							if (nota > 20 || nota < 0 ) {
								 mensaje = "No contiene ningun estado";
							}
						}
					}
				}
			}
		}
		System.out.println("---RESULTADO---");
		System.out.println("Estado contenido: "+ mensaje);

	}

}

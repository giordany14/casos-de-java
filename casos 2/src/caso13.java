import java.util.Scanner; //Mauricio Bobadilla ALfredo Giordany
public class caso13 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n1, n2, opc;
		System.out.println("Ingrese numero 1:");
		n1 = obj.nextInt();
		System.out.println("Ingrese numero 2:");
		n2 = obj.nextInt();
		System.out.println("Ingrese operacion (1 - 6):");
		opc = obj.nextInt();
		float respuesta;
		String operacion = "";
		switch (opc) {
		case 1:
			operacion = "Suma";
			respuesta = n1+ n2;
			 break;
		case 2:
			operacion = "Resta";
			if (n1>n2) {
				respuesta = n1-n2;
			}
			else {
				respuesta = n2 - n1;
			}
			break;
		case 3:
			operacion = "Multiplicacion";
			respuesta = n1* n2;
			break;
		case 4:
			operacion = "Division";
			if (n1>n2) {
				respuesta = n1/n2;
			}
			else {
				respuesta = n2 / n1;
			}
			break;
		case 5:
			operacion = "Resto";
			if (n2> 0 && n1> n2) {
				respuesta = n1 % n2;
			}
			else {
				respuesta  = n2 % n1;
			}
			break;
		case 6:
			operacion = "promedio";
			respuesta = (n1 + n2)/ 2;
			break;
			default:
				respuesta = 0;
		}
		System.out.println("--RESULTADO--");
		System.out.println("Numero 1 ....: "+ n1);
		System.out.println("Numero 2 ....: "+ n2);
		System.out.println("Operacion ....: "+ operacion);
		System.out.println("Resultado ....: "+ respuesta);
		
			

	}

}

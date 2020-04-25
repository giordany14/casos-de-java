import java.util.Scanner;
public class caso5 {

	public static void main(String[] args) {
		// instancia
		Scanner sc = new Scanner(System.in);
		// Definir variables
		float num1 = 0, num2 = 0;
		System.out.println("primer numero: " );
		num1 = sc.nextFloat();
		System.out.println("segundo numero: listo" );
		num2 = sc.nextFloat();
		
		float promedio,aumento,disminuido;
		
		promedio = (num1 + num2)/2;
		
		aumento = (float)(num1 * 1.2);
		
		disminuido = (float)(num2 * 0.7);//aplicar casting

		System.out.println("---RESULTADO---");
		System.out.println("promedio: "+promedio);
		System.out.println("numero 1 aumento en 20%: "+aumento);
		System.out.println("numero 2 disminuido en 30%: "+disminuido);

	}

}

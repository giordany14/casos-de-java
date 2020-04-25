import java.util.Scanner;
public class caso14 {

	public static void main(String[] args) {
		
		Scanner obj= new Scanner(System.in);
		int N, resultado;
		System.out.println("Introdusca un numero: ");
		N = obj.nextInt();
		
		resultado = (N*(N+1))/2;
		
		System.out.println("la sumatoria fue: "+resultado);

	}

}

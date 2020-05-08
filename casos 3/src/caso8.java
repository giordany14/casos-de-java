import java.util.Scanner;
public class caso8 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		int  num, i;
		num = 0;
		//while (!( num >= 1 || num <= 100)) aqui niegas todo 
		while ( num< 1 || num > 100) {
			System.out.print("ingrese numero: ");
			num = obj.nextInt();
			if (num< 1 || num > 100) {
				System.out.println("Numero fuera de rango, solo <1/100>");
			}
		}
		for (i = 1; i <= 15; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}

	}

}

import java.util.Scanner;
import java.text.DecimalFormat;
public class caso21 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		DecimalFormat T= new DecimalFormat("#.00");
		float gasto, disminucion,resultado;
		System.out.println("introduza el gasto:");
		gasto = obj.nextFloat();
		disminucion = (float)(gasto * 0.12);
		resultado = gasto -disminucion  ;
		System.out.println("El gasto disminuido es: "+ T.format(resultado));

	}

}

import java.util.Scanner;
import java.text.DecimalFormat;

public class caso10 {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		DecimalFormat T = new DecimalFormat("#.00");
		float  importe, bono, descuento, meta ;
		int horas_t, tarifa_h, tardanza;
		System.out.println("Ingrese los siguientes datos.");
		System.out.print("Ingrese su nombre: ");
		String nombre = obj.next();
		System.out.print("Introduce las horas trabajadas: ");
		horas_t = obj.nextInt();
		System.out.print("Introduce la tarifa por hora: ");
		tarifa_h = obj.nextInt();
		System.out.print("Introduce los minutos de tardanza: ");
		tardanza = obj.nextInt();
		
		importe = horas_t * tarifa_h;
		if(horas_t > 60) {
			bono = (float)(importe * 0.13);
		}
		else {
			bono = (float)(importe * 0.04);
		}
		if (tardanza >= 15) {
			descuento =(float)(importe * 0.03);
		}
		else {
			descuento = 0; 
		}
		meta = (float)((horas_t * 100 )/ 70);
		System.out.println("---RESULTADOS---");
		System.out.println("Trabajador: "+ nombre);
		System.out.println("Horas trabajadas: "+ horas_t);
		System.out.println("Tarifa por horas: "+ tarifa_h);
		System.out.println("Importe: "+ T.format(importe));
		System.out.println("Bono: "+ T.format(bono));
		System.out.println("Descuento: "+ descuento);
		System.out.println("Meta alcanzada: "+ meta+ "%");

	}

}

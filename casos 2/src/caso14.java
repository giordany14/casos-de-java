
import java.util.Scanner; //Mauricio Bobadilla ALfredo Giordany
import java.text.DecimalFormat;
public class caso14 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		DecimalFormat T = new DecimalFormat("#.00");
		int monto;
		float descuento, dolares, total;
		String N_carrera = "";
		String N_turno = "";
		System.out.print("Introduce tu nombre: ");
		String alumno = obj.next();
		System.out.print("Introduce tu carrera (DS, RC, DG): ");
		String carrera = obj.next();
		System.out.print("Introduce tu turno(M, T, N): ");
		String turno = obj.next();
		
		switch (carrera) {
		case "DS" :
			monto = 1500;
			N_carrera = "Desarrolo de software";
			break;
		case "RC":
			monto = 1400;
			N_carrera = " Redes y Conectividad";
			break;
		case "DG":
			monto = 1300;
	        N_carrera = "Diseño grafico";
	        break;
	        default:
	        	monto = 0;
	        	N_carrera = "nulo";
		}
		
		switch(turno) {
		case "M":
			descuento = (float)(monto * 0.1);
			N_turno = "Mañana";
			break;
		case "T":
			descuento = (float)(monto * 0.2);
			N_turno = "Tarde";
			break;
		case "N":
			descuento = (float)(monto * 0.15);
			N_turno = "Noche";
			break;
			default:
				descuento = 0;
				N_turno = "Nulo";
		}
		total = monto - descuento;
		dolares = (float)(total / 3.33);
		System.out.println("---RESULTADOS---");
		System.out.println("Monto: "+ monto);
		System.out.println("Turno: "+ N_turno);
		System.out.println("Carrera: "+ N_carrera);
		System.out.println("Descuento: "+ descuento);
		System.out.println("total: "+ total);
		System.out.println("total en dolares: "+ T.format(dolares));

	}

}

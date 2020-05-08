import java.util.Scanner;
public class caso10 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		float importe,bono , descuento , meta , neto;
		float sueldo_mayor = 0, sueldo_menor = (float)(999999999), cant_may_tar = 0;
		int horas_trabajo, tarifa_hora, tardanza, c = 0, meta_90 = 0;
		String nombre = "", continuar="S", nom_sueldo_mayor = "", nom_sueldo_menor= "", may_tar = "";
		
		while (continuar.contentEquals("S") | continuar.contentEquals("s")){
			c++;
			System.out.println("============================");
			System.out.println("REsgitro de empleados ("+c+")");
			System.out.println("============================");
			System.out.println("Trabajador: ");
			nombre = obj.next();
			System.out.println("horas trabajadas: ");
			horas_trabajo = obj.nextInt();
			System.out.println("tarifa por hora: ");
			tarifa_hora = obj.nextInt();
			System.out.println("minutos de tardanza: ");
			tardanza = obj.nextInt();
			
			importe = horas_trabajo * tarifa_hora;
			
			if (horas_trabajo <= 50) {
				bono = 0;
			}
			else {
				if(horas_trabajo <=60 && horas_trabajo > 50){
					bono = (float)(importe * 0.02);
				}
				else {
					if(horas_trabajo<=70 && horas_trabajo > 60){
						bono = (float)(importe * 0.08);
					}
					else {
						if(horas_trabajo<=80 && horas_trabajo > 70) {
							bono = (float)(importe * 0.13);
						}
						else {
							bono = (float)(importe * 0.15);
						}
					}
				}
			}
			if (tardanza <= 15) {
				descuento = 0;
			}
			else {
				if(tardanza <= 30 && tardanza > 15) {
					descuento = (float)((importe * 0.003) * tardanza);
				}
				else {
					descuento = (float)((importe * 0.005) * tardanza);
				}
			}
			if (tardanza > cant_may_tar) {
				may_tar = nombre;
				cant_may_tar = tardanza;
			}
			
			neto = (float)((importe + bono) - descuento);
			if (neto > sueldo_mayor) {
				sueldo_mayor = neto;
				nom_sueldo_mayor = nombre;
			}
			
			if (neto < sueldo_menor) {
				sueldo_menor = neto;
				nom_sueldo_menor = nombre;
			}
			
			meta = (horas_trabajo/80) * 100;
			if(meta >= 90) {
				meta_90++;
			}
			System.out.println("===========================");
			System.out.println("========Resultados=========");
			System.out.println("===========================");
			System.out.println("Sueldo bruto: "+importe);
			System.out.println("Bonificacion: "+ bono);
			System.out.println("Descuento: "+ descuento);
			System.out.println("Sueldo neto: "+ neto);
			System.out.println("% alcanzado: "+ meta+ "%");
			
			System.out.println("¿Nuevo empleado? <S/N>: ");
			continuar = obj.next();

		}
		System.out.println("===========================");
		System.out.println("==========Resumen==========");
		System.out.println("===========================");
		System.out.println("Numero de empleados: "+c);
		System.out.println("Sueldo neto mayor: "+ sueldo_mayor+"  pertenece a: "+ nom_sueldo_mayor);
		System.out.println("Sueldo neto menor: "+ sueldo_menor+"  pertenece a: "+ nom_sueldo_menor);
		System.out.println("Empleado con la mayor cantidad de minutos de tardanza: "+ may_tar+"("+cant_may_tar+" min.)");
		System.out.println("Cantidad de empleados con mas de 90% de la meta: "+meta_90);

	}

}

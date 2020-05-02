import java.util.Scanner; //Mauricio B. Giordany
public class caso9 {

	public static void main(String[] args) {
	Scanner obj= new Scanner(System.in);
	int n1, n2;
	float asistencia, porcentaje, promedio;
	String estado = "";
	System.out.print("Introduce tu nombre: " );
	String alumno = obj.next();
	System.out.println("Introduce tus notas.");
	System.out.print("Nota 1:");
	n1 = obj.nextInt();
	System.out.print("Nota 2:");
	n2 = obj.nextInt();
	System.out.println("Introduce tu asistencia");
	
	asistencia = obj.nextFloat();
	promedio = (float)(n1 * 0.3 + n2 * 0.7);
	porcentaje = (float)((asistencia/12)* 100);
	if (promedio >= 13 && porcentaje >= 70) {
		estado = "aprobado";
	}
	else {
		estado = "desaprobado";
	}
	System.out.println("---RESULTADOS---");
	System.out.println("alumno: "+ alumno);
	System.out.println("Promedio: "+ promedio);
	System.out.println("Asistencias: "+ porcentaje + "%");
	System.out.println("Estado: "+ estado);

	}

}

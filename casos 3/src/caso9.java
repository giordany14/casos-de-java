import java.util.Scanner;
public class caso9 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String alumno, continuar, estado, nom_pro_mayor, nom_pro_menor;
		int n1, n2, n3, asistencias, c, aprobado, desaprobado;
	    float promedio, porcentaje, pro_mayor, pro_menor;
	    
	    c =0;
	    aprobado = 0;
	    desaprobado = 0;
	    pro_mayor = 0;
	    pro_menor = 999;
	    continuar = "S";
	    nom_pro_mayor = " ";
	    nom_pro_menor = " ";
	    while (continuar.equals("S")  ||  continuar.equals("s")) {
	    	c++;
	    	System.out.println("Resgisto "+ c+":");
	    	System.out.println("================");
	    	System.out.println("introduce tu nombre;");
	    	alumno = obj.next();
	    	System.out.println("introduce tus notas");
	    	System.out.println("nota 1:");
	    	n1 = obj.nextInt();
	    	System.out.println("nota 2:");
	    	n2 = obj.nextInt();
	    	System.out.println("nota 3:");
	    	n3 = obj.nextInt();
	    	System.out.println("Asistencias <1/12>");
	    	asistencias = obj. nextInt();
	    	
	    	promedio = (float)(n1*0.2 + n2*0.3 + n3*0.5);
	    	if (promedio > pro_mayor) {
	    		pro_mayor = promedio;
				nom_pro_mayor = alumno;
	    	}
	    	if (promedio < pro_menor) {
	    		pro_menor = promedio;
				nom_pro_menor = alumno;
	    	}
	    	porcentaje = (asistencias/ 12 ) * 100;
	    	if (promedio >= 13 && porcentaje >= 70) {
	    		estado = "obtiene certificado";
				aprobado = aprobado + 1;
	    	}
	    	else {
	    		estado = "sin certificado"; 
				desaprobado = desaprobado + 1;
	    	}
	    	System.out.println("------------------");
	    	System.out.println("----RESULTADOS----");
	    	System.out.println("------------------");
	    	System.out.println("Promedio: "+ promedio);
	    	System.out.println("Asistencias: "+ porcentaje+"%");
	    	System.out.println("Estado: "+ estado);
	    	
	    	System.out.println("¿Resgistar otro? <S/N>");
	        continuar = obj.next();
	    }
	    System.out.println("--Fin del programa--");
	    System.out.println("------RESUMEN-------");
	    System.out.println("Numero de alumno: "+c);
	    System.out.println("Mayor promedio: "+pro_mayor+ " Pertenece a: "+ nom_pro_mayor);
	    System.out.println("Menor promedio: "+pro_menor+ " Pertenece a: "+ nom_pro_menor);
	    System.out.println("Numero de alumnos con ertificados: "+aprobado);
	    System.out.println("Numero de alumno sin certificados: "+ desaprobado);

	}

}

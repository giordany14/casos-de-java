import java.util.Scanner;
import java.text.DecimalFormat;
public class caso16 {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		DecimalFormat T = new DecimalFormat("#.00");
		float trabajo,tarifa,sueldo,bono,total,dolar;
		System.out.println("ingrese las horas trabajadas: ");
		trabajo= obj.nextFloat();
		System.out.println("ingrese la tarifa por horas: ");
		tarifa = obj.nextFloat();
		
		sueldo = trabajo*tarifa;
		bono = (float)(sueldo * 0.05);
		total = bono + sueldo;
		dolar = (float)(total / 3.24);
		
		System.out.println("---RESULTADO---");
		System.out.println("sueldo: "+ T.format(sueldo));
		System.out.println("bono: "+T.format(bono));
		System.out.println("total: "+T.format(total));
		System.out.println("total en dolares: "+T.format(dolar));
		

	}

}

package monitoria;
import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Quantas horas trabalhou neste mês, camarada?");
		int horas = Integer.parseInt(ler.nextLine());
		System.out.println("Manda teu salario por hora.");
		double salario = ler.nextDouble();
		double salarioTotal;
		int horasSemanal = horas/4;
		if(horasSemanal > 40) {
				int horasExtras = horasSemanal -40;
				double salarioExtra = salario * 1.5;
				salarioTotal = (salario * 40 + salarioExtra + horasExtras) * 4;
		} else {
			salarioTotal = salario * horas;
		}
		System.out.println("Teu salario é de: R$ "+salarioTotal);
		
		ler.close();
	}

}

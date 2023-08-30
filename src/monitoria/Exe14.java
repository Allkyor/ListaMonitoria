package monitoria;
import java.util.Scanner;
public class Exe14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número");
		int num = Integer.parseInt(ler.nextLine());
		if(num > 0) {
			System.out.println("Número Positivo");
		} else if(num == 0) {
			System.out.println("É 0");
		} else {
			System.out.println("Número Negativo");
		}
		
		ler.close();
	}

}

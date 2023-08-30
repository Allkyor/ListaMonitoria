package monitoria;
import java.util.Scanner;
public class Ex2 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número positivo ou negativo");
		int num = Integer.parseInt(ler.nextLine());
		if (num >= 0) {
			System.out.println(num+" é um número positivo.");
		} else {
			System.out.println(num+" é um número negativo.");
		}
		
		ler.close();
	}
}

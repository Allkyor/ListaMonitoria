package monitoria;
import java.util.Scanner;
public class Exer20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira dois números");
		int num1 = Integer.parseInt(ler.nextLine());
		int num2 = Integer.parseInt(ler.nextLine());
		
		if(num1 == num2) {
			System.out.println("Números Iguais");
		} else if(num1 > num2) {
			System.out.println("O primeiro número é maior.");
		} else {
			System.out.println("O segundo número é maior.");
		}
		
		ler.close();
	}

}

package monitoria;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Olá! Digite um número.");
		int num = Integer.parseInt(ler.nextLine());
		if(num < 10) {
			System.out.println(num+" é menor que 10!");
		} else {
			System.out.println(num+" é maior que 10!");
		}
		
		ler.close();
	}

}

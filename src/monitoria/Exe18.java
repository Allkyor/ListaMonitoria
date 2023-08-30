package monitoria;
import java.util.Scanner;
public class Exe18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 3 valores");
		int num1 = Integer.parseInt(ler.nextLine());
		int num2 = Integer.parseInt(ler.nextLine());
		int num3 = Integer.parseInt(ler.nextLine());
		if(num1 < num2 + num3 && num2 < num1+num3 && num3< num1+num2) {
			System.out.println("Os valores formam um triangulo!!");
		} else {
			System.out.println("Não forma um triangulo.");
		}
		
		ler.close();
	}

}

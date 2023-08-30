package monitoria;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("|-----------------------------|");
		System.out.println("|Quantas maçãs deseja comprar?|");
		System.out.println("|-----------------------------|");
		int num = Integer.parseInt(ler.nextLine());
		if(num < 12) {
			double valor = (num * 1.3);
		System.out.println("|-----------------------------|");
		System.out.println("|--O valor ficou de: "+valor+" Reais|");
		System.out.println("|--------Volte Sempre!--------|");
		} else {
			System.out.println("|-----------------------------|");
			System.out.println("|--O valor ficou de: "+num+" Reais|");
			System.out.println("|--------Volte Sempre!--------|");
		}
		ler.close();
	}

}

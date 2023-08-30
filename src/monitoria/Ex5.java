package monitoria;
import java.util.Scanner;
public class Ex5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o ano atual!");
		int ano = Integer.parseInt(ler.nextLine());
		System.out.println("Digite que ano você nasceu!");
		int num = Integer.parseInt(ler.nextLine());
		int idade = ano - num;
		if(idade >= 18) {
			System.out.println("Você tem: "+idade +" anos");
			System.out.println("Você já pode votar!");
		} else {
			System.out.println("Você tem: "+idade+" anos");
			System.out.println("Você não pode votar ainda.");
		}	
		ler.close();
	}
}

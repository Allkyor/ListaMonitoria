package monitoria;
import java.util.Scanner;
public class Exe15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 3 valores!");
		int num1 = Integer.parseInt(ler.nextLine());
		int num2 = Integer.parseInt(ler.nextLine());
		int num3 = Integer.parseInt(ler.nextLine());
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1+" é o maior número --1");
		} else if (num2 > num3) {
			System.out.println(num2+" é o maior número --2");
		} else {
			System.out.println(num3+" é o maior número --3");
		}
		ler.close();
	}
}

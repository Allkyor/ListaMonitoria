package monitoria;
import java.util.Scanner;
public class Exe16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 3 valores!");
		int num1 = Integer.parseInt(ler.nextLine());
		int num2 = Integer.parseInt(ler.nextLine());
		int num3 = Integer.parseInt(ler.nextLine());
		if(num1 > num2 && num1 > num3) {
			if(num2>num3) {
				System.out.println(num1+num2+" numero 1 + numero 2, os dois maiores.");
			} else if(num3>num2) {
				System.out.println(num1+num3+" numero 1 + numero 3, os dois maiores.");
			}
		} else if (num2 > num3) {
			if(num3>num1) {
				System.out.println(num2+num3+" numero 2 + numero 3, os dois maiores.");
			} else if(num1>num3) {
				System.out.println(num2+num1+" numero 2 + numero 1, os dois maiores.");
			}
			
		} else {
			if(num1> num2) {
				System.out.println(num3+num1+" numero 3 + numero 1, os dois maiores.");
			} else if(num2> num1) {
				System.out.println(num3+num2+" numero 3 + numero 2, os dois maiores.");
			}
			
		}
		
		ler.close();
	}

}

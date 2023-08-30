package monitoria;
import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite dois números!");
		int num1 = Integer.parseInt(ler.nextLine());
		int num2 = Integer.parseInt(ler.nextLine());
		if(num1 > num2) {
			System.out.println(num2+" "+num1);
		} else {
			System.out.println(num1+" "+num2);
		}
		
		ler.close();
	}

}

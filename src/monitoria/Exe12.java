package monitoria;
import java.util.Scanner;
public class Exe12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual é a quantidade maxima do estoque?");
		int quanMax = Integer.parseInt(ler.nextLine());
		System.out.println("Qual a quantidade minima de estoque?");
		int quanMin = Integer.parseInt(ler.nextLine());
		System.out.println("Quantos possui atualmente no estoque?");
		int quanAtual = Integer.parseInt(ler.nextLine());
		int quantMedia = (quanMax + quanMin)/2;
		
		if(quanAtual >= quantMedia) {
			System.out.println("Não efetuar a compra.");
		}else {
			System.out.println("Efetuar compra!");
		}
		
		ler.close();
	}
}

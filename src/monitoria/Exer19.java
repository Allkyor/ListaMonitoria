package monitoria;
import java.util.Scanner;
public class Exer19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do primeiro time!");
		String time1 = ler.nextLine();
		System.out.println("Quantos gols o time "+time1+" fez?");
		int gol1 = Integer.parseInt(ler.nextLine());
		System.out.println("Digite o nome do segundo time!");
		String time2 = ler.nextLine();
		System.out.println("Quantos gols o time "+time2+" fez?");
		int gol2 = Integer.parseInt(ler.nextLine());
		if(gol1 > gol2) {
			System.out.println(time1+" VENCEU! ");
		} else if(gol1 == gol2) {
			System.out.println("EMPATE!");
		} else {
			System.out.println(time2+" VENCEU");
		}
		
		ler.close();
	}

}

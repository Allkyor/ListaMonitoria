package monitoria;
import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float nota1, nota2, media;
		System.out.println("Digite a primeira nota.");
		nota1 = ler.nextFloat();
		System.out.println("Digite sua segunda nota");
		nota2 = ler.nextFloat();
		media = (nota1 + nota2)/2;
		System.out.println("Sua média foi de "+media);
		if(media >= 6) {
			System.out.println("Você passou!");
		} else if(media >= 4 && media <= 5){
			System.out.println("Esta em Recuperação!");
		} else {
			System.out.println("Reprovado.");
		}
		ler.close();
	}
}

package monitoria;
import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Que horas o jogo começou?");
		int horaI = Integer.parseInt(ler.nextLine());
		System.out.println("Que horas o acabou começou?");
		int horaF = Integer.parseInt(ler.nextLine());
		int tempoJogo;
		if(horaF > horaI) {
			tempoJogo = horaF - horaI;
		}else {
			tempoJogo = 24 - horaI + horaF;
		}
		System.out.println("O tempo de duração de jogo foi de: "+tempoJogo +" Horas");
		
		ler.close();
	}

}

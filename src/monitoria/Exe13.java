package monitoria;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Exe13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		System.out.println("Digite seu nome!");
		String nome = ler.nextLine();
		System.out.println("Qual sua altura?");
		double altura = ler.nextFloat();
		System.out.println("Qual seu gênero? (M) | (F)");
		char gene = ler.next().charAt(0);
		double pesoIdeal = 0;
		
		if(gene == 'M') {
			pesoIdeal = (72.7 * altura) - 58;
		} else if(gene =='F') {
			pesoIdeal = (62.1 *altura)- 44.7;
		} else {
			System.out.println("Valor invalido!");
		}
		System.out.println("Olá "+nome);
		System.out.printf("Seu peso ideal é de: "+deci.format(pesoIdeal) +" kg");
		ler.close();
	}

}

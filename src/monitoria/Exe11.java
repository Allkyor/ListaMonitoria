package monitoria;
import java.util.Scanner;
public class Exe11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o número da conta: ");
		int conta = Integer.parseInt(ler.nextLine());
		System.out.println("Insira seu saldo: ");
		double saldo = ler.nextDouble();
		System.out.println("Quanto você tem de Debito?");
		double debito = ler.nextDouble();
		System.out.println("Quanto possui de crédito:");
		double credito = ler.nextDouble();
		double saldoAtual = saldo - debito + credito;
		
		if (saldoAtual >= 0) {
			System.out.println("Sua conta é: "+conta);
			System.out.println("Seu saldo é de: "+saldoAtual +" Reais");
			System.out.println("Saldo Positivo");
		} else {
			System.out.println("Sua conta é: "+conta);
			System.out.println("Seu saldo é de: "+saldoAtual+" Reais");
			System.out.println("Saldo negativo");
		}
		
		ler.close();
	}

}

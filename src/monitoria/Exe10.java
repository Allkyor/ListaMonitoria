package monitoria;
import java.util.Scanner;
public class Exe10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite teu salario ai como vendedor");
		double salario = ler.nextDouble();
		System.out.println("Digite quanto em vendas você fez esse mês.");
		double vendas = ler.nextDouble();
		double comissao;
		if(vendas <= 1500) {
			comissao = vendas * 0.03;
		} else {
			comissao = 1500 * 0.03+ (vendas - 1500) * 0.5;
		}
		double salarioTotal = salario + comissao;
		System.out.println("Teu salário esse mês é de: R$ "+salarioTotal);
		ler.close();
	}

}

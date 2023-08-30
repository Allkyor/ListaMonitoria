package monitoria;
import java.util.Scanner;
import java.util.Arrays;
public class Exe17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] valores = new int[3];
        System.out.println("Digite 3 valores diferentes:");
        for (int i = 0; i < 3; i++) {
            valores[i] = ler.nextInt();
        }
        if (valores[0] == valores[1] || valores[0] == valores[2] || valores[1] == valores[2]) {
            System.out.println("Valores iguais não são permitidos!");
        } else {
            Arrays.sort(valores);
            System.out.println("Valores em ordem crescente:");
            for (int valor : valores) {
                System.out.println(valor);
            }
        }    
		ler.close();
	}

}

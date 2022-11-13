import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int acum = 0;
		int contador = 0;
		
		System.out.println("Informe um numero");
		int valor1 = sc.nextInt();

		System.out.println("Informe um segundo numero");
		int valor2 = sc.nextInt();
		
		while (valor1 <= valor2) {
			acum += valor1;
			valor1++;
			contador++;
		}
		 System.out.println("O resultado é " + (acum / contador));
		sc.close();
	}
}

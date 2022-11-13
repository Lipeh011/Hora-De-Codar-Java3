import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in)
				
       System.out.println("Informe o primeiro valo:");
		int v1 = sc.nextInt();
		System.out.println("Informe o segundo valor:");
		int v2 = sc.nextInt();
	
     while (v2 <= 0) {
        System.out.println("Por favor digite um numero acima de 0");
      }
      
      int total = v1 / v2;
       System.out.println("O total é " + total);
	   
	   sc.close();
	}
}

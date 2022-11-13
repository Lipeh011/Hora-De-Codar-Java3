import java.util.Locale;
import java.util.Scanner;


@Override
	public boolean equals(Object obj) {
		aprovados x = (leitura) obj;
		return this.leitura == x.leitura;
	}
    
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		  String x;
		  String leitura;
		  int aprovados = 0;
		   
	            do {
	            System.out.println("Qual a primeira nota?");
	            double v1 = sc.nextDouble();
	            
	            System.out.println("Qual a segunda nota?");
	            double v2 = sc.nextDouble();
	            
	            double media = (v1 + v2) /2;
	            System.out.println("A média é " + media);
	            
	            System.out.println("Quer continuar a calcular a media? S/N ");
	            leitura = sc.next();
	            x = "S";
	            if(media >= 9.5) {
	                aprovados++;
	              }
	            
	            }  while (leitura.equals(x));{
	            	System.out.printf("Os alunos aprovado foram :%n " + aprovados);
	            }
	           
	            
   }

}


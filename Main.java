import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        System.out.print("Coeficiente a: ");
		double a = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		double b = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		double c = sc.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c;
		
		
		if (delta < 0) {
	    	System.out.println("Esta equacao nao possui raizes reais");
		}
        


		sc.close();
    }
}

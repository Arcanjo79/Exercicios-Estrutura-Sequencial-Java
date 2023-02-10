package exercicio_1.exercicio_2;

import java.util.Scanner;
import java.util.Locale;

public class main2 {
    public static void main (String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
            raio = Math.pow(raio, 2);
        double π = 3.14159;
        
        double A = π * raio;

        System.out.printf("A = %.4f", A);

        sc.close();

        
    }
    
}

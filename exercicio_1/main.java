package exercicio_1;

import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        
        x = sc.nextInt();
        y = sc.nextInt();

        double SOMA = x + y;

        System.out.println("SOMA = " + SOMA);

      sc.close();
      
    }
    
}

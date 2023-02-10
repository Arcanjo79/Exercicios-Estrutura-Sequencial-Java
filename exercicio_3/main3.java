package exercicio_3;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int A, B, C, D;
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        double DIFERENÇA = (A * B - C * D);

        System.out.println("DIFERENÇA = " + DIFERENÇA);
        


    
    
    
        sc.close();

    }
    
}

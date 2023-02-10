package exercicio_4;

import java.util.Scanner;
import java.util.Locale;

public class Main4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int employeecode = sc.nextInt();
        int hourswork = sc.nextInt();
        double hourvalue = sc.nextDouble();

        double SALARY = (hourswork * hourvalue);

       System.out.println("NUMBER = " + employeecode);
        System.out.printf("SALARY = U$ %.2f", SALARY);

        sc.close();

    }

}

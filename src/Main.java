import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        int s;
        double n = -2;
        double m = 2;

        while (scanner.hasNext()) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (n * pow(10, 9) < a && b < m * pow(10, 9)){
                s= (int) (a+b);
        System.out.println(s);
            }
        }
    }
}
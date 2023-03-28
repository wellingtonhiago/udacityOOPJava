package output;

import java.math.BigInteger;
import java.util.Scanner;

public class classScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota de 0 a 10");

        BigInteger nota = BigInteger.valueOf(scanner.nextInt());
        BigInteger sete = BigInteger.valueOf(7);

        if (nota.compareTo(sete) == 1 || nota.compareTo(sete) == 0) {
            System.out.println("Essa foi uma boa nota");
        } else {
            System.out.println("Essa não foi uma boa nota");
        }
    }
}

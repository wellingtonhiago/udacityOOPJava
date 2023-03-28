package output;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        int numberRandom = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("Eu tenho um número aleatório entre 1 e 100.");
        System.out.println("Tente adivinha-lo");

        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {
            System.out.println("Você tem" + i + ". Tente de novo");
            int guess = scanner.nextInt();

            if (numberRandom < guess) {
                System.out.println("Seu palpite foi maior que o número escondido");
            } else if (numberRandom > guess) {
                System.out.println("Seu palpite foi menor que o número escondido");
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("Correto... Você venceu");
        } else {
            System.out.println("Fim de jogo... Você perdeu");
            System.out.println("O número era " + numberRandom);
        }


    }
}

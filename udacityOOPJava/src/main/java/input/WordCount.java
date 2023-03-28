package input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("ATaleofTwoCities.txt");
        Scanner fileScanner = new Scanner(file);

        int words = 0;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();

            words += line.split(" ").length;
        }

        System.out.println(words);
    }
}

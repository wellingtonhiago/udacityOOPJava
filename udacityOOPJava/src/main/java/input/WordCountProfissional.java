package input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountProfissional {
    public static void main(String[] args) {
        String fileName = "ATaleofTwoCities.txt";
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("O arquivo " + fileName + " contém " + wordCount + " palavras.");

    }
}

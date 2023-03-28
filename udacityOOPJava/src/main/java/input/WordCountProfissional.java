package input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountProfissional {
    public static void main(String[] args) {
        // Nome do arquivo a ser lido
        String fileName = "ATaleofTwoCities.txt";
        // Contador de palavras
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Lê cada linha do arquivo
            while ((line = br.readLine()) != null) {
                // Divide a linha em palavras usando espaços em branco como separador
                String[] words = line.split("\\s+");
                // Adiciona o número de palavras na linha ao contador de palavras
                wordCount += words.length;
            }
        } catch (IOException e) {
            // Em caso de erro de leitura do arquivo, exibe o stack trace
            e.printStackTrace();
        }

        // Exibe o resultado final
        System.out.println("O arquivo " + fileName + " contém " + wordCount + " palavras.");
    }
}

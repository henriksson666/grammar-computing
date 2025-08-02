
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DNATranscription {

    public static void main(String[] args) {
        String input = "src\\dna\\dna_sequence_small.txt";
        BufferedReader reader = null;

        StringBuilder sb = new StringBuilder();
        StringBuilder sbRNA = new StringBuilder();
        StringBuilder sbMRNA = new StringBuilder();

        try {
            reader = new BufferedReader(new FileReader(input));
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + input);
        }

        try {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }

            int counter1 = 0;

            while (counter1 < sb.length()) {
                char firstChar = sb.charAt(counter1);
                if (firstChar == 't') {
                    sbRNA.append('u');
                } else {
                    sbRNA.append(firstChar);
                }
                if (counter1 % 3 == 0 && counter1 != 0) {
                    sbMRNA.append(' ');
                }
                sbMRNA.append(sbRNA.charAt(counter1));
                counter1++;
            }

            System.out.println("Length of DNA sequence: " + sb.length());
            System.out.println(sb.toString().toUpperCase());
            System.out.println("Length of RNA sequence: " + sbRNA.length());
            System.out.println(sbRNA.toString().toUpperCase());
            System.out.println("Length of mRNA sequence: " + sbMRNA.length());
            System.out.println(sbMRNA.toString().toUpperCase());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

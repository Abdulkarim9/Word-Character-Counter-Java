import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int characterCount = 0;
        int wordCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("newFile.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                characterCount += line.length();

                String[] words = line.split("\\s");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }

        System.out.println("Character count: " + characterCount);
        System.out.println("Word count: " + wordCount);
    }
}
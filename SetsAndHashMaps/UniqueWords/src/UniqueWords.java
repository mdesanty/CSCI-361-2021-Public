import java.util.Set;
import java.util.HashSet;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class UniqueWords {
    private static final int MIN_WORD_LENGTH = 4;
    private static final String WORD_STARTS_WITH = "S";

    private Set<String> uniqueWords;

    public UniqueWords() {
        uniqueWords = new HashSet<String>();
    }

    public void processFile(String pathToFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile)))
        {
            String line = reader.readLine();
            while (line != null)
            {
                String words[] = line.split(" ");
                for (String word : words)
                {
                    word = cleanWord(word);

                    if(word.length() < MIN_WORD_LENGTH)
                        continue;

                    if(!word.startsWith(WORD_STARTS_WITH))
                        continue;

                    uniqueWords.add(word);
                }

                line = reader.readLine();
            }

            reader.close();
        }
        catch (IOException ex)
        {
            System.err.format("IOException: %s%n", ex);
        }
    }

    private String cleanWord(String word) {
        String cleanedWord = "";

        for(Character c : word.toUpperCase().toCharArray()) {
            if(Character.isLetter(c))
                cleanedWord += c;
        }

        return cleanedWord;
    }

    public void printWords() {
        for(String word : uniqueWords)
            System.out.printf("Word: %s%n", word);
    }
}
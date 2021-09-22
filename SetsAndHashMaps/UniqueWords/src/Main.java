public class Main {
    public static void main(String[] args) {
        UniqueWords words = new UniqueWords();
        words.processFile("doc/chili.txt");
        words.printWords();
    }
}
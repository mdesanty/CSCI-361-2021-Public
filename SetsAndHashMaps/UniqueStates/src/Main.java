public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.testStates();
    }

    private void testStates() {
        UniqueStates states = new UniqueStates();

        states.addState("MA");
        states.addState("NJ");
        states.addState("VA");
        states.addState("NJ");
        states.addState("MA");
        states.addState("CT");
        states.addState("CT");

        System.out.println(states);
    }
}
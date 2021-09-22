public class Main {
    public static void main(String[] args) {
        StateLookup lookup = new StateLookup();

        System.out.println("Looking up MA: " + lookup.lookupState("MA"));
        System.out.println("Looking up ma: " + lookup.lookupState("ma"));
        System.out.println("Looking up ME: " + lookup.lookupState("ME"));
        System.out.println("Looking up NH: " + lookup.lookupState("NH"));
        System.out.println("Looking up CT: " + lookup.lookupState("CT"));
        System.out.println("Looking up Ct: " + lookup.lookupState("Ct"));
        System.out.println("Looking up RI: " + lookup.lookupState("RI"));
        System.out.println("Looking up CA: " + lookup.lookupState("CA"));
        System.out.println("Looking up AA: " + lookup.lookupState("AA"));
    }
}
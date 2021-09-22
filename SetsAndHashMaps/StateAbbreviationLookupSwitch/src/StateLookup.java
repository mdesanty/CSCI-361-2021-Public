public class StateLookup {
    public StateLookup() {}

    public String lookupState(String abbreviation) {
        switch(abbreviation.toUpperCase()) {
            case "VT":
                return "Vermont";
            case "MA":
                return "Massachusetts";
            case "ME":
                return "Maine";
            case "NH":
                return "New Hampshire";
            case "CT":
                return "Connecticut";
            case "RI":
                return "Rhode Island";
            default:
                return "Sorry, I only know New England states.";
        }
    }
}
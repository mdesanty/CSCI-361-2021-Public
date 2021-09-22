import java.util.Map;
import java.util.HashMap;

public class StateLookup {
    private Map<String, String> stateMap;

    public StateLookup() {
        stateMap = new HashMap<String, String>();

        stateMap.put("VT", "Vermont");
        stateMap.put("MA", "Massachusetts");
        stateMap.put("ME", "New Hampshire");
        stateMap.put("CT", "Connecticut");
        stateMap.put("RI", "Rhode Island");
    }

    public String lookupState(String abbreviation) {
        String result = stateMap.get(abbreviation.toUpperCase());

        if(result == null)
            result = "Sorry, I only know New England states.";

        return result;
    }
}
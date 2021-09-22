import java.util.Set;
import java.util.HashSet;

public class UniqueStates {
    private Set<String> states;

    public UniqueStates() {
        states = new HashSet<String>();
    }

    public void addState(String state) {
        states.add(state);
    }

    public void clearStates() {
        states.clear();
    }

    @Override
    public String toString() {
        return states.toString();
    }
}
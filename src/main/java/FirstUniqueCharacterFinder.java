import java.util.HashMap;

public class FirstUniqueCharacterFinder {
    public static char findFirstUniqueChar(String input) {
        if (input == null || input.trim().isEmpty()) return '\0';

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int j = 0; j < input.length(); j++) {
            char c = input.charAt(j);
            if (map.get(c) == 1) {
                return c;
            }
        }

        return '\0';
    }
}

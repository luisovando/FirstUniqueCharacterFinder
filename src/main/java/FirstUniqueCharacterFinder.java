import java.util.HashMap;

public class FirstUniqueCharacterFinder {
    public static char findFirstUniqueChar(String input) {
        if (input.trim().isEmpty()) return '\0';

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i <= input.length() - 1; i++) {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int j = 0; j < input.length(); j++) {
            char c = input.charAt(j);
            if (map.containsKey(c)) {
                if (map.get(c) == 1) {
                    return c;
                }
            }
        }

        return '\0';
    }
}

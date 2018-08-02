package challenger;

import java.util.HashMap;

public interface SubstringFinder {

    static String findLongestSubstring(String input) {
        int longestStart = 0;
        int longestMax = 0;
        int currStart = 0;
        int i;
        HashMap<String, Integer> map = new HashMap<>();
        map.put(String.valueOf(input.charAt(0)), 0);
        for (i = 1; i < input.length(); i++) {
            final String value = String.valueOf(input.charAt(i));
            if (map.containsKey(value)) {
                int lastIndex = map.get(value);
                if (lastIndex >= currStart) {
                    int currLength = i - currStart;
                    if (longestMax < currLength) {
                        longestMax = currLength;
                        longestStart = currStart;
                    }
                    currStart = lastIndex + 1;
                }
            }
            map.put(value, i);
        }
        int currLength = i - currStart;
        if (longestMax < currLength) {
            longestMax = currLength;
            longestStart = currStart;
        }

        return input.substring(longestStart, longestStart + longestMax);
    }
}

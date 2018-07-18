package challenger;

import java.util.HashSet;
import java.util.Set;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Chars;

public class UniqueStringVerifier {

    private final String input;

    UniqueStringVerifier(String input) {
        this.input = Preconditions.checkNotNull(input);
    }

    public boolean isUniqueSetApproach() {
        Set<Character> charSet = new HashSet<>(Chars.asList(this.input.toCharArray()));
        return this.input.length() == charSet.size();
    }

    public boolean isUniqueSortedApproach() {
        String sortedInput = this.input.chars()
            .sorted()
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();
        char current = sortedInput.charAt(0);
        for (int i = 1; i < sortedInput.length(); i++) {
            final char next = sortedInput.charAt(i);
            if (current == next) {
                return false;
            }
            current = next;
        }
        return true;
    }

    public boolean isUniqueLoopApproach() {
        for (char c : this.input.toCharArray()) {
            int count = 0;
            for (char ch : this.input.toCharArray()) {
                if (c == ch) {
                    count++;
                }
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}

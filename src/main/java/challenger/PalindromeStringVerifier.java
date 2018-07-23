package challenger;

import java.util.List;
import java.util.Stack;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.primitives.Chars;

public class PalindromeStringVerifier {

    private final String input;

    PalindromeStringVerifier(String input) {
        this.input = Preconditions.checkNotNull(input);
    }

    public boolean isPalindromeArrayApproach() {
        final List<Character> inputList = Chars.asList(this.input.toCharArray());
        return inputList.equals(Lists.reverse(inputList));
    }

    public boolean isPalindromeStackApproach() {
        final Stack<Character> inputStack = new Stack<>();
        this.input.chars().forEach(e -> inputStack.push((char) e));
        for (char c : this.input.toCharArray()) {
            char top = inputStack.pop();
            if (c != top) {
                return false;
            }
        }
        return true;
    }
}

package challenger;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Chars;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Unit Test for "Challenge 1: Is Unique?"
     */
    @Test
    public void challenge1() {
        final UniqueStringVerifier dupString1 = new UniqueStringVerifier("sdasdas");
        assertFalse(dupString1.isUniqueLoopApproach());
        assertFalse(dupString1.isUniqueSetApproach());
        assertFalse(dupString1.isUniqueSortedApproach());

        final UniqueStringVerifier dupString2 = new UniqueStringVerifier("sad3213");
        assertFalse(dupString2.isUniqueLoopApproach());
        assertFalse(dupString2.isUniqueSetApproach());
        assertFalse(dupString2.isUniqueSortedApproach());

        final UniqueStringVerifier dupString3 = new UniqueStringVerifier("sad321!@#$!");
        assertFalse(dupString3.isUniqueLoopApproach());
        assertFalse(dupString3.isUniqueSetApproach());
        assertFalse(dupString3.isUniqueSortedApproach());

        final UniqueStringVerifier uniString1 = new UniqueStringVerifier("sad");
        System.out.println(ImmutableSet.of(Chars.asList("sad".toCharArray())).size());
        assertTrue(uniString1.isUniqueLoopApproach());
        assertTrue(uniString1.isUniqueSetApproach());
        assertTrue(uniString1.isUniqueSortedApproach());

        final UniqueStringVerifier uniString2 = new UniqueStringVerifier("sad321");
        assertTrue(uniString2.isUniqueLoopApproach());
        assertTrue(uniString2.isUniqueSetApproach());
        assertTrue(uniString2.isUniqueSortedApproach());

        final UniqueStringVerifier uniString3 = new UniqueStringVerifier("sad321!@#$");
        assertTrue(uniString3.isUniqueLoopApproach());
        assertTrue(uniString3.isUniqueSetApproach());
        assertTrue(uniString3.isUniqueSortedApproach());
    }

    @Test
    public void challenge2() {
        final PalindromeStringVerifier palindrome1 = new PalindromeStringVerifier("saddas");
        assertTrue(palindrome1.isPalindromeArrayApproach());
        assertTrue(palindrome1.isPalindromeStackApproach());

        final PalindromeStringVerifier palindrome2 = new PalindromeStringVerifier("1234321");
        assertTrue(palindrome2.isPalindromeArrayApproach());
        assertTrue(palindrome2.isPalindromeStackApproach());

        final PalindromeStringVerifier palindrome3 = new PalindromeStringVerifier("abcCBA");
        assertFalse(palindrome3.isPalindromeArrayApproach());
        assertFalse(palindrome3.isPalindromeStackApproach());
    }

    @Test
    public void challenge3() {
        final int[] input = new int[]{1, 2, 3};
        final int[] expected = new int[]{6, 3, 2};
        final int[] basicResult = ProductArrayCalculator.calculate(input);
        final int[] logResult = ProductArrayCalculator.calculateWithLogging(input);
        assertArrayEquals(expected, basicResult);
        assertArrayEquals(expected, logResult);

        final int[] input2 = new int[]{1,2,3,0};
        final int[] expected2 = new int[]{0, 0, 0, 6};
        final int[] basicResult2 = ProductArrayCalculator.calculate(input2);
        assertArrayEquals(expected2, basicResult2);
    }

    @Test
    public void challenge4() {
        final int[] input = new int[]{1, 2, 3};
        final int[] expected = new int[]{0,2};
        final int[] result1 = TwoSumCalculator.findTwoSum(input, 4);
        assertArrayEquals(expected, result1);

        final int[] input2 = new int[]{2, 2, 3};
        final int[] expected2 = new int[]{0,1};
        final int[] result2 = TwoSumCalculator.findTwoSum(input2, 4);
        assertArrayEquals(expected2, result2);
    }

    @Test
    public void challenge5() {
        final String input = "abcabcdd";
        final String expected = "abcd";
        final String result = SubstringFinder.findLongestSubstring(input);
        assertEquals(expected, result);

        final String input2 = "abc";
        final String expected2 = "abc";
        final String result2 = SubstringFinder.findLongestSubstring(input2);
        assertEquals(expected2, result2);

        final String input3 = "bbbbb";
        final String expected3 = "b";
        final String result3 = SubstringFinder.findLongestSubstring(input3);
        assertEquals(expected3, result3);

        final String input4 = "abcabcdabcdeabcdefgh";
        final String expected4 = "abcdefgh";
        final String result4 = SubstringFinder.findLongestSubstring(input4);
        assertEquals(expected4, result4);
    }
}

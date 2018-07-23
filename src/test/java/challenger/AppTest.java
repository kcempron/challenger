package challenger;

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
}

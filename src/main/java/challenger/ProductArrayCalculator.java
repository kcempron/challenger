package challenger;

import java.util.Arrays;

import com.google.common.base.Preconditions;

public interface ProductArrayCalculator {

    static int[] calculate(int[] input) {
        int[] output = new int[input.length];
        Arrays.fill(output, 1);
        for (int i = 0; i < input.length; i++) {
            final int value = input[i];
            for (int j = 0; j < output.length; j++) {
                if (i != j) {
                    output[j] = output[j] * value;
                }
            }
        }
        return output;
    }

    static int[] calculateWithLogging(int[] input) {
        Preconditions.checkArgument(arrayIsPositive(input));
        final double logProduct = Math.log10(computeArrayProduct(input));
        for (int i = 0; i < input.length; i++) {
            double logOp = logProduct - Math.log10(input[i]);
            input[i] = (int) Math.pow(10, logOp);
        }
        return input;
    }

    static int computeArrayProduct(int[] input) {
        int i = 1;
        for (int value : input) {
            i = i * value;
        }
        return i;
    }

    static boolean arrayIsPositive(int[] input) {
        for (int i : input) {
            if (i <= 0) {
                return false;
            }
        }
        return true;
    }
}

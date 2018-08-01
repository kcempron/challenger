package challenger;

import java.util.HashMap;

public interface TwoSumCalculator {

    static int[] findTwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> valueMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            valueMap.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            final int subTarget = target - arr[i];
            if (valueMap.containsKey(subTarget) && valueMap.get(subTarget) != i) {
                return new int[]{i, valueMap.get(subTarget)};
            }
        }
        return new int[0];
    }
}

# Challenge 4: "Two Sum"
## Prompt
Given an array of integers, find two numbers such that they add up to a specific target number.
The function should return indices of the two numbers such that they add up to the `target`.

You may assume that each input will have exactly one solution.
## Notes
### Brute Force Approach
For this problem, the simple brute force solution is to iterate through each `value` in the array, and then for each of those values, find the next respective `value` such that `value1 + value2 = target` with of course making constraint checks on index. This will lead to an `O(n^2)` runtime complexity with `O(1)` space.
### Optimized Approach
We can do better, however, since we know that we only need to find two indices to get our result. Thanks to this, we can actually alter the problem such that we are looking for some index that is equal to a `subTarget` which is defined to be `subTarget = target - arr[i]`. In this case, we can iterate through each value in the array and them solve for the subproblem mentioned. The trick that can make this more efficient from the previous approach lies in the use of a hashmap which has `O(1)` lookup time.
Since we are now just searching on one `subTarget`, we can make a hashmap where `key = array value, value = array index` and look up the subTarget for its corresponding index if it exists.
Overall, this new approach is `O(n)` in runtime complexity do its iterations over the input with only `O(1)` work cost and it will be `O(n)` in space.

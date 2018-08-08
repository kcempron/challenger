# Challenge 5: "Longest Substring Without Repeating Characters"
## Prompt
Given a string, find the length of the longest substring without repeating characters.
For example:
```
input: "abcabcbb"
output: "abc"

input: "bbb"
output: "b"
```
## Notes
When approaching this problem, we can provide a brute force approach by taking each character in the string, setting it is the start value of the potential substring and then iterating through the string again, storing each seen value in a set, and verifying that the next value is not in the set. If we ever encounter a character already in the set, we know we can stop and then by keeping track of the `longest-substring-length` and the `longest-start-index`, we can return the longest substring. This will take us `O(n^3)` to for the double for loop string iteration and in each iteration we do a set verification which will cost O(n). Space wise, we are looking at `O(n)`.


Just from reading the brute force implementation, we can see that there are a lot of repeated processes that we can perhaps optimize on. In particular, if we have already iterated through the string once, we should already know what all the character values are. Furthermore, we waste a lot of time regenerating the set for comparisons. An optimized solution that I implemented utilizes a hashmap that maps the character to the index it was last seen at. We also keep track of a current start index.
The approach is as follows:
- Iterate through the input string and keep track of the start index.
- Check if the current character is in the hashmap:
  - if present, check if the `last-seen-index` is before the current start index. If so, we can keep going otherwise we need to stop our current substring and check to see if its the best one we have so far. We update `longest-substring-length` and `longest-start-index` accordingly.
- Add the character and index into the hashmap.
Overall, this runtime and space complexity will be in `O(n)`.

# Challenge 1: "Is Unique"
## Prompt
Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
## Notes
When reading the prompt, the first thing that catches my intention is **unique characters**. Usually this implies the use of some sort of `Set` data structure to handle uniqueness. 

- This led me with my first implementation `isUniqueSetApproach()` which takes the string input `n`, inserts it into a hashset `hs`, and then checks if the length (in characters) of `n` matches the length of the hashset `hs`. This works because if the the length is the same, that implies all the characters in `n` are also unique! The runtime calculation of this approach is dependent on the time it create `hs` from our input string `n` which in this case should be **linear**! While the implementation itself is short, it surprisingly took me some time to turn `n` into a passible value for `HashSet<Character>()`. I found myself converting the string to a `CharArray` and then to an `ArrayList<Character>` before I could pass it into the set constructor.

- My second approach `isUniqueSortedApproach` was an attempt of **cannot use additional data structures**. Though my code itself constructs a new `String object`, this was because I wanted to preserve the original string input `n` via testing, otherwise, I could have just reassigned `n` to the sorted version `sn`. Once we have `sn`, we can iterate through each character `c` and check if it is not equal to the proceeding character. If we find no matches for all `c`, then we know `ns` and also `n` is unique. The runtime calculation of this approach is dependent on the sort algorithm being used. In most cases, this will be `O(log(n))` unless `n` is already sorted, in which case I believe the runtime will be `O(n)`.

- While I normally implement the brute force approach first, I ended up doing `isUniqueLoopApproach` last. This approach iterates through each character and then checks the input string for for other instances of that character. If more than one occur, then the input is not unique. The runtime calculation for this is `O(n^2)`.

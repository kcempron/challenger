# Challenge 3: "Product Array"
## Prompt
Implement an algorithm that takes in an array of numbers and replaces each number with the product of all the numbers 
in the array except the number itself. You can't use division.
## Notes
If we were allowed to use division, I would say this problem is trivial as we could simply get the total product of all the numbers in the array and for each index, divide the total with the index value to get the new value. Of course there are some slight cases when handling `0` division and multiplication but otherwise, the problem would have been `O(n)` in runtime and space complexity where `n` is the size of the input array.

However, since we do have this constraint, we must come up with a more clever solution. My first `not-so-clever` solution was to iterate over each value in the array and multiply it across a new array (of same as size as the input with all values initialized to 1) except for the value of the same index. This takes `O(n^2)` time but is able to cover all types of numbers positive, negative, and zero. 

If we are not too concerned about `values <= 0`, then we can actually come up with a clever solution that uses log properties to simulate division through logarithmic subtraction. Similar to my first statement, we first generate the total product from all the numbers. the main difference now is that instead of simplu dividing, we do the following:
```arr[i] = 2 ^ (log(product) - log(arr[i])``` with log being in base 2.
As a side note, I found that while coding this approach in `Java`, I failed some of my tests due to rounding errors that occur from casting a `double` to an `int`. Otherwise, this appriach is `O(n)` in runtime and space complexity!

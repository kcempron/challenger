# Challenge 2: "Palindrome"
## Prompt
Implement an algorithm to check if a string is a palindrome.
## Notes
For a string to be a palindrome, that must mean that `input = reverse(input)`. To accomplish this via code, I took the input string and converted it to a list. I chose to do this since I was familiar with reversing lists using `Lists.reverse(...)` otherwise, it might have been easier to apply a function that can reverse the string input directly and compare that with the input string.

I also decided to implement the `stack` approach since I originally had the challenge to be to input a `linked list`.  If we were to use a `linked list` input, we could iterate through each item in the list and push it on the `stack`. Afterwards, we would iterate through the list again and pop off the top of the stack to compare the results.


Both of these approaches, regardless of using a `String` or `Linked List` input will run in `O(n)` where `n` is the input length since it only requires us to make 1 or 2 passes to verify whether the input is a palindrome.

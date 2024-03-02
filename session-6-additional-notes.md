![image](https://github.com/ramanujds/ust-global-2024/assets/42864715/27fc6ba7-e429-41e9-8223-9cfa092d13c2)## a. Sliding Window Technique

**Concept:**
The sliding window technique involves maintaining a set of elements in a "window" that moves through the input sequence. This technique is commonly used for problems involving subarrays or sublists.

**Example Problem:**
Given an array of integers, find the maximum sum of a subarray of a fixed size `k`.

**Implementation:**
```java
public class SlidingWindowExample {

    public static int maxSumSubarray(int[] arr, int k) {
        int maxSum = 0;
        int currentSum = 0;

        // Calculate sum of the first window
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        // Slide the window through the array
        for (int i = k; i < arr.length; i++) {
            currentSum = currentSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int k = 3;

        int result = maxSumSubarray(arr, k);
        System.out.println("Maximum sum of a subarray of size " + k + ": " + result);
    }
}
```

**Explanation:**
In the example, the sliding window of size `k` is moved through the array, and at each step, the sum of the elements within the window is calculated. The maximum sum encountered during this process is the desired result.

---

## b. Two Pointer Technique

**Concept:**
The two-pointer technique involves using two pointers to traverse the array or list, typically moving towards each other or in opposite directions.

**Example Problem:**
Given a sorted array, find a pair of elements that sum up to a specific target.

**Implementation:**
```java
public class TwoPointerExample {

    public static boolean hasPairWithSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == target) {
                return true; // Found a pair with the target sum
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false; // No such pair found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 16;

        boolean result = hasPairWithSum(arr, target);
        System.out.println("Has pair with sum " + target + ": " + result);
    }
}
```

**Explanation:**
In this example, two pointers (`left` and `right`) start at the two ends of the sorted array. The pointers move towards each other until the sum of the elements at the current positions equals the target.

---

## c. Count Sorting using Array

**Concept:**
Count sorting involves counting the occurrences of each element in the input array and then reconstructing the sorted array based on the counts.

**Example Problem:**
Sort an array of integers containing only 0, 1, and 2 without using any sorting algorithm.

**Implementation:**
```java
public class CountSortingExample {

    public static void countSort(int[] arr) {
        int[] count = new int[3];

        // Count the occurrences of 0, 1, and 2
        for (int num : arr) {
            count[num]++;
        }

        // Reconstruct the sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 1, 0, 2, 1, 0};

        countSort(arr);

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

**Explanation:**
In this example, the array is traversed to count the occurrences of 0, 1, and 2. Then, the sorted array is reconstructed based on these counts.

## Advanced String related programs


## a. Palindromic Detection

**Concept Explanation:**
Palindromes are sequences of characters that read the same forward and backward. Palindromic detection involves checking whether a given string is a palindrome.

**Implementation Example in Java:**
```java
public class PalindromeDetection {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "radar";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
```

## b. Anagram Grouping

**Concept Explanation:**
Anagrams are words or phrases formed by rearranging the letters of another. Anagram grouping involves categorizing a list of words into groups where words in the same group are anagrams of each other.

**Implementation Example in Java:**
```java
import java.util.*;

public class AnagramGrouping {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            map.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(words);

        System.out.println("Anagram Groups: " + result);
    }
}
```

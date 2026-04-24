# 🪟 Sliding Window - DSA Practice

This folder contains problems solved using the **Sliding Window technique**, used for efficient subarray and substring processing.

---

## 🧠 Concept

Sliding Window is used when dealing with **contiguous subarrays or substrings**.

Instead of recomputing values for every range, we:

* Expand the window (right pointer)
* Shrink the window (left pointer)
* Maintain a running condition (sum, count, etc.)

---

## 🔑 When to use Sliding Window

* Problems involving **subarrays / substrings**
* Need to find **max / min / count** over a range
* Constraints like:

  * “at most k”
  * “exactly k”
  * “longest / shortest”

---

## 📌 Problems Implemented

### 🔹 Maximum Average Subarray

[🔗 Max Average Subarray](https://leetcode.com/problems/maximum-average-subarray-i/)

* File: `MaxAverageSubarray.java`
* Approach: Fixed window of size k
* Pattern: Sliding Window (Fixed)

---

### 🔹 Sliding Window Maximum

[🔗 Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/)

* File: `SlidingWindowMax.java`
* Approach: Monotonic Deque
* Pattern: Sliding Window (Advanced)

---

### 🔹 Sliding Window Sum

* File: `SlidingWindowSum.java`
* Approach: Maintain running sum while shifting window
* Pattern: Sliding Window (Fixed)

---

### 🔹 Longest Subarray Sum ≤ K

* File: `LongestSubarraySumLessThanK.java`
* Approach: Expand + shrink based on sum
* Pattern: Sliding Window (Variable)

---

### 🔹 Longest Subarray Without Extra Condition

* File: `LongestSubarrayNoExtra.java`
* Approach: Standard window expansion
* Pattern: Sliding Window

---

### 🔹 Length of Longest Substring Without Repeating Characters

[🔗 Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

* File: `LengthOfLongestSubstring.java`
* Approach: Use HashSet / Map to track characters
* Pattern: Sliding Window (Variable)

---

### 🔹 Maximum Vowels in Substring of Given Length

[🔗 Max Vowels Substring](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/)

* File: `MaxVowelsSubstring.java`
* Approach: Count vowels in fixed window
* Pattern: Sliding Window (Fixed)

---

### 🔹 First Negative Number in Every Window

* File: `FirstNegativeNoQueue.java`
* Approach: Track negatives using queue
* Pattern: Sliding Window (Fixed)

---

### 🔹 Subarray Average Threshold

[🔗 Subarray Average Threshold](https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/)

* File: `SubarrayAverageThreshold.java`
* Approach: Fixed window with sum tracking
* Pattern: Sliding Window (Fixed)

---

## ⚙️ Key Techniques Used

* Fixed size window
* Variable size window
* Expand & shrink logic
* Maintaining running sum / count
* Monotonic deque (for max/min problems)
* HashSet / HashMap for uniqueness

---

## ⏱️ Complexity Insights

* **Time Complexity:** O(n)
* **Space Complexity:** O(1) / O(k) / O(n) depending on problem

---

## 🎯 Goal

* Master window expansion & shrinking logic
* Recognize when to apply fixed vs variable window
* Solve substring and subarray problems efficiently

---

## 🚀 Notes

Most sliding window problems fall into:

* Fixed Window → size k
* Variable Window → condition-based

Understanding how and when to shrink the window is the key skill.

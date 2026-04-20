# Fixed Sliding Window

This folder contains problems based on the fixed-size sliding window technique.

## 🧠 Concept

In fixed sliding window problems, the window size remains constant.

Instead of recalculating values for every subarray, we:
- Add the next element to the window
- Remove the previous element from the window

This reduces time complexity from O(n²) → O(n)

---

## 📌 Problems Implemented

- Sliding Window Sum
- Sliding Window Maximum
- Maximum Average Subarray
- First Negative Number in Window (Queue-based)
- Maximum Vowels in Substring
- Subarray Average Threshold
- Longest Subarray with Given Condition
- Longest Substring (Basic Sliding Logic)

---

## ⚙️ Key Techniques Used

- Window size = constant (k)
- Add next element → expand
- Remove previous element → maintain size
- Use Queue for tracking specific elements (like negatives)
- Efficient sum updates

---

## 🧩 Common Pattern

1. Initialize window (first k elements)
2. Slide window:
   - Add next element
   - Remove previous element
3. Update result

---

## 🎯 Goal

To efficiently solve subarray problems using constant window size and build a foundation for variable sliding window problems.
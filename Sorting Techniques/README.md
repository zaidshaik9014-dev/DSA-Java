# Sorting Algorithms

This folder contains implementations of common sorting algorithms in Java along with their time and space complexities.

---

## 🧠 What is Sorting?

Sorting is the process of arranging elements in a specific order (ascending or descending).

Efficient sorting helps improve the performance of many algorithms like searching, merging, and data processing.

---

## 📌 Algorithms Implemented

- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort
- Quick Sort

---

## ⚙️ Time & Space Complexity

| Algorithm        | Best Case     | Average Case  | Worst Case    | Space Complexity |
|----------------|--------------|--------------|--------------|-----------------|
| Bubble Sort     | O(n)         | O(n²)        | O(n²)        | O(1)            |
| Selection Sort  | O(n²)        | O(n²)        | O(n²)        | O(1)            |
| Insertion Sort  | O(n)         | O(n²)        | O(n²)        | O(1)            |
| Merge Sort      | O(n log n)   | O(n log n)   | O(n log n)   | O(n)            |
| Quick Sort      | O(n log n)   | O(n log n)   | O(n²)        | O(log n)        |

---

## 🧩 Algorithm Insights

### 🔹 Bubble Sort
- Repeatedly swaps adjacent elements
- Simple but inefficient
- Best for learning basics

---

### 🔹 Selection Sort
- Selects smallest element and places it at correct position
- Fewer swaps than bubble sort
- Still inefficient for large inputs

---

### 🔹 Insertion Sort
- Builds sorted array step-by-step
- Efficient for small or nearly sorted arrays

---

### 🔹 Merge Sort
- Divide and conquer algorithm
- Splits array → sorts → merges
- Stable and efficient

---

### 🔹 Quick Sort
- Uses pivot element
- Partitions array into smaller/larger elements
- Very fast in practice

---

## 🔁 Common Techniques Used

- Swapping elements
- Partitioning (Quick Sort)
- Divide & Conquer (Merge Sort)
- In-place sorting vs extra space

---

## 🎯 Goal

To understand different sorting strategies, their trade-offs, and when to use each algorithm efficiently.

---

Sorting is not about memorizing code, it’s about understanding patterns.
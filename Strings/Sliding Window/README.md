# 🔤 Strings - Sliding Window

This section focuses on solving string-based problems using the **Sliding Window** technique.

---

## 📌 What is Sliding Window?

Sliding Window is an optimization technique used to reduce time complexity from brute force approaches (O(n²)) to linear time (O(n)).

Instead of checking all substrings, we maintain a **window (range of indices)** and adjust it dynamically.

---

## 🧠 Types of Sliding Window

### 1. Variable Size Window

* Window expands and shrinks based on conditions
* Used when constraints are dynamic

**Example Problems:**

* Longest Substring Without Repeating Characters
* Longest Repeating Character Replacement

---

### 2. Fixed Size Window

* Window size remains constant (k)
* Slide window forward by adding one element and removing one

**Example Problems:**

* Maximum Number of Vowels in a Substring of Length K

---

## ⚙️ Core Pattern

### Variable Window Template:

```java
while (condition breaks) {
    shrink window (left++)
}

expand window (right++)
update result
```

---

### Fixed Window Template:

```java
// process first window

for (right = k; right < n; right++) {
    add new element
    remove old element
    update result
}
```

---

## 🛠️ Common Data Structures Used

* **HashSet** → Track unique characters
* **HashMap** → Store frequency of characters

---

## 🚀 Problems Covered

* Longest Substring Without Repeating Characters
* Maximum Number of Vowels in a Substring of Length K

*(More will be added as progress continues)*

---

## 📌 Key Learnings

* Focus on patterns, not individual problems
* Understand when to expand vs shrink the window
* Efficient use of Hashing improves performance

---

## 📈 Progress

Currently working on:

* Advanced Sliding Window problems
* Combining HashMap with window techniques

---

Consistency is the goal. Improvement is the result.

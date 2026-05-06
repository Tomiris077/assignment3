# Assignment 3 - Algorithm Analysis

## A. Project Overview
This project analyzes the performance of Bubble Sort, Merge Sort, and Binary Search.

The purpose is to compare their efficiency on arrays of different sizes.

---

## B. Algorithm Descriptions

### Bubble Sort
Bubble Sort compares adjacent elements and swaps them.

Time Complexity: O(n^2)

---

### Merge Sort
Merge Sort divides the array and merges sorted parts.

Time Complexity: O(n log n)

---

### Binary Search
Binary Search splits the array in half each time.

Time Complexity: O(log n)

---

## C. Experimental Results

| Array Size | Bubble Sort | Merge Sort | Binary Search |
|------------|------------|------------|----------------|
| 10         | 13087600     | 149600    | 12711900      |
| 100        | 282200     | 141300     | 1900         |
| 1000       | 16681800    | 1893000     | 2200         |

### Analysis
- Bubble Sort is very slow for large arrays
- Merge Sort is efficient
- Binary Search is fastest but needs sorted array

---

## D. Screenshots

![Run ![result.png](../docs/result/result.png)

---

## E. Reflection

In this project, I learned how algorithm efficiency affects performance. Bubble Sort is simple but slow, while Merge Sort is much faster.

I also understood that theoretical complexity matches real performance. One challenge was organizing the code and measuring time correctly.

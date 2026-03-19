## Two Pointers Approach

### 📌 Definition
Two Pointers is a technique where we use two indices (pointers) to traverse an array or list in a controlled way to reduce time complexity.

---

### 🚀 Why use it?
It helps in reducing time complexity from O(n²) → O(n) in many problems.

---

### 📍 When to Use
- When array/string is **sorted** (very common condition)
- When asked to find:
  - Pair with given sum
  - Remove duplicates
  - Reverse array/string
  - Compare elements from both ends
- When brute force gives O(n²)

---

### 🔁 Types of Two Pointers

1. **Opposite Direction**
   - One pointer at start, one at end
   - Example: Pair sum in sorted array

2. **Same Direction**
   - Both pointers move forward
   - Used in sliding window problems

---

### ⚙️ How it Works
- Initialize two pointers:
  - `left = 0`
  - `right = n - 1`
- Move pointers based on condition:
  - If sum < target → move left++
  - If sum > target → move right--

---

### 🧠 Example

Find if a pair exists with sum = 10

Array: [1, 2, 3, 4, 6]

left = 1, right = 6  
1 + 6 = 7 → move left  
2 + 6 = 8 → move left  
3 + 6 = 9 → move left  
4 + 6 = 10 ✅ Found

---

### ⚠️ Important Points
- Works best on **sorted arrays**
- Avoid using on unsorted data (unless sorted first)
- Always ensure pointers don’t overlap incorrectly

---

### ⏱️ Complexity
- Time: O(n)
- Space: O(1)

---

### 🎯 Bonus Tip
If array is **not sorted**, you can:
- Sort it first → O(n log n)
- Then apply two pointers

---

### 📊 Visual Representation (Optional but Recommended)
Add a diagram showing:
[1, 2, 3, 4, 6]
 ↑           ↑
 L           R

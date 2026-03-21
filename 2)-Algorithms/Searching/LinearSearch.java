import java.util.Scanner;

public class LinearSearch
{
    static int linearSearch(int nums[], int target)
    {
        int n=nums.length;
        int index=-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                index=i;
                return index;
            }
        }
        return index;

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        // Taking input for Array size
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();

        int nums[]=new int[n];

        // Taking input for Inserting elements inside the array
        System.out.println("Enter the elements inside the array: ");

        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println();

        System.out.println("Array elements are: ");
        // Printing array elements
        for(int i=0;i<n;i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // Linear Search Implementation
        System.out.print("Enter the target elemnet to be search: ");
        int target=sc.nextInt();

        System.out.println("");

        // Calling method
        int result=linearSearch(nums, target);

        System.out.print("Index of element " + target + " is: " + result);
    }
}



// 📌 Linear Search – Concept & Theory
// 🔹 What is Linear Search?

// Linear Search is the simplest searching algorithm where you check each element of the array one by one until the target element is found or the array ends.

// 🔹 How it Works
// Start from the first element
// Compare each element with the target
// If match → return index
// If not found till end → return -1
// 🔹 Example

// Array: [10, 20, 30, 40]
// Target: 30

// 👉 Comparisons:

// 10 ❌
// 20 ❌
// 30 ✅ → Found at index 2
// 🔹 Time Complexity (TC)
// Best Case: O(1) → Element found at first position
// Average Case: O(n)
// Worst Case: O(n) → Element at last or not present
// 🔹 Space Complexity (SC)
// O(1) → No extra space used (constant space)
// 🔹 When to Use
// Small datasets
// Unsorted arrays
// When simplicity is more important than speed
// 🔹 When NOT to Use
// Large datasets
// When data is sorted (use Binary Search instead)

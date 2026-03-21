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

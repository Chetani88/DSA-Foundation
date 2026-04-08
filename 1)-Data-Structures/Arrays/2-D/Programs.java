// 1)Printing Matrix
import java.util.Scanner;

public class Matrix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of Rows: ");
        int Rows=sc.nextInt();

        System.out.println("Enter the number of Columns: ");
        int Columns=sc.nextInt();

        int Matrix[][]=new int[Rows][Columns];

        // Taking Input
        for(int i=0;i<Rows;i++)
        {
            for(int j=0;j<Columns;j++)
            {
                Matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println();

        // Printing Matrix

        for(int i=0;i<Rows;i++)
        {
            for(int j=0;j<Columns;j++)
            {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}

// 2)Addtion of Matrix

import java.util.Scanner;

public class MatrixAddition 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of Rows for Matirx A: ");
        int r1=sc.nextInt();
        System.out.print("Enter the number of Columns of Matrix A: ");
        int c1=sc.nextInt();

        System.out.print("Enter the number of Rows for Matrix B: ");
        int r2=sc.nextInt();
        System.out.print("Enter the number of Columns for Matrix B: ");
        int c2=sc.nextInt();

        int[][] A=new int[r1][c1];

        int[][] B=new int[r2][c2];

        // Resultant Matrix
        int Matrix[][]=new int[r1][c1];

        if(r1!=r2 || c1!=c2 )
        {
            System.out.println("Matrix Addition not Possible");
        }
        else
        {

            System.out.println("Enter the elements for Matrix A: ");
            // Taking Input for Matrix A
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    A[i][j]=sc.nextInt();
                }
            }

            System.out.println();

            System.out.println("Enter the elements for Matrix B: ");
            // Taking Input for Matrix B
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    B[i][j]=sc.nextInt();
                }
            }

            System.out.println("\n");
            System.out.println("Matrix Addition: ");
            // Addition
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    Matrix[i][j]=A[i][j]+B[i][j];
                    System.out.print(Matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        
    }
    
}

//3) Matrix Multiplication
import java.util.Scanner;

public class MatrixMultiplication
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the Rows and Columns for Matrix A: ");
    int r1=sc.nextInt();
    int c1=sc.nextInt();

    System.out.print("Enter the Rows and Columns for Matrix B: ");
    int r2=sc.nextInt();
    int c2=sc.nextInt();

    int A[][]=new int[r1][c1];
    int B[][]=new int[r2][c2];

    int Resultant[][]=new int[r1][c2];

    // Condition
    if(c1!=r2)
    {
        System.out.println("Matrix Multiplication is not possible");
    }
    else
    {
        // Taking input for Matrix A
        System.out.println("Enter the elements for Matrix A: ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println();

        // Taking input for Matrix B
        System.out.println("Enter the elements for Matrix B: ");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matrix A: ");

        // Printing Matrix A
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Matrix B: ");

        // Printing Matrix B
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        // logic
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<c1;k++)
                {
                    Resultant[i][j]+=A[i][k]*B[k][j];
                }
            }
        } 

        System.out.println("\n");
        System.out.println("Resultant Matix: ");
        // Printing Resultant Matrix
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(Resultant[i][j] + " ");
            }
            System.out.println();
        }
    }

    }
}



// 4) Transpose of a Matrix A
// (I) Using extra space
import java.util.Scanner;

public class Transpose
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the Rows and Columns for Matrix A: ");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int A[][]=new int[r][c];

        int AT[][]=new int[c][r];

        // Taking input
        System.out.println("Enter the elements of Matrix A: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println();

        // Printing Matrix A
        System.out.println("Matrix A: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose logic
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                AT[j][i]=A[i][j];
            }
        }
        System.out.println("\n");
        System.out.println("A Transpose AT is: ");

        // Printing Transpose Matrix AT
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(AT[i][j] + " ");
            }
            System.out.println();
        }

       }
}

// (II) Inspace (Within same Array)  --------> Only valid for a Square Matrix

// Transpose of a Matrix A only for a Sqaure Matrix
import java.util.Scanner;

public class Transpose
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the Rows and Columns for Matrix A: ");
        int r=sc.nextInt();
        int c=sc.nextInt();

        if(r!=c)
        {
            System.out.println("Transpose is not Possible Inplace");
        }

        else
        {
            int A[][]=new int[r][c];

        // Taking input
        System.out.println("Enter the elements of Matrix A: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println();

        // Printing Matrix A
        System.out.println("Matrix A: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        // Transpose logic
        for(int i=0;i<r;i++)
        {
            for(int j=i+1;j<c;j++)
            {
                int temp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }

        // Priting Transpose Matrix A
        System.out.println("A Transpose is: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        }
    }
}




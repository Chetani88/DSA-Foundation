// Creating Linked List  different methods
public class Basics 
{
    public static class Node 
    {
        int data;
        Node next;

        Node(int data) 
        {
            this.data = data;
        }
    }

    public static void printList(Node head)
    {
        Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }

        Node a=head;

        while(a!=null)
        {
            System.out.print(a.data + " ");
            a=a.next;
        }
    }

    public static void main(String[] args)
    {
        Node a=new Node(5);
        System.out.println("Address of a: " + a); // address of a
        System.out.println("element at a: " + a.data); // value of data or element
        System.out.println("address at a: " + a.next); // address of next node which
        a has

        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next=null;

        // By using every node
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);
        System.out.println(e.data);

        // By using only one node a and printing whole Linked List
        System.out.println(a.data);                            // 5
        System.out.println(a.next.data);                       // 5-->6
        System.out.println(a.next.next.data);                  // 5-->6-->7
        System.out.println(a.next.next.next.data);             // 5-->6-->7-->8
        System.out.println(a.next.next.next.next.data);        // (head) 5-->6-->7-->8-->9 (tail)


        // Printing through loop ----->  If know Linked List size
        Node temp=a;
        for(int i=1;i<=5;i++)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }

        // System.out.println();
      
        for(int i=1;i<=5;i++)
        {
            System.out.print(a.data + " ");
            a=a.next;
        }

        // Printing Linked List thorugh loop -----> If I don't know Linked List size
        Node temp=a;
        while(temp!=null)
        {
            System.out.print(temp.data);
            temp=temp.next;
        }

        while(a!=null)
        {
            System.out.print(a.data + " ");
            a=a.next;
        }

        // Printing Linked List through method
        printList(a);
    }
}


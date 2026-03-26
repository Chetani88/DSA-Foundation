import java.util.Scanner;

public class Toogle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        StringBuilder sb=new StringBuilder(sc.nextLine());

        System.out.println();
        
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);

            if(ch==' ') continue;

            if(ch>='a' && ch<='z')
            {
            int ascii=(int)ch;

                ascii-=32;

                char dh=(char)ascii;

                sb.setCharAt(i, dh);
           }

            else if(ch>='A' && ch<='Z')
            {
                int asci=(int)ch;
                  
              asci+=32;

              char dh=(char)asci;

              sb.setCharAt(i, dh);
             
           }          
        }

        System.out.println(sb);
    }
}

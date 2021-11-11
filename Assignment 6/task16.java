import java.util.Scanner;
public class task16
{
     public static void main(String [] args)
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number");
          int n=sc.nextInt();
          int y=0;
          int i=0;
          for(int c=1;c<=n;c++){
               i=(c/(2c-1));
               y=y+i;
          }
          System.out.println(y);
     }
}
          
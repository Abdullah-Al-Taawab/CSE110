import java.util.Scanner;
public class task14
{
     public static void main(String [] args)
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number");
          int n=sc.nextInt();
          int y=0;
          for(int c=1;c<=n;c++){
               y=(y+(c*c*c));
          }
          System.out.println(y);
     }
}
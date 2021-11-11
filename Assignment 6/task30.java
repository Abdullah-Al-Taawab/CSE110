import java.util.Scanner;
public class task30
{
     public static void main(String [] args)
     {
          Scanner sc=new Scanner(System.in);
          int sum=0;
          for(int c=1;c<=20;c++){
               System.out.println("Enter a num");
               int n=sc.nextInt();
               sum=(sum+n);
               System.out.println(sum);
          }
     }
}
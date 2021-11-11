import java.util.Scanner;
public class task28
{
     public static void main(String [] args)
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a num");
          int n=sc.nextInt();
          int pro=1;
          for(int c=1;c<=n;c++){
               System.out.println("Enter a num");
               int num=sc.nextInt();
               pro=pro*num;
          }
          System.out.println(pro);
     }
}

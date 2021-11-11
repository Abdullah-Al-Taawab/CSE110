import java.util.Scanner;
public class task20
{
     public static void main(String [] args)
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a num");
          int n=sc.nextInt();
          int sum=0;
          for(int c=1;c<=n;c++){
               if(c%7==0){
                    sum=(sum+c);
               }
          }
          System.out.println(sum);
     }
}
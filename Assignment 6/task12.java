import java.util.Scanner;
public class task12
{
     public static void main(String [] args)
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number");
          int n=sc.nextInt();
          int max=n;
               int sum=n;
          for(int c=1;c<=6;c++){
               System.out.println("Enter a number");
               int N=sc.nextInt();
               if(N>max){
                    max=N;
               }
               sum=(sum+n);
          }
          double avg=(sum/7);
          System.out.println(max);
          System.out.println(avg);
     }
}
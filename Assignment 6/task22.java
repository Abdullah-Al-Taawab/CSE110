import java.util.Scanner;
public class task22
{
     public static void main(String [] args)
     {
          Scanner sc=new Scanner(System.in);
          int sum=0,d=0;
          for(int c=1;c<=10;c++){
               System.out.println("Enter a number");
               int n=sc.nextInt();
               if(n%2!=0){
                    sum=(sum+n);
                    d=(d+1);
               }
          }
        double avg=(sum/d);
        System.out.println(sum);
        System.out.println(avg);
     }
}
      
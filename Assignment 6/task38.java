import java.util.Scanner;
public class task38
{
     public static void main(String [] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a num");
       int n=sc.nextInt();
           int d=0;
          for(int c=1;c<=n;c++){
           if(n%c==0){
             d=(d+1);
           }
          }
       if(d==2){
             System.out.println("prime");
           }
       else{
         System.out.println("not prime");
         }
       }
}
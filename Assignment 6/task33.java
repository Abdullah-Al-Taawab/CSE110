import java.util.Scanner;
public class task33
{
     public static void main(String [] args)
     {
          int s=0,p=1;
          System.out.println(s);
          System.out.println(p);
          for(int sum=0;sum<1600;){
               sum=(s+p);
               if(sum<1600){
                    System.out.println(sum);
               }
               s=p;
               p=sum;
          }
     }
}
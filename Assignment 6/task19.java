import java.util.Scanner;
public class task19
{
     public static void main(String [] args)
     {
          int sum=0;
          for(int n=1;n<=600;n++){
               if(n%7==0){
                    if(n%9!=0){
                         sum=(sum+n);
                    }
               }
               if(n%7!=0){
                    if(n%9==0){
                         sum=(sum+n);
                    }
               }
               System.out.println(sum);
          }
     }
}

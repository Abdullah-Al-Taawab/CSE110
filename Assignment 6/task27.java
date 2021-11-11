import java.util.Scanner;
public class task27
{
     public static void main(String [] args)
     {
          int sum=0;
          for(int n=10;n<=60;n++){
               if(n%2==0){
                    sum=(sum+n);
               }
          }
          System.out.println(sum);
     }
}
                        
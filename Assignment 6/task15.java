import java.util.Scanner;
public class task15
{
     public static void main(String [] args)
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number");
          int n=sc.nextInt();
          int y=0;
          for(int c=1;c<=n;c++){
               if(c%2==0){
                    y=(y-(c*c));
               }
               else {
                    y=(y+(c*c));
               }
               System.out.println(y);
          }
     }
}
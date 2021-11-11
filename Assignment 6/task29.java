import java.util.Scanner;
public class task29
{
     public static void main(String [] args)
     {
           int pro=1;
           for(int n=3;n<=13;n++){
                if(n%2==0){
                     pro=(pro*n);
                }
           }
           System.out.println(pro);
     }
}

import java.util.Scanner;
public class task19
    
{
    public static void main(String[] args)
    {
        Scanner meow=new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<a.length;i++)
        {
            a[i]=meow.nextInt();
        }
        for(int i=0;i<a.length;i+=2)
        {
            System.out.print(a[i]+",");
        }
        for(int i=1;i<a.length;i+=2)
        {
            if(i!=a.length-1)
            {
                System.out.print(a[i]+",");
            }
            else
            {
                System.out.print(a[i]+".");
            }
            
        }
    }
    
}
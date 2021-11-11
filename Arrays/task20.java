import java.util.Scanner;
public class task20
{
    public static void main(String[] args)
    {
        Scanner meow=new Scanner(System.in);
        String[] a=new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.println("Enter a number");
        int n=meow.nextInt();
        System.out.println(a[n]);
    }
}
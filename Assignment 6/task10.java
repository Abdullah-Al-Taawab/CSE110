import java .util.Scanner;
public class task10
{
public static void main(String [] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the name of your favourite car");
  String name=sc.nextLine();
   System.out.println("Enter num");
   int n=sc.nextInt();
   int c ;
   for(c=1;c<=n;c++){
     System.out.println(name);
   }
}
}
  
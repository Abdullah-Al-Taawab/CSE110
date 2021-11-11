import java .util.Scanner;
public class task03
{
public static void main(String [] args)
{
  Scanner sc=new Scanner(System.in);
  int c;
  for(c=1;c<=5;c++){
    System.out.println("Enter a num");
    int n=sc.nextInt();
    if(n%2==0){
      System.out.println("even");
    }
    else{
      System.out.println("odd");
    }
  }
}
}
import java.util.Scanner;
public class task14{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    if(n!=10)
    {
      if(n%2==0)
      {
      if(n>10)
      {
        System.out.println("An even number greater than 10");
      }
      else
      {
        
        System.out.println("An even number not greater than 10");
      }}
    else
    {
      if(n>10)
      {
        System.out.println("An odd number greater than 1o");
      }
      else
        System.out.println("An odd number not greater than 10");
    }
    
  }
}
  }

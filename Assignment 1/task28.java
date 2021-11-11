import java.util.Scanner;
public class task28
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of s");
    int s=sc.nextInt();
    int L;
    if(s>=100){
      L=12000/(4+((s*s)/14900));
      System.out.println(L);
    }else{
      L=3000-(125*(s*s));
      System.out.println(L);
    }
  }
}
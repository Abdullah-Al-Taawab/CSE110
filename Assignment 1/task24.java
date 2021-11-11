import java.util.Scanner;
public class task24
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter num1");
    double n1=sc.nextDouble();
    System.out.println("Enter n2");
    double n2=sc.nextDouble();
    double add,sub,div,multi;
    System.out.println("Enter an operator");
    String opt=sc.next();
      if(opt.equals("+")){
      add=n1+n2;
      System.out.println(add);
    }
    if(opt.equals("-")){
      sub=n1-n2;
      System.out.println(sub);
    }
    if(opt.equals("*")){
      multi=n1*n2;
      System.out.println(multi);
    }
    if(opt.equals("/")){
      div=n1/n2;
      System.out.println(div);
    }
  }}
      
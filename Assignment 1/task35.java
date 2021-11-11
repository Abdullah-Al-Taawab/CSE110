import java.util.Scanner;
public class task35
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter hour");
    int h=sc.nextInt();
    if(h<0){
      System.out.println("wrong input");
    }
    if(h<=3){
      System.out.println("patience is a virtue");
    }
    else if(h<=6){
      System.out.println("break fast");
    }
    else if(h<=11){
      System.out.println("patience is a virtue");
    }
    else if(h<=13){
      System.out.println("lunch");
    }
    else if(h<=15){
      System.out.println("patience is a virtue");
    }
    else if(h<=17){
      System.out.println("Snacks");
    }else if(h<=18){
      System.out.println("patience is a virtue");
    }else if(h<=20){
      System.out.println("Dinner");
    }
    else if(h<=23){
      System.out.println("patience is a virtue");
    }else
    {
      System.out.println("Wrong time");
    }
  }
}
    
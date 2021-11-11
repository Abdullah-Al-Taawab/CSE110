import java.util.Scanner;
public class task07{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n1=sc.nextInt();
    System.out.println("enter a number 2");
    int n2=sc.nextInt();
    if(n1>n2){
      System.out.println("first is greater");
    }else{
      System.out.println("first is not greater");
    }
  }}
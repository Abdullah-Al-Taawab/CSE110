import java.util.Scanner;
public class task08{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n1=sc.nextInt();
    System.out.println("enter a number 2");
    int n2=sc.nextInt();
    if(n1>n2){
      System.out.println("first is greater");
    }
      if(n2>n1){
        System.out.println("Second is greater");
      }else{
        System.out.println("the numbers are equal");
      }
  }}
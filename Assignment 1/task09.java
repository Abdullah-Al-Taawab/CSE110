import java.util.Scanner;
public class task09{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n1=sc.nextInt();
    System.out.println("enter a number 2");
    int n2=sc.nextInt();
    int sub;
    if(n1>n2){
      sub=n1-n2;
    }else{
      sub=n2-n1;
    }
    System.out.println("sub is " + sub);
  }}
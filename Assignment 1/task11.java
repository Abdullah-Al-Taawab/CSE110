import java.util.Scanner;
public class task11{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n1=sc.nextInt();
    System.out.println("enter a number 2");
    int n2=sc.nextInt();
    System.out.println("Enter a number3");
    int n3=sc.nextInt();
    System.out.println("enter a number 4");
    int n4=sc.nextInt();
    System.out.println("enter a number 5");
    int n5=sc.nextInt();
    int sum,average;
    sum=n1+n2+n3+n4+n5;
    average=sum/5;
    System.out.println("average is" + average);
  }}
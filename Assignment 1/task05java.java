import java.util.Scanner;
public class task05{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter radius");
    int r=sc.nextInt();
    double circumference,area;
    double pi=3.1416;
    circumference=2* pi*r;
      area=2*pi*(r*r);
       System.out.println("circumference is" + circumference);
        System.out.println("area is " + area );
  }}
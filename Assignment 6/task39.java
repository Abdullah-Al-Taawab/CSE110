
public class task39
{
     public static void main(String [] args)
     {
       int n;
       for( n=1;n<1000;n++){
         int c=1;
         int d=0;;
          for(c=1;c<=n;c++){
           if(n%c==0){
             d=(d+1);
           }
          }
       if(d==2){
             System.out.println(n);
           }
         }
       }
}
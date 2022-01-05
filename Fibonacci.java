import java.io.*;
abstract class fibo
{
    int n;
    int d;
    int a=0;
    int b=1;
    int c;
    abstract void fibonaci();
}
public class FibonacciExample1{
    public static void main(String[] args) throws Exception
 {
     fibo1 obj = new fibo1();
     obj.fibonaci();
 }
}
class fibo1 extends fibo
{
    
    void fibonaci()
    {
        try{
        File file = new File("C:\\Users\\prade\\Pictures\\Input.txt");
         FileReader fin= new FileReader(file);
         while ((n=fin.read())!= -1){
             System.out.println("Fibonacci series upto "+n+" is :-");
             d=n;
         }
         
      while(c<d)
         {
             System.out.print(c+" ");
             c=a+b;
             a=b;
             b=c;
             
         }
       
         
         
        }catch(IOException e){}
}
}

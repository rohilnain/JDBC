package Exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo {
    private static void def() throws IOException {
        //if we do not throw or catch IOException
        //it will not compile and will ask you to handle this before only
        //so checked Exception like (IO Exception,SQL Exception) must be handled before


        //...........
        //if Exception are checked exception then either we need to catch it (using try-catch block)
        //or it should throw that exception which eventually should be caught before reaching to jvm.
        FileInputStream fileInputStream=new FileInputStream("test");
        System.out.println(fileInputStream);
    }
    private static int abc(){
        int g=0;
        int a=50;
        try{
            a=a/g;
            //they are unchecked exception like (Arithmetic Exception, NumberFormat,null pointer)
            //compiler will not force you to handle it
            //but they should be handled, so that code can execute gracefully
            //otherwise it will terminate and go to jvm.


            //....//try doesn't always need catch, it can exist with finally also
        }
        catch (ArithmeticException e){
            try{
                int s=0/0;
            }catch(ArithmeticException exe){
                System.out.println("catch of catch of upper try "+exe);
            }
            //so we can many nested try catch block just to handle exception gracefully
            //neither program will go to finally block and then to main and then to jvm
            //when using try catch block we can handle that gracefully and it does not go back to jvm and terminate
            System.out.println("Inside Catch block Arithmetic Exception "+e);
        }
        catch (RuntimeException e){
            System.out.println("Inside Catch block Runtime Exception "+e);
        }
        catch(Exception e){
            System.out.println("Inside Catch block Exception"+e);
        }finally {
            //If anything happens with upper try catch block it always
            //comes to the finallly block except when explicitly done System.exit({some status code})
            System.out.println("Inside finally block");
        }

        return a;
    }
    public static void main(String[] args) {
        try{
            //it is handled here because it has been thrown from def() function call
            //we must handle this before it going to the jvm
           def();
        }catch(IOException e){
            System.out.println("IOException "+e);
        }
        System.out.println(abc());
    }
}

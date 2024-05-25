package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class Demo {
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
    private static void jkl(boolean var) throws IOException,ArithmeticException{
        if(var==true) System.out.println("Correct values accessed");
        else throw new IOException("var is not found");

    }
    private static void ghi(){
        FileInputStream fileInputStream=null;
        try{
            fileInputStream=new FileInputStream("test2");
            System.out.println("Inside try of ghi and using try with resources");
        }catch(IOException e){
            System.out.println("Inside catch block of ghi, file input trying with resources"+e);
        }
        finally {
            try {
                fileInputStream.close();
                System.out.println("Inside finally block, file closed");
            } catch (Exception e) {
                System.out.println("Exception while closing FileInputStream: " + e);
            }
        }


        //or simply you can use try with resources
        try(FileInputStream fileInputStream1=new FileInputStream("test1")){
            System.out.println("Inside try block of try with resources");
        }catch(IOException e){
            System.out.println("Using try with resources it automatically handles closing of resources");
        }
            }
    private static void tuv() throws CustomIllegalAgeException{
        int age=10;
        if(age<18) throw new CustomIllegalAgeException("Age is below 18 year",age);
    }
    public static void main(String[] args) {

        System.out.println(abc());

        try{
            //it is handled here because it has been thrown from def() function call
            //we must handle this before it going to the jvm
           def();
        }catch(IOException e){
            System.out.println("IOException "+e);
        }
        try{
            jkl(false);
        }catch(IOException e1){
            System.out.println("Inside catch of handling function call jkl throw"+e1);
        }
        ghi();

        //Custom illegal exception handling
        try{
            tuv();
        }catch(Exception e){
            System.out.println("Catching Custom illegal age Exception"+e);
        }
    }
}

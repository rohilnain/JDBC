package Exception;

public class CustomIllegalAgeException extends RuntimeException{
    int age=18;
    public  CustomIllegalAgeException(String message,int age){
        super(message);
       this.age=age;
    }
}

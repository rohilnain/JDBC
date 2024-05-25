package HashCodeEquals;

public class Client {
    public static void main(String[] args) {
        Student student=new Student("rohil",1);
         Student student1=new Student("rohil",1);

         //If equals method not implemented then it will say false
        //String class already implemented that thats why not giving error
        //So implement them
        //If by implementing equals you are making it equal, also make their hashcode equals
        //because its a contract vice versa may not be true
         System.out .println(student.equals(student1));
         System.out .println(student.hashCode());
         System.out .println(student1.hashCode());

         String s="rohil";
         String p="rohil";
         System.out.println(s.equals(p));
         System.out .println(s.hashCode());
         System.out .println(p.hashCode());
    }
}

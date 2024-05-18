package Encapsulation_L1;

public class Client {
    public static void main(String[] args){
        Student student1=new Student();
        student1.printStudent();

        Student student2=new Student("Rohil Nain",25);
        System.out.println(student2.age);
        student2.printStudent();

        System.out.println(Student.noOfStudents);

    }
}

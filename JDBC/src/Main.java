import Encapsulation_L1.Student;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        student.printStudent();

        Student student2=new Student("Nikita Deswal",24);
        student2.printStudent();

        System.out.println(Student.noOfStudents);


    }
}
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


//Modifiers Description
//public: Code can be accessed from anywhere in the code.
//protected: Code can be accessed from within the declared same package or subclass from some outside package.
//private: Code can be accessed from within the declared class.
//default (no modifier): Code can be accessed from within the same declared package.
//Access Levels
//public
//Class: Yes
//Package: Yes
//Subclass: Yes
//World: Yes
//protected
//Class: Yes
//Package: Yes
//Subclass: Yes
//World: No
//default (no modifier)
//Class: Yes
//Package: Yes
//Subclass: No
//World: No
//private
//Class: Yes
//Package: No
//Subclass: No
//World: No







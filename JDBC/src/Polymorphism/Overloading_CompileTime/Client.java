package Polymorphism.Overloading_CompileTime;

public class Client {
    public static void main(String[] args) {
        Employee employee = new Employee("Yukta", 1, 20);

        employee.work();
        employee.work("Coding");
        employee.work("Coding", 12);
        employee.work(12,"history");

    }
}
//Note: So at compile time compiler decides which function to call based on
//name and parameter (all mix of it), it does not depend on return type;

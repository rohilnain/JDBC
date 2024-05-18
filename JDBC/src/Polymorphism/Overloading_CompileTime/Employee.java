package Polymorphism.Overloading_CompileTime;

public class Employee {
    String name;

    int id;

    int salary;

    public Employee() {
    }

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    public String work() {
        System.out.println("Employee is performing default work");
        return "default task is performed";
    }


    public void work(String task1) {
        System.out.println("Employee is performing task " + task1);
    }


    public String work(String task1, String task2) {
        System.out.println("Employee is performing tasks " + task1+" "+task2);
        return "task1 and task2 is performed";
    }

//    public void work(String task1, String task2) {
//        System.out.println("Employee is performing task " + task1 + " and " + task2);
//    }
// it will not be overided because it depends on name of function, number and type or mix of  parameter (not on return type)

    public void work(int hours) {
        System.out.println("Employee is performing default task for time: " + hours);
    }

    public void work(String task, int time) {
        System.out.println("Employee is performing task " + task +
                " for " + time + " hours");
    }

    //they will be overidden because sequence of parameter is different
    public void work(int time, String task) {
        System.out.println("Employee is performing task " + task +
                " for " + time + " hours");
    }
}

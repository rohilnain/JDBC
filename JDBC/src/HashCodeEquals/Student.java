package HashCodeEquals;

public class Student {

    String name;

    Integer rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    //See if equals are same, then its a contract hashcode should also be same
    //vice versa may not be true;
    @Override
    public boolean equals(Object s) {
        if (this == s) {
            return true; // comparing with same object
        }
        if (!(s instanceof Student)) {
            return false; // incompatible types and better to use ClassOf because it can be base class for other then instanceOf can fail
        }

        Student student = (Student) s;
        if (this.name.equals((student.name)) && (this.rollNo == student.rollNo)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.rollNo.hashCode();
        // logic -> if name is same, and if roll no is same
    }

}

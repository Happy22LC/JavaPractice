package creationOfObj;

public class NoteBook {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println( student.name + ", aged "+ student.age + ", lives in "+ student.state+
                " with "+student.balance + " in their bank account.");
        System.out.println( student.name1 + ", aged "+ student.age1 + ", lives in "+ student.state1+
                " with "+student.balance1+ " in their bank account.");
    }
}

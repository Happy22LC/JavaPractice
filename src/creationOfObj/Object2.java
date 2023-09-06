package creationOfObj;
// if we want to call any class's property we need to create another object by refer that class object.

public class Object2 {
    public static void main(String[] args) {
        Object1 call = new Object1();// here we called the Object1 Class's object.
        System.out.println(call.i * call.j);
    }
}

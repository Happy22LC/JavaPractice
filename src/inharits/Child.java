package inharits;
//Simple example of inheritance :
/*
* Overloading allows different methods to have the same name,but different signatures where
* the signature can differ by the number of input parameters or type of input parameter,
* sequence of parameters or combination of those*/
public class Child extends Parent{
    public static void main(String[] args) {
        // we can call any Parents class method by using normal object creation.
        GrandParent gp = new GrandParent();
        gp.GrandMother();
        gp.GrandFather();

        Parent p = new Parent();
        p.Father();
        p.Mother();

        Child c = new Child();
        c.baby();
        c.print();
        //calling the same method name
        c.print(2,1);


    }
    String colorOfHair = "Brown";
    String colorOfEye = "Brown";
    void baby()
    {
        int age = 20;
        System.out.println("Child is " + age + " years old");
    }
    /*in Java when we want to inherit any super class property have to use "super" keyword and it
    only works with the immediate parent class.
    * and inside the same class have to use "this" keyword
    * this is one way process, supper class can not call the child class element */
    void print()
    {
        System.out.println("Grand father's hair is " + super.hairOfGrandFather);
        System.out.println("Baby's eys color is " + this.colorOfEye);
    }
    /*
    * Java allows same method name in a same class
    * Is called method Overloading */
    void print(int z, int x)
    {
        System.out.println(z + x);
        return;
    }


}

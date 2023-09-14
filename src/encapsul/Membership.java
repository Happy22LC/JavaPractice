package encapsul;

/* if we want to use any private property of any class we can use by encapsulation. we have to generate
* getter and setter method of that property inside of that class and we have to set the value of that property
* in called class*/

public class Membership {
    public static void main(String[] args) {
        PersonalData pd = new PersonalData();// created object
        pd.setsSN("123456789");// set the value
        pd.setdOb("01/01/2000");
        pd.setBalance(6364.56);
        // called the property with get method
        System.out.println("SSN is: " + pd.getsSN() + ". DOB is: " + pd.getdOb() + " Balance is: " + pd.getBalance());
    }
}

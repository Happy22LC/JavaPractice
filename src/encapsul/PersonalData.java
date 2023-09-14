package encapsul;
/*
Getter and Setter are those methods in java that are used to retrieve the value of a
data member and update or set the value of a data member respectively.*/
//In Java, Getter and Setter are methods used to protect your data and make your code more secure.
// Getter and Setter make the programmer convenient in setting and getting the value for a particular data type.

public class PersonalData {
    private String sSN;
    private String dOb;
    private double balance;

    public String getsSN() {
        return sSN;
    }

    public void setsSN(String sSN) {
        this.sSN = sSN;
    }

    public String getdOb() {
        return dOb;
    }

    public void setdOb(String dOb) {
        this.dOb = dOb;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

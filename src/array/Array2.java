package array;

import java.util.ArrayList;

public class Array2 {
    public static void main(String[] args) {

        //String[] fruit1 = {"Apple", "Banana", "Orange", "Mango"};//initialization of array
        //String[] fruit2 = new String[4]; // creating an object
        ArrayList<String> fruits = new ArrayList<>(); // creating a list of array

        fruits.add("kiwi");//Adding the element on the array list
        fruits.add("Greps");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        //if I want to print element on specific index I can print with using method
        fruits.add(1, "coconut");

        for(int x = 0; x < fruits.size(); x++)
        {
            System.out.println(fruits.get(x));
        }
        System.out.println(fruits);// prints as an array
    }
}

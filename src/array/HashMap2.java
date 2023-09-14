package array;

import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        /* HashMap similar Array list and its works like  key-value pair
        * we can set the key and set the value*/
        HashMap<String, Double> groceries = new HashMap<>();

        groceries.put("Vegetable", 10.23);
        groceries.put("Rice", 24.99);
        groceries.put("Fish", 50.23);

        //loop throw all element of hashMap

        for (String s : groceries.keySet())
        {
            System.out.println(s + " - " + groceries.get(s));
        }


    }
}

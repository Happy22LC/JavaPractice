package array;

public class Array1 {
    public static void main(String[] args) {
        //Array practice

        int[] day1 = {5, 10, 15};
        int[] day2 = {5, 10, 18};
        String[] fruit = {"Apple", "Banana", "Orange", "Mango"};


        //System.out.println(day1[0] + day2[2]);
        //System.out.println(fruit[2]);


        for(int i = fruit.length -1; i >= 0; i--) // Reverse the array element
        {
            System.out.println(fruit[i]);
        }
        //Adding all values
        int sum = 0;
        for(int j = 0; j <= day1.length -1; j++)
        {
             sum += day1[j];
        }
        System.out.println(sum);;


    }
}

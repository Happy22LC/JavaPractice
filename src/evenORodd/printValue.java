package evenORodd;

//Find Out if a number is even or odd

import java.util.Scanner; //The import statement in Java allows us to access the class
public class printValue {
    public static void main(String[] args)
    {
        int number;
        Scanner input; //declared the variable input to be of type Scanner
        input = new Scanner(System.in); // Scanner objects make getting input from the user
        System.out.println("Enter a Number"); //print the prompt statements.
        number = input.nextInt(); //to ensure the entered data is of the correct type.The compiler compares the types of the declared variable.
        input.close(); // Closing the Scanner

        if(number % 2 == 0)
        {
            System.out.println("The Number is Even");
        }
        else {
            System.out.println("The Number is Odd");
        }
    }

}

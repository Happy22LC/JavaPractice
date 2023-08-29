package evenORodd;

import java.util.Scanner;

public class printIncome {
    public static void main(String[] args)
    {
        int money;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a Amount of Income");
        money = input.nextInt();
        input.close();

        if(money < 25000)
        {
            System.out.println("Low Income");
        } else if (money > 25000 && money < 78000)
        {
            System.out.println("Lower middle Income");
        } 
        else if (money > 78000 && money < 187000)
        {
            System.out.println("Upper middle Income");
        }
        else {
            System.out.println("Upper Income");
        }
    }
}

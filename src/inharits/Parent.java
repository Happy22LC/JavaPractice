package inharits;

public class Parent extends GrandParent{
    String hairOfFather = "Black";
    String fatherEyeColor = "black";
    void Father()
    {

        int age = 50;
        System.out.println("Father is " + age + " years old");
    }

    void Mother()
    {
        int age = 40;
        System.out.println("Mother is " + age + " years old");
    }
}

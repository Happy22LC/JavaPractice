package array;
/*More Complex:Java also provides us a structure to store data as key/value pairs. Java calls these
objects hashmaps (or maps, more generally), and they are provided by the HashMap class.
store the students grades along with their names in the same data structure.
The names will be the keys, and the grades will be the values.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapGradeBook {
    public static void main(String[] args) {

        HashMap<String, Double> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish): ");
        //Get the student name and grade
        do{
            System.out.println("Student Name: ");
            newStudent = input.nextLine();
            if(!newStudent.isEmpty())
            {
                System.out.println("Grade: ");
                Double newGrade = input.nextDouble();
                students.put(newStudent, newGrade);//We can add a new item with a .put() method, specifying both key and value:
                input.nextLine(); // Read in the newline before loping back

            }
        }while (!newStudent.isEmpty());

        //print class Roster
        System.out.println("\nClass roster: ");
        double sum = 0.0;
        //Looping through a map is slightly more complex than it is for ordered lists.
        // Let’s look at the for-each loop from this
        for(Map.Entry<String, Double> student : students.entrySet())
        {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            sum += student.getValue();
        }
        double avg = sum/ students.size();
        System.out.println("Average grade: " + avg);
    }

}
/*
Only need to access the key of each item in a map, we can construct a simpler loop:

 for (String student : students.keySet()) {
    System.out.println(student);
 }
 A similar structure applies if only need the values, using students.values():

 for (double grade : students.values()) {
    System.out.println(grade);
 }
*/

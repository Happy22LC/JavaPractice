package array;

import java.util.ArrayList;
import java.util.Scanner;

/*Array list example: the user input will add to the students to the arraylist and
user input will add the grade to the listed each student. the compiler will give
us an average grade point of the students*/

public class ArrayListGradeBook {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your student (or ENTER to finish): ");

        //Get the student name
        do{
            newStudent = input.nextLine();
            if(!newStudent.isEmpty())
            {
                students.add(newStudent);
            }
        }while (!newStudent.isEmpty());

        //Get the Student Grade

        for(String stu: students)
        {
            System.out.println("Grade for " + stu + ": ");
            Double newGrade = input.nextDouble();
            grades.add(newGrade);
        }

        // Print the class Roster

        System.out.println("\nClass roster: ");
        double sum = 0.0;

        for(int i = 0; i < students.size(); i++)
        {
            System.out.println(students.get(i) + "(" + grades.get(i) + ")");
            sum += grades.get(i);
        }

        double average = sum / students.size();
        System.out.println("Average grade: " + average);
    }
}

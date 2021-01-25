package interfaceExample;

import java.util.HashMap;
import java.util.Map;

public class Student
{
    public static Map<String, Integer> totalMarks = new HashMap<>();
    private int marks = 0;
    private String name;

    Student(int marks, String name)
    {
        this.marks = marks;
        this.name = name;
        totalMarks.put(name, marks);
    }

    public static void main(String[] args) {
        Student manoj = new Student(100, "Manoj");
        System.out.println(totalMarks);
        printTotalMarks();
        Student monika = new Student(200, "monika");
        System.out.println(totalMarks);
        printTotalMarks();
        Student shashi = new Student(300, "shashi");
        System.out.println(totalMarks);
        printTotalMarks();
        System.out.println(Student.totalMarks);
        Student.printTotalMarks();
        System.out.println(manoj.totalMarks);
        manoj.printTotalMarks();
        System.out.println(monika.totalMarks);
        monika.printTotalMarks();
        System.out.println(shashi.totalMarks);
        shashi.printTotalMarks();
    }

    public static void printTotalMarks()
    {
        System.out.println("totalMarks");
        for (Map.Entry a:totalMarks.entrySet()
             ) {
            System.out.println(a.getKey() + " " + a.getValue());
        }
    }
}

package students;

import java.util.ArrayList;

public class Student {

    private String name;
    private int id;
    private ArrayList<Integer> grades;


    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();//instantiating here so wont have to in main

    }
    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void addGrade(int grade) {
        grades.add(grade); //ArrayList method to append grades to the array
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage() {
        //setting the average to 0
        int total = grades.size();
        int sum = 0;
        //iterate through grades to count them
        for (double grade : grades)
            sum += grade;//This adds all the grade integers(arithmetic) together
        return sum/ total;//returning the total value that was added together, divided by the number of grades.
    }


}

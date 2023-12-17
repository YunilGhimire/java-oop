package models;

import java.util.Arrays;

public class Students {
    String name;
    int age;
    int grade;
    double[] marks;

    public Students(String name, int age, int grade, double[] marks) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void displayResults() {
        double PossibleMarks = marks.length * 100.0;
        double ObtainedMarks = 0.0;

        for (double mark : marks) {
            ObtainedMarks += mark;
        }

        double percentage = (ObtainedMarks / PossibleMarks) * 100.0;

        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Total Marks: " + ObtainedMarks);
        System.out.println("Percentage: " + percentage + "%");

        // Determine the grade and result
        String grade, result;

        if (percentage >= 90) {
            grade = "A+";
            result = "Pass";
        } else if (percentage >= 80) {
            grade = "A";
            result = "Pass";
        } else if (percentage >= 70) {
            grade = "B+";
            result = "Pass";
        } else if (percentage >= 60) {
            grade = "B";
            result = "Pass";
        } else {
            grade = "F";
            result = "Fail";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
    }
}
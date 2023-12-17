package models;

public class Student {
    String firstname;
    String lastname;
    String section;
    int idnumber;
    int grade = 12;

    int[] marks;

    public Student(String firstname, String lastname, String section, int idnumber, int[]marks) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.section = section;
        this.idnumber = idnumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
    }


    public void displayInformation(){
        String studentfirstname = this.firstname;
        String studentlastname = this.lastname;
        int idnumber = this.idnumber;
        String StudentSection = this.section;
        int grade = this.grade;

        String message = "The student is " + studentfirstname  + " "+ studentlastname+ " of grade" + grade+  "of section" + StudentSection + "roll no is" + idnumber;
        System.out.println(message);



    }
}

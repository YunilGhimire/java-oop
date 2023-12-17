//public class Main {
//    public static void main(String[] args) {
//
//        Mammal human = new Mammal();
//        Mammal cow = new Mammal();
//
//        System.out.println(human);
//        System.out.println(cow);
//// getting properties from getter
//       int heartDetailHuman = human.getChamber_of_heart();
//       int heartDetailCow = cow.getChamber_of_heart();
//        System.out.println("Printing Details");
//        System.out.println( heartDetailHuman);
//        System.out.println(heartDetailCow);
//
//// setting properties
//human.setChamber_of_heart(33);
//cow.setChamber_of_heart(20);
//        System.out.println("After setting detail");
//        System.out.println(human.getChamber_of_heart());
//        System.out.println(cow.getChamber_of_heart());
import models.Students;
public class Main {
    public static void main(String[] args) {
        double[]marks1 = {12,89,90};
        double[]marks2= {76,79,90};
        double[]marks3 = {57,89,47};

        Students student1= new Students("Yunil",18, 12, marks1);
        Students student2 = new Students("Pratyush", 18, 12, marks2);
        Students student3 = new Students("Yawat", 17,12, marks3);

    student1.displayResults();
    student2.displayResults();
    student3.displayResults();



    }
}
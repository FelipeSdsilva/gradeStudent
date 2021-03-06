package aplication;

import entities.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);        
        Locale.setDefault(Locale.US);

        System.out.println("Welcome Student calc your the final grade here: ");
        Student x = new Student();
        System.out.println("Write your name: ");
        x.name =sc.nextLine();
        System.out.println("What your value of first grade up to (30.00): ");
        x.grade1 =sc.nextDouble();
        System.out.println("What your value of second grade up to (35.00): ");
        x.grade2 =sc.nextDouble();
        System.out.println("What your value of tird grade up to (35.00): ");
        x.grade3 =sc.nextDouble();
        x.finalGrade();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TestClass {
    public static void main(String[] args) {
        Student [] students = {new Student ("SOO1","Shirra", "BSIT", 96.50),
            new Student ("SOO2","Princes May", "BSIT", 98.00),
            new Student ("SOO3","Eden", "BSIT", 94.00),
            new Student ("SOO4","Jezil", "BSIT", 92.00),
            new Student ("SOO5","Rafael", "BSIT", 97.00), 
            new Student("SOO6","Richard", "BSIT", 91.00),
            new Student("SOO7","Andres", "BSIT", 90.00),
            new Student("SOO8","Claryze", "BSIT", 90.00),
        };
        
        System.out.println("STUDENTS BEFORE SORTING: ");
        System.out.println("---------------------------------------");
       
        for (Student student : students) {
            student.displayListofStudents();
        }
        
        System.out.println("\nSTUDENTS AFTER SORTING");
        System.out.println("------------------------------------------");
       
        for (Student student : students) {
            student.displayListofStudents();
        }
        
        System.out.println("\nTOP 3 STUDENTS");
        System.out.println("-------------------------------------------");
        
        for (int i = 0; i < 3; i++) {
           
            students[i].displayListofStudents();
        }
    }
    
}

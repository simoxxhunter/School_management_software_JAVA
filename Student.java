package com.mycompany.breifproject1;
import java.util.Scanner;

public class Student {
   
    //public int studentNO;
    public String studentName;
    public String studentLastName;
    public String studentPhone;
    public String address;
    public classe numClass;
    public birthdate birthDate;
    public static int studentCount = 0; 
    
    public static void addStudent(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        

        if (studentCount < students.length) {
            students[studentCount] = new Student(); 

            System.out.printf("Enter student details for student #%d.  ",studentCount);
            
            System.out.print("\nStudent First Name: ");
            students[studentCount].studentName = scanner.nextLine();
            
            System.out.print("Student Last Name: ");
            students[studentCount].studentLastName = scanner.nextLine();
            
            System.out.print("Student Phone: ");
            students[studentCount].studentPhone = scanner.nextLine();
            
            System.out.print("Address: ");
            students[studentCount].address = scanner.nextLine();
            
            System.out.println("Student added successfully.");
            studentCount++;
        } else {
            System.out.println("Maximum number of students reached.");
        }
    }
}

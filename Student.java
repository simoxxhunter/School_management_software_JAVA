package com.mycompany.breifproject1;
import java.util.Scanner;

public class Student {
   
    //public int studentNO;
    public String studentName;
    public String studentLastName;
    public String studentPhone;
    public String address;
    public Classe numClass;
    public birthdate birthDate;
    
    public static int studentCount = 0; 
    public static Scanner scanner = new Scanner(System.in);
    //---------------------------------------------------------------------
    public static void addStudent(Student[] students) {
       
        
        if (studentCount < students.length) {
            students[studentCount] = new Student(); 

            System.out.printf("Enter student's details for student #%d.  ",studentCount);
            
            System.out.print("\nStudent's First Name: ");
            students[studentCount].studentName = scanner.nextLine();
            
            System.out.print("Student's Last Name: ");
            students[studentCount].studentLastName = scanner.nextLine();
            
            System.out.print("Student's Phone number: ");
            students[studentCount].studentPhone = scanner.nextLine();
            
            System.out.print("Student's Address: ");
            students[studentCount].address = scanner.nextLine();
            
            System.out.println("Student added successfully !");
            studentCount++;
        } else {
            System.out.println("Maximum number of students reached.");
        }
    }
    //--------------------------------------------------------------------------------
        public static void ListStudents(Student[] students) {
            int i = 0;
            if (studentCount == 0) {
            System.out.println("\nNo students to show, list is empty !\n");
        }//condition if
            while (i < studentCount){
                System.out.println("\n---------------------------------------------------\n");
                System.out.printf("Student #%d:\n", i);
                System.out.printf("full Name: %S  %S\n",students[i].studentName ,students[i].studentLastName);
                System.out.printf("Phone: %s \n",students[i].studentPhone);
                System.out.printf("Address: %s\n", students[i].address);
                i++;
            }//while
       }//method
}

package com.mycompany.breifproject1;
import java.util.Scanner;
//------------------------------------------------------------------------------
class admin{
    int adminNO;
    String adminName;
    String admineUsername;
    
}
class student{
    int studentNO;
    String studentname;
    String studentlastename;
    int studentphone;
    String adresse;
    classe numclass;
    classe birthdate;
    
}
class classe{
    int numclass;
    String nomclass;
    int NumOFstudents;
     
}
class birthdate{
    int day;
    int month;
    int year;
}
//------------------------------------------------------------------------------

public class BreifProject1 {
int choice;
    public static void main(String[] args) {
        System.out.println("Welcome to the school management software !\n\n");
        
         System.out.println("Main Menu\n");
         
        //students
         System.out.println("1. Add a new student");
         System.out.println("2. Edit an existing student details");
         System.out.println("3. Delete an existing student");
         System.out.println("4. Show all the students");
         System.out.println("5. search for a student");
         
         //classes
         System.out.println("6. Add a new class");
         System.out.println("7. Edit an existing class details");
         System.out.println("8. Delete an existing class");
         System.out.println("9. Show all the classes");
         System.out.println("10. filter students by class");
         
         System.out.println("\n\n0. Close and exit the program");
         
         
         
    }
}

package com.mycompany.breifproject1;
import static com.mycompany.breifproject1.Student.addStudent;
import static com.mycompany.breifproject1.Student.scanner;
import static com.mycompany.breifproject1.Student.studentCount;
import java.util.Scanner;

//------------------------------------------------------------------------------

public class BreifProject1 {
   
    public static Student[] students = new Student[35];
    public static Classe[] classes = new Classe[10];
    
    public static boolean datevalidator(int year,int month, int day){
        if (year > 1990 && year < 2010 && month > 0 && month < 13  && day > 0 && day < 32){
            return true;
            
        } else {
             return false;
        } 
    }
         //------------------------------------------------------------------------------
    public static int phonevalidator(String phoneNO,String phoneNON ){
        
        if (phoneNO.length() == 8){
            students[studentCount].studentPhone = phoneNON;
            //scanner.nextLine();
            System.out.print("phone number added succesfully !\n");
            
            //scanner.nextLine();
          // return 0;
        } else if (phoneNO.length() != 8){
            System.out.print("Wrong phone number entered, please enter the student info again !"); 
            //scanner.nextLine();
            addStudent(students); 
            scanner.nextLine();
        } 
        return 0;
    }
        
          //------------------------------------------------------------------------------
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //Student[] students = new Student[35];
        
        int choice;
        String username,password;
        
        //------------------------------------------------------------------------------
        System.out.println("Welcome to the school management software !\n\n");
        
        System.out.println("Please enter your login credentials !\n");
        
        System.out.println("Username : ");
        username = scanner.nextLine();
        System.out.println("Password : ");
        password = scanner.nextLine();
        
     if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin") ){
   
       do{
         System.out.println("---------------------------------------------------\n");
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
         System.out.println("10.filter students by class");
         
         System.out.println("\n\n0. Close and exit the program");
         //main menu
         choice = scanner.nextInt();
         
                if (choice == 1) {
                        
			System.out.println("\n== Adding a student ==\n");
                            Student.addStudent(students);
 			} else if (choice == 2) {
 				 System.out.println("\n== Editing a student details ==\n");
                            Student.EditStudent(students);
  			} else if (choice == 3) {
  				  System.out.println("\n== Deleting a student ==\n");
                            Student.DeleteStudent(students);
  			} else if (choice == 4) {
  				 System.out.println("\n== Listing all students ==\n");
                            Student.ListStudents(students);
  			} else if (choice == 5) {
  				 System.out.println("\n== Searching for a student ==\n");
                            Student.search(students);
 			} else if (choice == 6) {
 				 System.out.println("\n== adding a class ==\n");
                            Classe.addClasses(classes);
  			} else if (choice == 7) {
  				  System.out.println("\n== Editing a class's details ==\n");
                            Classe.EditClass(classes);
  			} else if (choice == 8) {
  				 System.out.println("\n== Deleting an existing class ==\n");
                            Classe.DeleteClasse(classes);
  			} else if (choice == 9) {
  				 System.out.println("\n== Listing all classes ==\n");
                            Classe.ListClasses(classes);
                        }else if (choice == 10) {
  				 System.out.println("\n== Filtering students by class ==\n");
                            Student.Filter(students);
			} else if (choice == 0) {
    		 	 System.out.println("Exiting the program.\n");
    		}else{
      	 		 System.out.println("Invalid choice, Please type a number from the list above.\n");
    					}
	}while (choice != 0);
        
        }else{//authentification 
         System.out.println("password or username are incorrect");
     }
    }
}

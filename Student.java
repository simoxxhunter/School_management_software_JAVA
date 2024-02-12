package com.mycompany.breifproject1;
import java.util.Scanner;
import com.mycompany.breifproject1.Classe;
//import com.mycompany.breifproject1.birthdate;

public class Student {
   
    //public int studentNO;
    public String studentName;
    public String studentLastName;
    public String studentPhone;
    public String address;
    public Classe numclass = new Classe();
    public birthdate birthDate = new birthdate();
    
    public static int studentCount = 0; 
    public static Scanner scanner = new Scanner(System.in);
    //---------------------------------------------------------------------
    public static void addStudent(Student[] students) {
        int phonechoice = 0;
        String phoneNO = "zero";
        String phoneNON = "zero";
        if (studentCount < students.length) {
            students[studentCount] = new Student(); 

            System.out.printf("Enter student's details for student #%d.  ",studentCount);
            
            System.out.print("\nStudent's First Name: ");
            students[studentCount].studentName = scanner.nextLine();
            
            System.out.print("Student's Last Name: ");
            students[studentCount].studentLastName = scanner.nextLine();
            
            System.out.print("The Phone number start with 07 or 06 ?\n");
            System.out.print("1. for 06\n");
            System.out.print("2. for 07\n");
            
       
            phonechoice = scanner.nextInt();
            scanner.nextLine();
                if (phonechoice == 1){
                    System.out.print("please finish the phone number :  06-");
                phoneNO = scanner.nextLine();
                phoneNON = "06" + phoneNO;
            
                } else if (phonechoice == 2){
                    System.out.print("please finish the phone number :  07-");
                phoneNO = scanner.nextLine();
                phoneNON = "07" + phoneNO;
                }
                 BreifProject1.phonevalidator(phoneNO,phoneNON);
                
            //students[studentCount].studentPhone = scanner.nextLine();
            
            System.out.print("Student's Address: ");
            //scanner.nextLine();
            students[studentCount].address = scanner.nextLine();
            
            System.out.println("Please enter the student's class number : \n");
            students[studentCount].numclass.numclass = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please enter the student's birth DAY : \n");
            int birth_day = scanner.nextInt();
          scanner.nextLine();
            //students[studentCount].birthDate.day = scanner.nextInt();
            
            System.out.println("Please enter the student's birth MONTH : \n");
            int birth_month = scanner.nextInt();
           scanner.nextLine();
            //students[studentCount].birthDate.month = scanner.nextInt();
            
            System.out.println("Please enter the student's birth YEAR : \n");
            int birth_year = scanner.nextInt();
            scanner.nextLine();
            //students[studentCount].birthDate.year = scanner.nextInt();
            //studentCount++;
            
            if (BreifProject1.datevalidator(birth_year, birth_month, birth_day)) {
                students[studentCount].birthDate.day = birth_day;
                students[studentCount].birthDate.month = birth_month;
                students[studentCount].birthDate.year = birth_year;
                System.out.println("Student added successfully !");
                studentCount++;
            } else {
                System.out.println("Wrong birthdate values, re-enter the student's info");
                scanner.nextLine(); 
                addStudent(students); 
            }
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
            while (i < studentCount && studentCount != 0){
                System.out.println("---------------------------------------------------");
                System.out.printf("Student #%d:\n", i);
                System.out.printf("Full Name: %S  %S\n",students[i].studentName ,students[i].studentLastName);
                System.out.printf("Phone: %s \n",students[i].studentPhone);
                System.out.printf("Address: %s\n", students[i].address);
                System.out.printf("Class number: %s\n", students[i].numclass.numclass);
                System.out.printf("Date of birth: %d/%d/%d\n", students[i].birthDate.day,students[i].birthDate.month,students[i].birthDate.year);
                i++;
            }//while
       }//method
        //--------------------------------------------------------------------------------
        public static void DeleteStudent(Student[] students) {
            int studentNOtodelete = 0;
        if (studentCount == 0) {
            System.out.println("\nNo students to delete !\n");
        } else {
            System.out.println("Please enter the student number that you want to delete:");
             studentNOtodelete = scanner.nextInt();

            if (studentNOtodelete < 0 || studentNOtodelete >= studentCount) {
                System.out.printf("Student Number is out of Range, please put a number that is within 0 and %d\n", studentCount );
            } else {
                students[studentNOtodelete] = students[studentNOtodelete + 1] ;
                studentCount--;
                System.out.printf("Student number %d has been deleted successfully.\n", studentNOtodelete);
            }
        }
        }
        //--------------------------------------------------------------------------------
        public static void EditStudent(Student[] students){
            int studentNOtoedit = 0;
            
            if (studentCount == 0) {
            System.out.println("\nNo students to edit !\n");
            }while (studentNOtoedit < studentCount ){
                System.out.println("Please enter the students number that you want to edit : \n");
                studentNOtoedit = scanner.nextInt();
                
                System.out.println("Please enter the students new name : \n");
                students[studentNOtoedit].studentName = scanner.nextLine();
                System.out.println("Please enter the students new last name : \n");
                students[studentNOtoedit].studentLastName= scanner.nextLine();
                System.out.println("Please enter the students new phone number : \n");
                students[studentNOtoedit].studentPhone = scanner.nextLine();
                System.out.println("Please enter the students new adress of residence : \n");
                students[studentNOtoedit].address = scanner.nextLine();
                System.out.println("Please enter the students new class number : \n");
                students[studentNOtoedit].numclass.numclass = scanner.nextInt();
                System.out.println("Please enter the students new birth DAY : \n");
                students[studentNOtoedit].birthDate.day = scanner.nextInt();
                System.out.println("Please enter the students new birth MONTH : \n");
                students[studentNOtoedit].birthDate.month = scanner.nextInt();
                System.out.println("Please enter the students new birth YEAR : \n");
                students[studentNOtoedit].birthDate.year = scanner.nextInt();
                
               
                System.out.printf("Student number %d information have been edited successfully.\n", studentNOtoedit);
                break;
            }//while
                    System.out.printf("Student Number is out of Range, please put a number that is within 0 and %d",studentCount);
        }
            
        
        
}


package com.mycompany.breifproject1;
import java.util.Scanner;

public class Classe {
   public int numclass;
   public String nomclass;
   public int NumOFstudents;
    
   
    public static int classescount = 0; 
    public static Scanner scanner = new Scanner(System.in);
    //---------------------------------------------------------------------
    public static void addClasses(Classe[] classes) {
       
        
        if (classescount < classes.length) {
            classes[classescount] = new Classe(); 

            System.out.printf("Enter class's details for class #%d.  \n",classescount);
            
            System.out.print("class's Name: ");
            classes[classescount].nomclass = scanner.nextLine();

            System.out.print("Class's Number of students: ");
            classes[classescount].NumOFstudents = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Class added successfully !");
            classescount++;
        } else {
            System.out.println("Maximum number of classes reached.");
        }
    }
    //-------------------------------------------------------------------------------------------
    public static void ListClasses(Classe[] classes) {
            int i = 0;
            if (classescount == 0) {
            System.out.println("\nNo students to show, list is empty !\n");
        }//condition if
            while (i < classescount - 1){
                System.out.println("\n---------------------------------------------------\n");
                System.out.printf("Class #%d:\n", i);
                System.out.printf("Class's Name: %S \n",classes[i].nomclass );
                System.out.printf("Number of students: %d\n", classes[i].NumOFstudents);
                i++;
            }//while
       }//method
    //------------------------------------------------------------------------------------------------
    public static void DeleteClasse(Classe[] classes){
            int classNOtodelete= 0;
            
            if (classescount == 0) {
            System.out.println("\nNo classes to delete !\n");
        }//condition if
            while (classNOtodelete < classescount + 1){
                System.out.println("Please enter the class number that you want to delete : \n");
                classNOtodelete = scanner.nextInt();
                
                classes[classNOtodelete] = classes[classNOtodelete + 1] ;
                classescount--;
                System.out.printf("Class number %d has been deleted successfully.\n", classNOtodelete);
                break;
            }//while
                    System.out.printf("Class Number is out of Range, please put a number that is within 0 and %d",classNOtodelete);
        }
}

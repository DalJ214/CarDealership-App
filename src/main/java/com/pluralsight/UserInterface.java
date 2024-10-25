package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

 public void Display() {

     Scanner scan = new Scanner(System.in);

     boolean exit = false;

     while (!exit){
         System.out.println("Welcome to cowboy cars! ");

         System.out.println("A : Price range ");

         System.out.println("B: Make/model ");

         System.out.println("C : Year ");

         System.out.println("D : Mileage ");

         System.out.println("E : Vehicle Type ");

         System.out.println("F : List all vehicles ");

         System.out.println("G : Add vehicle ");

         System.out.println("H : Remove vehicle ");

         System.out.println("X : Quit ");
         String option = scan.nextLine().toUpperCase().trim();
         switch (option){
             case "A":
                 System.out.println("What is your minimum price? ");
                 String minimum = scan.nextLine().toUpperCase().trim();
                 System.out.println("What is your maximum price? ");
                 String maximum = scan.nextLine().toUpperCase().trim();
                 List<Vehicle> vehicles =  ();

         }
     }
}

}

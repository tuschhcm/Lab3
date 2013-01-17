//***********************************************************************
// Project: Lab 3
//
// Author: Craig Tuschhoff
//
// Completion time: 3 hours total
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from (no one) in designing and debugging my program.
//***********************************************************************

import java.util.*;

public class PasswordDemo {
   public static void main(String[] args) {
      
      Scanner keyboard = new Scanner(System.in);
      boolean validPassword;
      
      do{
         System.out.print("Enter a password: ");
         String userInput = keyboard.next();
      
         //check if password is valid
         if(PasswordVerifier.isValid(userInput)) {
            validPassword = true;
            System.out.println("Valid Password");
         } else {
            validPassword = false;
            System.out.println("Invalid Password");
         }
      }while(validPassword == false);
   }
}
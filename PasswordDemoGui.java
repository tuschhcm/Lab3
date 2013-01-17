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

import javax.swing.*;

public class PasswordDemoGui {
   public static void main(String[] args) {
      
      boolean validPassword;
      
      do{
         String userInput = JOptionPane.showInputDialog("Enter a password");
      
         //check if password is valid
         if(PasswordVerifier.isValid(userInput)) {
            validPassword = true;
            JOptionPane.showMessageDialog(null, "Valid Password");
         } else {
            validPassword = false;
            JOptionPane.showMessageDialog(null, "Invalid Password");
         }
      }while(validPassword == false);
   }
}
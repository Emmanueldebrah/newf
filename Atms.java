/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atms;
import java.util.Scanner;
/**
 *
 * @author BRAH EMMA
 */

public class Atms {
private static double balance = 0.00;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do
        {
          menu();
          choice = input.nextInt();
            switch(choice){
                case 1:
                deposit(input);
                break;
                case 2:
                withdraw(input);
                break;
                case 3:
                checkbalance();
                break;
                case 4:
                System.out.println("Thanks for using this ATM");
          
                
            }
            
        // TODO code application logic here
    }while(choice!=4);
     
}
    private static void menu(){
         System.out.println("Welcome to this ATM");
         System.out.println("Choose option");
         System.out.println("1. deposit");
         System.out.println("2. Withdraw money");
         System.out.println("3. Check balance");
         System.out.println("4. exit");
         System.out.println("Choose your option");
}
     
private static void deposit(Scanner input){
    System.out.println("Enter amount to deposit");
    double amountD = input.nextDouble();
    balance+=amountD;
    System.out.println("You deposited an amount of "+amountD+"Your new balance is "+balance);
    
    
            
}
private static void withdraw(Scanner input){
    System.out.println("Enter amount to Withdraw");
    double amountW = input.nextDouble();
    if(amountW>balance-50){
       System.out.println("Inssuficient balance, Withdrwal has been cancelled"); 
    }
    else{
        
        balance-=amountW;
        System.out.println("You have withdrawn an amount of "+amountW+"Your current balance is "+balance);
    
       }

}
private static void checkbalance(){
    System.out.println("Your balance is "+balance); 
}
}

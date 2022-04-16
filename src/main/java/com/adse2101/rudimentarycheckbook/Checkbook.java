
package com.adse2101.rudimentarycheckbook;

import java.util.Scanner;

/**
 *Java program to maintain a rudimentary checkbook
 * @author Bahati
 */

    
    

public class Checkbook {

    //declare variables
   double balance = 0;
    double previousTransaction;
    String customerName;
   int customerId;

    //constructor

    public Checkbook() {


        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter your name.");
        customerName =scanner.nextLine();
       
    }


    //deposit method
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }


    //withdraw
    public void withdraw(double amount){

        if (amount > 0 && amount < balance )
        {
            balance = balance - amount;
            previousTransaction = -amount;
        }


    }




    /*
    
        this is a method to get the previous transction
    */
    public void getPreviousTransaction()
    {
        if (previousTransaction > 0)
        {
            System.out.println( "Deposited: "+previousTransaction);
        }else if (previousTransaction < 0)
        {
            System.out.println("Withdrawn " +Math.abs(previousTransaction));
        }else {
            System.out.println("No transaction occured.");
        }
    }


    
    //Method to run the Withdraw and Deposit methods

    public  void  runCheckbook()
    {

        System.out.println( "\n\nWelcome "+customerName
                );


        Scanner scanner = new Scanner(System.in);


        //DEPOSITING


        System.out.println("\nMake your first deposit ->>>>>>\n");
        System.out.println("Deposit");
        double amount1 = scanner.nextDouble();//reading in the deposit amount

        
        /*
        Condiotional statement to check that the deposit amount is not less than or 
        equal to zero
        */
        if (amount1 > 0 )
        {
            deposit(amount1);
        }else {

            //While loop to execute untill the conditions are met
            while (amount1 <= 0)
            {
                System.out.println("You can only deposit amount " +
                        "greater than 0\nTry again->>>>\n");
                System.out.println("Deposit");
                amount1 = scanner.nextDouble();
                deposit(amount1);
            }
        }
        double balance1 = balance;//Variable for the first balance


        //First Withdrawal

        System.out.println("\nMake your first withdrawal ->>>>>>\n");
        System.out.println( "Withdraw");
        double amount = scanner.nextDouble();//reading in the withdraw amount

        
        /*
        Condiotional statement to check that the withdraw amount is greater than 
        the balance
        */
        if (balance > amount)
        {
            withdraw(amount);
        }else{
              //While loop to execute untill the conditions are met

            while (balance < amount){

                System.out.println( "Your account balance in insufficient!!\n" +
                        "Account Balance: "+ balance);

                System.out.println( "Withdraw");
                amount = scanner.nextDouble();
                withdraw(amount);


            }
        }

        double balance2 = balance;//Variable for the second balance



        //Second withdrawal
        System.out.println("\nMake your Second withdrawal ->>>>>>\n");

        System.out.println( "Withdraw");
        double amount2 = scanner.nextDouble();//reading in the withdraw amount

        
         
             /*
        Condiotional statement to check that the withdraw amount is greater than 
        the balance
        */
        if (balance > amount2)
        {
            withdraw(amount2);
        }else{
           //While loop to execute untill the conditions are met
            while (balance < amount2){

                System.out.println( "Your account balance in insufficient!!\n" +
                        "Account Balance: "+ balance);

                System.out.println( "Withdraw");

                amount2 = scanner.nextDouble();//While loop to execute untill the conditions are met
                withdraw(amount2);

            }
        }
        double balance3 = balance;//Variable for the third balance


        //Second deposit
        System.out.println("\nMake your Second deposit ->>>>>>\n");
        System.out.println("Deposit");
        double amount3 = scanner.nextDouble();//readind in the second deposit

        
        /*
        Condiotional statement to check that the deposit amount is not less than or 
        equal to zero
        */
        if (amount3 > 0 )
        {
            deposit(amount3);
        }else {
//While loop to execute untill the conditions are met
            while (amount3 <= 0)
            {
                System.out.println("You can only deposit amount " +
                        "greater than 0\nTry again->>>>\n");
                System.out.println("Deposit");
                amount3 = scanner.nextDouble();
                deposit(amount1);
            }
        }

        double balance4 = balance;//Variable for the third balance

        
        //Displaying all the Balances after each transaction in order
        System.out.println("Balance: "+ balance1);
        System.out.println("Balance: "+ balance2);
         System.out.println("Balance: "+ balance3);
        System.out.println("Balance: "+ balance4);
        
        //Exiting the program

        System. exit(0);

    }





}



package projects;

import java.util.Scanner;
import java.time.*;

public class ATM {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("                        The time is: "+LocalTime.now().getHour()+":"+LocalTime.now().getMinute()+"     ");
        System.out.println();
        System.out.println("                        The date is: "+LocalDate.now());

        System.out.print("Enter Your Name: ");
        String name=sc.nextLine();
        BankAccount obj1=new BankAccount(name);
        obj1.menu();
    }
}
class BankAccount{
    int bal;
    int prevtrans;
    String customername;


    BankAccount(String custemername){
        this.customername=custemername;

    }

    void deposit(int amount){
        if(amount!=0){
            bal+=amount;
            prevtrans=amount;
        }
    }
    void withdrawl(int amount){
        if(amount!=0 && bal>=amount){
            bal-=amount;
            prevtrans=-amount;
        }
        else if(bal<amount){
            System.out.println("Insufficient amount!");
        }
    }
    void getPrevtrans(){
        if(prevtrans>0){
            System.out.println("deposited "+prevtrans);
        }
        else if(prevtrans<0){
            System.out.println("Withdrawn "+Math.abs(prevtrans));
        }
        else{
            System.out.println("no transactions occurred");
        }
    }
    void menu(){
        char option;
        Scanner sc =new Scanner(System.in);

        System.out.println("WELCOME "+customername);
        System.out.println("________________");
        System.out.println("a> Check Balance");
        System.out.println("b>Deposit Amount");
        System.out.println("c>Withdraw Amount");
        System.out.println("d>Previous Transactions");
        System.out.println("e>Exit");

        do{
            System.out.println("Choose an option: ");
            option=sc.next().charAt(0);
            System.out.println("");

            switch(option){
                case 'a':
                    System.out.println("Balance ="+bal);
                    System.out.println("");
                    break;

                case 'b':
                    System.out.println("Enter a amount to deposit: ");
                    int amountD= sc.nextInt();
                    deposit(amountD);
                    System.out.println("");
                    break;

                case 'c':
                    System.out.println("Enter the amount you want to Withdraw: ");
                    int amountW=sc.nextInt();
                    withdrawl(amountW);
                    System.out.println("");
                    break;

                case 'd':
                    System.out.println("Previous Transactions: ");
                    getPrevtrans();
                    System.out.println("");
                    break;

                case 'e':
                    System.out.println("................");
                    break;

                default:
                    System.out.println("Enter a valid option");
                    break;
            }
        }
        while (option!='e');
        System.out.println("Thank you for Banking with us");
        }
    }
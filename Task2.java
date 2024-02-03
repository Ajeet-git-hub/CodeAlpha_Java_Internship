import java.util.Scanner;
public class Bank {
    Scanner sc = new Scanner(System.in);
    private float balance = 0, transact = 0;
    String choice;

    //to check balance
    void checkBalance(){
        System.out.println("\t\tAvailable balance is: " + balance);
    }

    //to deposit
    void deposit(){
        System.out.print("\t\tEnter the amount to deposit\n>>> ");
        transact = sc.nextFloat();
        if(transact >= 0){
            balance += transact;
            checkBalance();
        }
        else{
            System.out.println("\t\tamount cannot be in negative.");
        }
    }

    //to withdraw
    void withdraw(){
        if(balance == 0){
            System.out.println("\t\tYour account is empty !");
        }
        else{
            System.out.print("\t\tEnter the amount to withdraw\n>>> ");
            transact = sc.nextFloat();
            if(transact < 0){
                transact = -transact;
            }
            if(transact > balance){
                System.out.println("\t\tYou don't have enough balance to withdraw. ");
            }
            else{
                balance -= transact;
                checkBalance();
            }
        }
    }
}

class Menu extends Bank{
    String word;
    Menu(){
        System.out.print("options available: ");
        System.out.print("\t\twithdraw\t\tdeposit\t\tbalance\t\texit\n>>> ");
        while(true){
            word = sc.nextLine();
            if(word.equalsIgnoreCase("withdraw") || word.equalsIgnoreCase("withdraw ")){
                withdraw();
                System.out.print(">>> ");
            }
            else if(word.equalsIgnoreCase("deposit") || word.equalsIgnoreCase("deposit ")){
                deposit();
                System.out.print(">>> ");
            }
            else if(word.equalsIgnoreCase("balance") || word.equalsIgnoreCase("balance ")){
                checkBalance();
                System.out.print(">>> ");
            }
            else if(word.equalsIgnoreCase("exit") || word.equalsIgnoreCase("exit ")){
                System.out.println("\t\tThank you for banking!");
                break;
            }
        }
    }
}

class Exec{
    public static void main(String args[]){
        Menu customer = new Menu();
    }
}

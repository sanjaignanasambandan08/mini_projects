import java.util.*;

public class Mybank {
    public static void main(String[] args) {
        // declaration

        int pin = 1234;
        String name = "john";
        int balance = 100000;


        System.out.println("welcome to SBI");
        System.out.println("please enter your pin : ");
        Scanner sc = new Scanner(System.in);
        int User_enter_pin = sc.nextInt();
        System.out.println();

        if (User_enter_pin == pin) {
            System.out.println("please selecet the option given below Mr." + name);
            System.out.println();

            while (true) {

                // options
                System.out.println("press 1 to deposit amount");
                System.out.println("press 2 to withdraw amount");
                System.out.println("press 3 to check the balance amount");
                System.out.println("press 4 to exit");

                // using switch statement to make use of the options

                int User_Opt = sc.nextInt();
                switch (User_Opt) {
                    case 1:
                        System.out.println("enter the amount you want to deposit");
                        int User_deposit_amount = sc.nextInt();
                        balance = balance + User_deposit_amount;
                        System.out.println("Amount deposited successfully! Your new balance is: " + balance);
                        break;

                    case 2:
                        System.out.println("enter the amount you want to withdraw");
                        int user_withdraw = sc.nextInt();
                        if (user_withdraw > balance) {
                            System.out.println("insufficient balance");

                        } else {

                            balance = balance - user_withdraw;
                            System.out.println("Amount withdrawn successfully! Your new balance is: " + balance);
                        }
                        break;

                    case 3:
                        System.out.println("your avalilable balance is : " + balance);
                        break;

                    case 4:
                        System.out.println("thanks for banking with us Mr " + name);
                        return;

                    default:
                        System.out.println("invalid option! please try again");
                        break;
                }

            }
        } else {
            System.out.println("wrong pin");
        }

    }

}
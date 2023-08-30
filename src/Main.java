import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choiceOne = 0;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Library Portal Initialised...");
        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.\tEnter as a librarian");
            System.out.println("2.\tEnter as a member");
            System.out.println("3.\tExit");
            choiceOne = scanner.nextInt();
            if (choiceOne == 1){
                System.out.println("You chose 1");
            }
            else if (choiceOne == 2){
                System.out.println("You chose 2");
            }
            else if (choiceOne == 3){
                System.out.println("You chose 3");
            }
            else{
                System.out.println("Incorrect choice, please try again!");
            }
        }
    }
}
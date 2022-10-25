package Project1.MyGame;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        CharacterControl myCharacter = new CharacterControl();
        GameMenu menu = new GameMenu();
        MonsterControl slime = new MonsterControl();

        Scanner input = new Scanner(System.in);
        String command = " ";


        menu.gameMenuPrint();
        System.out.print("Enter Y to start: ");
        command = input.nextLine();
        menu.printHeader();
        myCharacter.printCharacterStats();
        slime.printSlime();
//        System.out.print("Do you wish to begin?(Y/N) :");
//        command = input.nextLine();
        if (command.toLowerCase().equals("y") || command.toLowerCase().equals("yes")) {
            command = " ";
            while (!command.equals("exit")) {
                System.out.print("What is your input:");
                command = input.nextLine();
                myCharacter.characterCommand(command);
            }
        }
        else if (command.toLowerCase().equals("n") || command.toLowerCase().equals("no")){
            System.out.println("No game for you then.");
        }
    }
}

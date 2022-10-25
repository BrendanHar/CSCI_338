package Project1.MyGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class GameMenu {

    private ArrayList<Integer> mapLocations;
    private int location;

    public GameMenu(){
        mapLocations = new ArrayList<Integer>(31);
        location = 0;
    }


    //Starter Menus
    public void gameMenuPrint() {
        System.out.println("This is a text Based Video Game!!");
        System.out.println("--------------------------------------------------------------");
        System.out.println("|You control the game through inputs on the command line.    |");
        System.out.println("|The inputs are pretty simple (case does not matter).        |");
        System.out.println("|Dodge: D                                                    |");
        System.out.println("|Run: R                                                      |");
        System.out.println("|Crouch: C                                                   |");
//        System.out.println("|Fireball: F                                                 |");
//        System.out.println("|Slash: S                                                    |");
        System.out.println("|End Action: E                                               |");
//        System.out.println("|Heal: H                                                     |");
//        System.out.println("|Show Stats: STATS                                           |");
        System.out.println("|Restart Game: RESTART                                       |");
        System.out.println("|If you ever forget this you can pull this menu up with: Help|");
        System.out.println("|Good Luck!                                                  |");
        System.out.println("--------------------------------------------------------------\n");

    }

    public void printHeader(){
        System.out.println();
        System.out.println("\tNEW GAME!!!");
        System.out.println("-------------------");
    }

    public void gameExplanationPrint(){
        System.out.println("The goal of the game is to reach the boss's castle");
        System.out.println("\t○---○---○----○----○-----○-----○");
        System.out.println("\t^");
        System.out.println("Your progress is represented by the line above. The arrow shows where you are.");
        System.out.println("Currently you can only go to the first destination as I have other projects this week.");
        System.out.println("You start with 5 health and if you take enough damage then you die.");

    }


    public void startingDiceRoll(){
        Random rand = new Random();
        int rollNum = 0;
        int rollIndex = 1;
        Scanner input = new Scanner(System.in);
        int statBase;

        System.out.println("This is the beginning dice roll you can allocate these points to your character");
        System.out.println("roll by entering a number");
        statBase = input.nextInt();

        for (int i = 0; i < 6; i++){
            rollNum = rand.nextInt(6)+1;
            rollIndex += i;
            System.out.print("Roll " + rollIndex + ": ");
            if (rollNum == 1){
                System.out.println("1\t");
            }
            else if (rollNum == 2){
                System.out.println("2\t");
            }
            else if (rollNum == 3){
                System.out.println("3\t");
            }
            else if (rollNum == 4){
                System.out.println("4\t");
            }
            else if (rollNum == 5){
                System.out.println("5\t");
            }
            else if (rollNum == 6){
                System.out.println("6\t");
            }
            else {
                System.out.println("Dice rolled!");
            }
        }

    }
    //end Starter Menus


    //Map Related Methods
    public void mapPrint(int position){

        System.out.println("Current Location:");
        System.out.println("\t○---○---○----○----○-----○-----○");
        System.out.println("\t^");
    }




    //Monster Generators
    public void monsterRoll() {
        Random rand = new Random();

    }



}

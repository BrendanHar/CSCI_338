package Project1.MyGame;

import java.util.Scanner;

public class CharacterControl {

    private Character myCharacter;
    private GameMenu menu = new GameMenu();
    private MonsterControl monsters;

    public CharacterControl(){
        myCharacter = new Character();
        monsters = new MonsterControl(myCharacter);
    }

    public void powerCalculator(int num){

    }

    public void turn(){
        Scanner input = new Scanner(System.in);
        for (int i =0; i < 3; i++){

        }
    }

    public void characterCommand(String input){
//        System.out.println("Your Health: " + myCharacter.getHealth());
        if (input.toLowerCase().equals("d")){
            myCharacter.dodge();
            monsters.getAction();

        }
        else if (input.toLowerCase().equals("r")){
            myCharacter.run();
            monsters.getAction();
        }
        else if (input.toLowerCase().equals("c")){
            myCharacter.crouch();
            monsters.getAction();
        }
//        else if (input.toLowerCase().equals("f")){
//            myCharacter.fireball();
//            monsters.getMonsterAttack();
//        }
//        else if (input.toLowerCase().equals("s")){
//            myCharacter.slash();
//            monsters.receiveAttack(myCharacter.getAttack());
//            monsters.getMonsterAttack();
//        }
        else if (input.toLowerCase().equals("e")){
            myCharacter.stop();
            monsters.getAction();
        }
//        else if (input.toLowerCase().equals("h")){
//            myCharacter.heal();
//            monsters.getAction();
//        }
        else if (input.toLowerCase().equals("help")){
            menu.gameMenuPrint();
        }
//        else if (input.toLowerCase().equals("stats")){
//            myCharacter.printStats();
//        }
//        else if (input.toLowerCase().equals("damage")){
//            myCharacter.damage(2);
//        }
        else if (input.toLowerCase().equals("kill")){
            myCharacter.kill();
        }
        else if (input.toLowerCase().equals("restart")){
            System.out.println("\tNEW GAME!!!");
            System.out.println("----------------------");
            myCharacter = new Character();
            myCharacter.printStats();
            monsters.printSlime();
            monsters.setMonsterAttack(0);
            monsters.setTurn(true);

        }
        else if (input.toLowerCase().equals("exit")){
        }
        else {
            System.out.println("not a valid command. Try again!");
        }
    }

    public void printCharacterStats(){
        myCharacter.printStats();
    }


}

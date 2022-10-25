package Project1.MyGame;

import java.util.ArrayList;
import java.util.Random;

public class Character {

    private State deathState;
    private State dodgingState;
    private State runningState;
    private State crouchState;
    private State idle;
    //current state
    private State currentState;

    //health bar
    private int health;
    private int strength;
    private int agility;
    private int maxHealth;
    private int magic;
    private int attack = 1;

    //Stat ArrayList




    public Character(){
        deathState = new DeathState(this);
        dodgingState = new DodgingState(this);
        runningState = new RunningState(this);
        crouchState = new CrouchState(this);
        idle = new Idle(this);
        health = 3;
        maxHealth = 3;
        strength = 5;
        agility = 5;
        magic = 5;
        currentState = idle;
    }


    public State getState(){return currentState;}

    //Get mehtods for stats
    public int getHealth(){
        return health;
    }
    public int getAgility() {
        return agility;
    }
    public int getMagic() {
        return magic;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getStrength() {
        return strength;
    }
    public int getAttack(){
        return attack;
    }



    //Get methods for the different states
    public State getIdle(){
        return idle;
    }
    public State getDodgingState(){
        return dodgingState;
    }
    public State getDeathState(){
        return deathState;
    }
    public State getCrouchState() {
        return crouchState;
    }
    public State getCurrentState() {
        return currentState;
    }
    public State getRunningState() {
        return runningState;
    }


    public void setState(State state){
        currentState = state;
    }

    //different actions for the states
    public void run(){
        currentState.run();
    }
    public void die(){
        currentState.die();
    }
    public void crouch(){
        currentState.crouch();
    }
    public void dodge(){
        currentState.dodge();
    }
    public void stop(){
        currentState.stop();
    }
    public void heal(){currentState.heal();}
    public void fireball(){
        currentState.fireball();
    }
    public void slash(){
        currentState.slash();
    }


    //mehtod for printing stats
    public void printStats(){
        System.out.println("   STATS");
        System.out.println("-------------");
        System.out.println("Strength: " + strength + "\nAgility: " + agility + "\nMagic" + magic + "\nVitality: " + maxHealth);
        System.out.println("-------------");
    }

    //test methods
    public void damage(int num){
        health -= num;
    }

    public void kill(){
        die();
    }

    public void restoreHealth(){
        Random rand = new Random();
        int chance;
        if (maxHealth >= 5 && maxHealth <10){
            chance = rand.nextInt(10) + 1;
            if (chance <= 3){
                health += 2;
                System.out.println("+2 health");
            }
            else{
                health++;
                System.out.println("+1 health");

            }

            //to make sure that they can't overheal
            if (health < maxHealth){
                health = maxHealth;
            }

        }
        else if (magic >= 10){
            chance = rand.nextInt(10) + 1;
            if (chance <= 2){
                health += 4;
                System.out.println("+4 health");
            }
            else{
                health += 2;
                System.out.println("+2 health");
            }

            // make sure that they can't overheal
            if (health < maxHealth){
                health = maxHealth;
            }
        }
    }

    public int getPhysicalAttack() {
        Random rand = new Random();
        int chance;
        if (strength <= 5){
            chance = rand.nextInt(10) + 1;
            if (chance <= 2){
                attack = 2;
            }
            else{
                attack = 1;
            }
        }
        else if (strength > 5 && strength <10){
            chance = rand.nextInt(10) + 1;
            if (chance <= 4){
                attack = 2;
            }
            else{
                attack = 1;
            }
        }
        else if (strength >= 10){
            chance = rand.nextInt(10) + 1;
            if (chance <= 2){
                attack = 4;
            }
            else{
                attack = 2;
            }
        }
        return attack;
    }

    public int getMagicAttack() {
        Random rand = new Random();
        int chance;
        if (magic <= 5){
            chance = rand.nextInt(10) + 1;
            if (chance <= 2){
                attack = 2;
            }
            else{
                attack = 1;
            }
        }
        else if (magic > 5 && magic <10){
            chance = rand.nextInt(10) + 1;
            if (chance <= 4){
                attack = 2;
            }
            else{
                attack = 1;
            }
        }
        else if (magic >= 10){
            chance = rand.nextInt(10) + 1;
            if (chance <= 2){
                attack = 4;
            }
            else{
                attack = 2;
            }
        }
        return attack;
    }

}

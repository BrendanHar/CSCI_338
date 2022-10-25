package Project1.MyGame;

public class RunningState implements State{
    private Character myCharacter;

    public RunningState(Character m){
        myCharacter = m;
    }

    @Override
    public void dodge() {
        System.out.println("dodging");
        myCharacter.setState(myCharacter.getDodgingState());
    }

    @Override
    public void run() {
        System.out.println("running");
    }

    @Override
    public void crouch() {
        System.out.println("cannot crouch while running");
    }

    @Override
    public void die() {
        System.out.println("You've Died.");
        myCharacter.setState(myCharacter.getDeathState());
    }

    @Override
    public void stop() {
        System.out.println("Stopped running.");
        myCharacter.setState(myCharacter.getIdle());
    }

    @Override
    public void heal() {
        if (myCharacter.getHealth() < myCharacter.getMaxHealth()){
            System.out.println("You've healed for 1 health.");
            myCharacter.restoreHealth();
        }
        else if (myCharacter.getHealth() >= myCharacter.getMaxHealth()){
            System.out.println("You are already max health (" + myCharacter.getMaxHealth() +").");
        }
    }

    @Override
    public void slash() {
        if (myCharacter.getAgility() >= 10){
            System.out.println("You've attacked for " + myCharacter.getPhysicalAttack() +" damage.");
        }
        else {
            System.out.println("You are not Agile enough to attack while running.");
        }
    }

    @Override
    public void fireball() {
        if (myCharacter.getAgility() >= 10){
            System.out.println("You've attacked for " + myCharacter.getMagicAttack() +" damage.");
        }
        else {
            System.out.println("You are not Agile enough to attack while running.");
        }
    }
}

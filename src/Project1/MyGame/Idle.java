package Project1.MyGame;

public class Idle implements State{

    private Character myCharacter;

    public Idle(Character m){
        myCharacter = m;
    }

    @Override
    public void dodge() {
        System.out.println("Dodged!");
        myCharacter.setState(myCharacter.getDodgingState());
    }

    @Override
    public void run() {
        System.out.println("Started running!");
        myCharacter.setState(myCharacter.getRunningState());
    }

    @Override
    public void crouch() {
        System.out.println("Crouched");
        myCharacter.setState(myCharacter.getCrouchState());
    }

    @Override
    public void die() {
        System.out.println("You've Died.");
        myCharacter.setState(myCharacter.getDeathState());

    }

    @Override
    public void stop() {
        System.out.println("You are have stopped already.");
    }

    @Override
    public void heal() {
        if (myCharacter.getHealth() < myCharacter.getMaxHealth()){
            myCharacter.restoreHealth();
        }
        else if (myCharacter.getHealth() >= myCharacter.getMaxHealth()){
            System.out.println("You are already max health (" + myCharacter.getMaxHealth() +").");
        }
    }

    @Override
    public void slash() {
        System.out.println("You've attacked for " + myCharacter.getPhysicalAttack() +" damage.");

    }

    @Override
    public void fireball() {
        System.out.println("You've attacked for " + myCharacter.getMagicAttack() +" damage.");
    }
}

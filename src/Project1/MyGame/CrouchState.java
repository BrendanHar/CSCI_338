package Project1.MyGame;

public class CrouchState implements State{
    Character myCharacter;

    public CrouchState(Character m){
        myCharacter = m;
    }

    @Override
    public void dodge() {
        System.out.println("Can't dodge while crouching");
    }

    @Override
    public void run() {
        System.out.println("Can't run while crouching");
    }

    @Override
    public void crouch() {
        System.out.println("crouching");
    }

    @Override
    public void die() {
        System.out.println("You've Died.");
        myCharacter.setState(myCharacter.getDeathState());
    }

    @Override
    public void stop() {
        System.out.println("You've stood up.");
        myCharacter.setState(myCharacter.getIdle());
    }

    @Override
    public void heal() {
        if (myCharacter.getHealth() < 5){
            System.out.println("You've healed for 1 health.");
            myCharacter.restoreHealth();
        }
        else if (myCharacter.getHealth() >= 5){
            System.out.println("You are already max health (5).");
        }
    }

    @Override
    public void slash() {
        System.out.println("Can't attack while crouching");
    }

    @Override
    public void fireball() {
        System.out.println("Can't attack while crouching");
    }
}

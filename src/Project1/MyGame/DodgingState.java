package Project1.MyGame;

public class DodgingState implements State{
    private Character myCharacter;

    public DodgingState(Character m){
        myCharacter = m;
    }

    @Override
    public void dodge() {
        System.out.println("Keep dodging!");
    }

    @Override
    public void run() {
        System.out.println("Started running!");
        myCharacter.setState(myCharacter.getRunningState());
    }

    @Override
    public void crouch() {
        System.out.println("You're dodging. You can't crouch");
    }

    @Override
    public void die() {
        System.out.println("You've Died");
        myCharacter.setState(myCharacter.getDeathState());
    }

    @Override
    public void stop() {
        System.out.println("You've stopped dodging");
        myCharacter.setState(myCharacter.getIdle());
    }
    @Override
    public void heal() {
        System.out.println("You can't heal while dodging.");
    }

    @Override
    public void slash() {
        if (myCharacter.getAgility() >=10){
            System.out.println("Agility is high enough to start attacking! You've attacked for " + myCharacter.getPhysicalAttack() + " damage.");
        }
        else{
            System.out.println("You are not Agile enough to attack while dodging.");

        }
    }

    @Override
    public void fireball() {
        if (myCharacter.getAgility() >= 10){
            System.out.println("You've attacked for " + myCharacter.getMagicAttack() +" damage.");
        }
        else {
            System.out.println("You are not Agile enough to attack while dodging.");
        }
    }
}

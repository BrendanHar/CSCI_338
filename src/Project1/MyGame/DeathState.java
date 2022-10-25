package Project1.MyGame;

public class DeathState implements State{
    private Character myCharacter;
    public DeathState(Character m){
        myCharacter = m;
    }

    @Override
    public void dodge() {
        System.out.println("You can't dodge. You are dead. enter restart to restart.");
    }

    @Override
    public void run() {
        System.out.println("You can't run. You are dead. enter restart to restart.");

    }

    @Override
    public void crouch() {
        System.out.println("You can't crouch. You are dead. enter restart to restart.");
    }

    @Override
    public void die() {
    }

    @Override
    public void stop() {
        System.out.println("You can't stop. You are dead. enter restart to restart.");
    }

    @Override
    public void heal() {
        System.out.println("You can't heal. You are dead. enter restart to restart.");
    }

    @Override
    public void slash() {
        System.out.println("You can't attack. You are dead. enter restart to restart.");
    }

    @Override
    public void fireball() {
        System.out.println("You can't attack. You are dead. enter restart to restart.");
    }

}

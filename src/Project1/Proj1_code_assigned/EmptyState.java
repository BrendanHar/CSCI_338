package Project1.Proj1_code_assigned;

public class EmptyState implements State{

    private GumballMachine gumballMachine;
    private boolean quarterCheck = false;

    public EmptyState(GumballMachine m){
        gumballMachine = m;
    }


    @Override
    public void insertQuarter() {
        if (quarterCheck == false){
            System.out.println("Gumball machine is empty probably shouldn't put a quarter in");
            quarterCheck = true;
        }
        else if (quarterCheck == true){
            System.out.println("There is already a quarter in the empty machine.");
        }
    }

    @Override
    public void removeQuarter() {
        if (quarterCheck == false){
            System.out.println("There is no quarter to remove");
        }
        else if(quarterCheck == true){
            System.out.println("Phew, you saved your quarter! That gumball machine was empty");
            quarterCheck = false;
        }
    }

    @Override
    public void turnCrank() {
        if (quarterCheck == false){
            System.out.println("Nothing happening, bro");
        }
        else if(quarterCheck == true){
            System.out.println("Gumball Machine is empty. Haha! You lost your quarter");
            quarterCheck = false;
        }
    }


    @Override
    public void refillGumballMachine(int num){
        if (quarterCheck == false){
            System.out.println("Gumball Machine refilled with " + num + " gumballs! Now you can put fresh quarters in to get new gumballs.");
            gumballMachine.setGumballCount(num);
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        else if (quarterCheck == true){
            System.out.println("Gumball Machine refilled with " + num + " gumballs! Turn the crank to get your gumballs.");
            gumballMachine.setGumballCount(num);
            gumballMachine.setState(gumballMachine.getHasQuarterState());
        }

    }
}

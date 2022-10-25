package Project1.Proj1_code_assigned;

/**
 *
 * @author yaw
 */
public class NoQuarterState implements State{
    
    private GumballMachine gumballMachine;
    
    public NoQuarterState(GumballMachine m) {
        gumballMachine = m;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter inserted");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void removeQuarter() {
        System.out.println("No quarter to remove");
    }

    @Override
    public void turnCrank() {
        System.out.println("Nothing happening, bro");
    }

    @Override
    public void refillGumballMachine(int num) {
        int gumballCount;
        gumballCount = gumballMachine.getGumballCount() + num;
        System.out.println("You added " + num + " gumballs to the gumball Machine! There are now " + gumballCount + " gumballs in the machine.");
        gumballMachine.setGumballCount(gumballCount);
    }


}

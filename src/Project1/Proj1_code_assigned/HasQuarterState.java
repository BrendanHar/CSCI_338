package Project1.Proj1_code_assigned;

/**
 *
 * @author yaw
 */
public class HasQuarterState implements State {

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine m) {
        gumballMachine = m;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Already a quarter inserted");
    }

    @Override
    public void removeQuarter() {
        System.out.println("Quarter removed");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        if (gumballMachine.getGumballCount() == 1){
            System.out.println("Last Gumball Delivered!");
            gumballMachine.setGumballCount(gumballMachine.getGumballCount()-1);
            gumballMachine.setState(gumballMachine.getEmptyState());
        }
        else if (gumballMachine.getGumballCount() == 0){
            System.out.println("No gumballs");
            gumballMachine.getEmptyState();
        }
        else {
            System.out.println("Gumball Delivered!");
            gumballMachine.setState(gumballMachine.getNoQuarterState());
            gumballMachine.setGumballCount(gumballMachine.getGumballCount()-1);
        }

    }

    @Override
    public void refillGumballMachine(int num) {
        int gumballCount;
        gumballCount = gumballMachine.getGumballCount() + num;
        System.out.println("You added " + num + " gumballs to the gumball Machine! There are now " + gumballCount + " gumballs in the machine.");
        gumballMachine.setGumballCount(gumballCount);
    }


}

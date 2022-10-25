package Project1.Proj1_code_assigned;

/**
 *
 * @author yaw
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine();
        
        gumballMachine.turnCrank();
        gumballMachine.removeQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.turnCrank();
        System.out.println("Gumball Count: " + gumballMachine.getGumballCount());
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.refillGumballMachine(10);
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("Gumball Count: " + gumballMachine.getGumballCount());
        gumballMachine.refillGumballMachine(2);

    }
}

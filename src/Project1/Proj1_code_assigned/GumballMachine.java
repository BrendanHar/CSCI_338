package Project1.Proj1_code_assigned;

/**
 *
 * @author yaw
 */
public class GumballMachine {
    //private instance variables for each possible state
    private State hasQuarterState;
    private State noQuarterState;
    private State emptyState;
    
    //current state the machine is in
    private State currentState;

    //private variable to track number of gumballs
    private int gumballCount;
    
    public GumballMachine() {
        //initialize possible state instance variables
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        emptyState = new EmptyState(this);
        gumballCount = 2;
        
        //set initial current state
        currentState = noQuarterState;
    }
    
    public void setState(State state) {
        this.currentState = state;
    }

    public State getState(){return currentState;}

    public void setGumballCount(int num){
        gumballCount = num;
    }

    public int getGumballCount(){return gumballCount;}
    public State getHasQuarterState() {
        return hasQuarterState;
    }
    
    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getEmptyState(){return emptyState;}
    
    public void insertQuarter() {
        currentState.insertQuarter();
    }
    
    public void removeQuarter() {
        currentState.removeQuarter();
    }
    
    public void turnCrank() {
            currentState.turnCrank();
    }

    public void refillGumballMachine(int num){
        currentState.refillGumballMachine(num);
        setState(noQuarterState);
    }

}

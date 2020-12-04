package moneyCalculator.control;

public interface Command {
    String name();
    void execute();
}
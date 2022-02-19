package Command;

public class StopFanCommand implements ICommand {
    Fan fan;
    public StopFanCommand(Fan fan) {
        super();
        this.fan = fan;
    }
    public void execute() {
        System.out.println("Stopping fan...");
        fan.stop();
    }
}

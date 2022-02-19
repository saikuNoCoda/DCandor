package Command;

public class StartFanCommand implements ICommand {
    Fan fan;
    public StartFanCommand(Fan fan) {
        super();
        this.fan = fan;
    }
    public void execute() {
        System.out.println("Starting fan...");
        fan.start();
    }
}

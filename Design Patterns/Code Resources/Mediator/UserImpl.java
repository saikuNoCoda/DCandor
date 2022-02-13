package Mediator;

public class UserImpl extends User {

    public UserImpl(ChatMediator mediator, String user) {
        super(mediator, user);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": sending Message = " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": receive Message = " + msg);
    }
}

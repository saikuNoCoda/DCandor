package Mediator;

import java.util.ArrayList;
import java.util.List;

// Acts as a Concrete Mediator.
public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;
    
    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : this.users) {
            if (u != user) {
                u.receive(msg);
            }
        }
    }
}

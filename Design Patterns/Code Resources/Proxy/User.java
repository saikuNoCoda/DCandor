package Proxy;

public class User {
    private String name;
    private String username;
    private int role;

    public User (String name, String username, int role) {
        System.out.println("Signup and logging... user " + name + "\n");
        this.name = name;
        this.username = username;
        this.role = role;
    }

    int getRole() {
        return role;
    }

    String getUsername() {
        return username;
    }
}
